package com.d24hostels.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaymentFormController {
    public JFXComboBox cmbSId;
    public TableView tblPayment;
    public TableColumn colStudentId;
    public TableColumn colStudentName;
    public TableColumn colPaidAmount;
    public TableColumn colRoomType;
    public TableColumn colResId;
    public TableColumn colDate;
    public TableColumn colRoomTypeId;
    public TableColumn colStatus;
    public JFXRadioButton rBtnAll;
    public JFXRadioButton rBtnPaid;
    public JFXRadioButton rBtnRemaining;

    public void cmbRoomTypeOnAction(ActionEvent actionEvent) {
    }

    public void rBtnRemainingOnAction(ActionEvent actionEvent) {
    }

    public void rBtnAllOnAction(ActionEvent actionEvent) {
    }

    public void rBtnPaidOnAction(ActionEvent actionEvent) {
    }
}
