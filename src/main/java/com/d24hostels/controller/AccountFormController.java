package com.d24hostels.controller;

import com.d24hostels.bo.BOFactory;
import com.d24hostels.bo.custom.UserBo;
import com.d24hostels.dto.UserDto;
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
    UserBo userBo= (UserBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.USER);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        try {
            UserDto userDto = userBo.searchUser(txtUserName.getText());
            if (userDto.getPassword().equals(txtPassword)){
                new Alert(Alert.AlertType.INFORMATION, "Login Successfully!").showAndWait();
                resetPage();
            }else{
                new Alert(Alert.AlertType.INFORMATION, "Password is incorrect!").showAndWait();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void checkBxShowPwdOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}
