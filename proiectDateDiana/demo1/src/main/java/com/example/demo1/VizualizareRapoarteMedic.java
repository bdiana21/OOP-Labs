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

public class VizualizareRapoarteMedic {

    @FXML
    private TableColumn<DateRapoarte,String> continut;

    @FXML
    private TableColumn<DateRapoarte,String> id_raport;

    @FXML
    private Button inapoiProgramari;

    @FXML
    private TableColumn<DateRapoarte,String> nume;

    @FXML
    private TableColumn<DateRapoarte,String> prenume;

    @FXML
    private TableView<DateRapoarte> raportPacient;

    public void cancelButtonOnAction(ActionEvent e){
        Stage stage= (Stage) inapoiProgramari.getScene().getWindow();
        stage.close();
    }

    private int id;
    public void setID(int id) throws SQLException {
        this.id=id;
        dateTabelRapoarteMedici(id);
    }

    ObservableList<DateRapoarte> listP= FXCollections.observableArrayList();

    public void dateTabelRapoarteMedici(int id) throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String getData = "SELECT u_pacient.nume, u_pacient.prenume , r.Continut, r.ID_Raport FROM utilizatori u_medic JOIN rapoartemedicale r ON u_medic.ID_Utilizator = r.ID_Medic JOIN programari p ON p.ID_Programare = r.ID_Programare JOIN utilizatori u_pacient ON p.ID_Pacient = u_pacient.ID_Utilizator WHERE u_medic.ID_Utilizator = ?";


        try (PreparedStatement preparedStatement = connectDB.prepareStatement(getData)) {
           // for(int i=1;i<150;i++) {

                preparedStatement.setInt(1, id); // Setăm valoarea pentru parametrul ID_Utilizator

                try (ResultSet result2 = preparedStatement.executeQuery()) {

                    while (result2.next()) {
                        String userNume = result2.getString("Nume");
                        String userPrenume = result2.getString("Prenume");
                        String userContinut = result2.getString("Continut");
                        String userIdRaport = result2.getString("ID_Raport");
                        listP.add(new DateRapoarte(userNume, userPrenume, userContinut, userIdRaport));
                    }

                    nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
                    prenume.setCellValueFactory(new PropertyValueFactory<>("prenume"));
                    continut.setCellValueFactory(new PropertyValueFactory<>("continut"));
                    id_raport.setCellValueFactory(new PropertyValueFactory<>("raport"));


                    raportPacient.setItems(listP);

                } catch (SQLException e) {
                    Logger.getLogger(DateRapoarte.class.getName()).log(Level.SEVERE, null, e);
                    e.printStackTrace();
                }
            //}

        }
    }

}
