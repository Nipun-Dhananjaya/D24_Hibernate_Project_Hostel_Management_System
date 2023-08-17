package com.d24hostels.controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class StudentFormController {
    public AnchorPane context;
    public JFXTextField txtSid;
    public JFXTextField txtSName;
    public JFXTextField txtSNic;
    public JFXTextField txtGuardianName;
    public JFXTextField txtContact;
    public JFXTextField txtEmail;
    public ToggleGroup keymoney;
    public JFXTextField txtAmount;
    public JFXComboBox cmbUniversity;
    public JFXComboBox cmbRoomType;
    public JFXComboBox cmbSelectedRoom;
    public JFXRadioButton rBtnPaid;
    public JFXRadioButton rBtnNotPaid;
    public JFXRadioButton rBtnMale;
    public ToggleGroup gender;
    public JFXRadioButton rBtnFeMale;
    public TableView tblStudent;
    public TableColumn colSid;
    public TableColumn colSName;
    public TableColumn colNic;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colGender;
    public TableColumn colUniversity;
    public TableColumn colRoomType;
    public TableColumn colRoomNo;
    public TableColumn colKeyMoney;
    public TableColumn colAmount;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public JFXCheckBox chckBxComplete;

    public void txtSidOnAction(ActionEvent actionEvent) {
    }

    public void txtSNameOnAction(ActionEvent actionEvent) {
    }

    public void txtAmountOnAction(ActionEvent actionEvent) {
    }

    public void txtEmailOnAction(ActionEvent actionEvent) {
    }

    public void txtCantactOnAction(ActionEvent actionEvent) {
    }

    public void txtGuardianNameOnAction(ActionEvent actionEvent) {
    }

    public void txtSNicOnAction(ActionEvent actionEvent) {
    }

    public void cmbUniversityOnAction(ActionEvent actionEvent) {
    }

    public void cmbRoomTypeOnAction(ActionEvent actionEvent) {
    }

    public void cmbSelectedRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }
}
