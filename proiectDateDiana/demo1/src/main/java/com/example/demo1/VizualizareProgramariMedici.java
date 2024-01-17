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

public class VizualizareProgramariMedici {


    @FXML
    private Button inapoiProgramari;

    @FXML
    private TableView<DateProgramari> tabelProgramariMedici;

    @FXML
    private TableColumn<DateProgramari, String> nume;

    @FXML
    private TableColumn<DateProgramari, String> prenume;

    @FXML
    private TableColumn<DateProgramari, String> data;

    @FXML
    private TableColumn<DateProgramari, String> ora;



    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) inapoiProgramari.getScene().getWindow();
        stage.close();
    }

    private int id;
    public void setID(int id) throws SQLException {
        this.id=id;
        dateTabelProgramariMedici(id);
    }

    ObservableList<DateProgramari> listP= FXCollections.observableArrayList();

    public void dateTabelProgramariMedici(int id) throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String getData = "SELECT u_pacient.nume, u_pacient.prenume , p.Data_Programare, p.Ora_Programare FROM utilizatori u_medic JOIN programari p ON u_medic.ID_Utilizator = p.ID_Medic JOIN utilizatori u_pacient ON p.ID_Pacient = u_pacient.ID_Utilizator WHERE u_medic.ID_Utilizator = ?";


        try (PreparedStatement preparedStatement = connectDB.prepareStatement(getData)) {
           // for(int i=1; i<150; i++) {
                preparedStatement.setInt(1, id); // Setăm valoarea pentru parametrul ID_Utilizator

                try (ResultSet result2 = preparedStatement.executeQuery()) {

                    while (result2.next()) {
                        String userNume = result2.getString("Nume");
                        String userPrenume = result2.getString("Prenume");
                        String userData = result2.getString("Data_Programare");
                        String userOra = result2.getString("Ora_Programare");
                        listP.add(new DateProgramari(userNume, userPrenume, userData, userOra));
                    }

                    nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
                    prenume.setCellValueFactory(new PropertyValueFactory<>("prenume"));
                    data.setCellValueFactory(new PropertyValueFactory<>("data"));
                    ora.setCellValueFactory(new PropertyValueFactory<>("ora"));


                    tabelProgramariMedici.setItems(listP);

                } catch (SQLException e) {
                    Logger.getLogger(DateProgramari.class.getName()).log(Level.SEVERE, null, e);
                    e.printStackTrace();
                }

            }
       // }
    }
}