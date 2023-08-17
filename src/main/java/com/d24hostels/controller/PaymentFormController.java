package com.d24hostels.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaymentFormController {
    public JFXComboBox cmbSId;
    public TableView tblPayment;
    public TableColumn colPayId;
    public TableColumn colStudentId;
    public TableColumn colStudentName;
    public TableColumn colPaidDateTime;
    public TableColumn colPaidAmount;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colCompleted;

    public void cmbRoomTypeOnAction(ActionEvent actionEvent) {
    }
}
