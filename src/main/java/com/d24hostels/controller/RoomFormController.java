package com.d24hostels.controller;

import com.d24hostels.bo.BOFactory;
import com.d24hostels.bo.custom.RoomBo;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RoomFormController implements Initializable {
    public RadioButton rBtnAvailable;
    public ToggleGroup rooms;
    public RadioButton rBtnNotAvailable;
    public RadioButton rBtnAll;
    public TableView tblRoom;
    public TableColumn colRoomNo;
    public TableColumn colRoomId;
    public TableColumn colRoomType;
    public TableColumn colKeyMoney;
    public TableColumn colBedCount;
    public TableColumn colAvailability;
    public JFXTextField txtRoomNo;
    public JFXComboBox cmbRoomType;
    public JFXTextField txtKeyMoney;
    public JFXComboBox cmbBedCount;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    RoomBo roomBo= (RoomBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.ROOMS);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void rBtnAvailableOnAction(ActionEvent actionEvent) {
    }

    public void rBtnNotAvailableOnAction(ActionEvent actionEvent) {
    }

    public void rBtnAllOnAction(ActionEvent actionEvent) {
    }

    public void txtRoomNoOnAction(ActionEvent actionEvent) {
    }

    public void cmbRoomTypeOnAction(ActionEvent actionEvent) {
    }

    public void txtKeyMoneyOnAction(ActionEvent actionEvent) {
    }

    public void cmbBedCountOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }
}
