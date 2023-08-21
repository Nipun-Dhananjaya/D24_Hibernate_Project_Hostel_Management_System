package com.d24hostels.controller;

import com.d24hostels.bo.BOFactory;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AccountFormController implements Initializable {
    public AnchorPane context;
    public Button btnUpdate;
    public JFXTextField txtOldUserName;
    public Button btnSave;
    public Button btnDelete;
    public JFXTextField txtOldPwd;
    public JFXTextField txtNewPwd;
    public JFXPasswordField pwdFldNewPwd;
    public JFXTextField txtComNewPwd;
    public JFXPasswordField pwdFldComPwd;
    public JFXTextField txtNewUserName;
    public JFXCheckBox checkBxShowPwd;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*ObservableList<String> observableList= FXCollections.observableArrayList();
        List<String> strings=new ArrayList<>();
        List<PriceDto> priceDtos=new ArrayList<>();

        try {
            priceDtos=priceBo.getAllPrices();
            for (PriceDto priceDto : priceDtos) {
                strings.add(String.valueOf(priceDto.getTypeId()));
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
        for (String s:strings) {
            observableList.add(s);
        }
        cmbId.setItems(observableList);*/
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void checkBxShowPwdOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}
