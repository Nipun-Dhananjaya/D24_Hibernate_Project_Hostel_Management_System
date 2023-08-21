package com.d24hostels.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardFormController implements Initializable {
    public AnchorPane root;
    public Label lblTitle;
    public AnchorPane context;
    public JFXButton btnHome;
    public JFXButton btnStudent;
    public JFXButton btnRooms;
    public JFXButton btnPayments;
    public JFXButton btnAccount;

    @SneakyThrows
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/HomeForm.fxml")));
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        lblTitle.setText("Home");
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/HomeForm.fxml")));
    }

    public void btnStudentOnAction(ActionEvent actionEvent) throws IOException {
        lblTitle.setText("Students");
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/StudentForm.fxml")));
    }

    public void btnRoomsOnAction(ActionEvent actionEvent) throws IOException {
        lblTitle.setText("Rooms");
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/RoomForm.fxml")));
    }

    public void btnPaymentsOnAction(ActionEvent actionEvent) throws IOException {
        lblTitle.setText("Payments");
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/PaymentForm.fxml")));
    }

    public void btnAccessoriesOnAction(ActionEvent actionEvent) throws IOException {
    }

    public void btnAccountOnAction(ActionEvent actionEvent) throws IOException {
        lblTitle.setText("Account");
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource("/view/AccountForm.fxml")));
    }
}
