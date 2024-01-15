package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VizualizareProgramari
{
    private int id;
    public void setID(int id) throws SQLException {
        this.id=id;
        dateTabel(id);
    }

    @FXML
    private Button inapoiProgramari;

    @FXML
    private TableColumn<DateProgramari, ?> data;

    @FXML
    private TableColumn<DateProgramari, ?> medic;

    @FXML
    private TableColumn<DateProgramari, ?> ora;

    @FXML
    private TableView<DateProgramari> tabel;

    @FXML
    private TableColumn<DateProgramari, ?> tabelEmail;

    @FXML
    private TableColumn<DateProgramari, ?> tabelNume;

    @FXML
    private TableColumn<DateProgramari, ?> tabelPrenume;

    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) inapoiProgramari.getScene().getWindow();
        stage.close();
    }
    ObservableList<DateProgramari> listA= FXCollections.observableArrayList();
    public void dateTabel(int id) throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String getData = "select Nume, Prenume, Email, Telefon from programari where ID_Utilizator=?";

        try (PreparedStatement preparedStatement = connectDB.prepareStatement(getData)) {
            preparedStatement.setInt(1, id); // Setăm valoarea pentru parametrul ID_Utilizator

            try (ResultSet result2 = preparedStatement.executeQuery()) {

                while (result2.next()) {
                    String userNume = result2.getString("Nume");
                    String userPrenume = result2.getString("Prenume");
                    String userAdresa = result2.getString("Adresa");
                    String userOra = result2.getString("Ora");
                    String userData = result2.getString("Data");
                    listA.add(new DateProgramari(userNume, userPrenume, userAdresa, userOra, userData ));
                }

                tabelNume.setCellValueFactory(new PropertyValueFactory<>("nume"));
                tabelPrenume.setCellValueFactory(new PropertyValueFactory<>("prenume"));
                //telefon.setCellValueFactory(new PropertyValueFactory<>("data"));
                data.setCellValueFactory(new PropertyValueFactory<>("data"));
                ora.setCellValueFactory(new PropertyValueFactory<>("ora"));
                medic.setCellValueFactory(new PropertyValueFactory<>("medic"));


                tabel.setItems(listA);

            } catch (SQLException e) {
                Logger.getLogger(DatePersonale.class.getName()).log(Level.SEVERE, null, e);
                e.printStackTrace();
            }


        }
    }
}
