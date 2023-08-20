package com.d24hostels.controller;

import com.d24hostels.bo.BOFactory;
import com.d24hostels.bo.custom.PriceBo;
import com.d24hostels.bo.custom.UniversityBo;
import com.d24hostels.dto.PriceDto;
import com.d24hostels.dto.UniversityDto;
import com.jfoenix.controls.JFXComboBox;
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

public class AccessoriesFormController implements Initializable {
    public JFXTextField txtRoomType;
    public AnchorPane context;
    public Button btnSavePrice;
    public Button btnUpdate;
    public JFXTextField txtNewPrice;
    public Button btnSaveUniversity;
    public JFXTextField txtUniversity;
    public JFXTextField txtRoomTypeId;
    public JFXTextField txtPackage;
    public JFXComboBox cmbId;
    PriceBo priceBo= (PriceBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.PRICE);
    UniversityBo universityBo= (UniversityBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.UNIVERSITY);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> observableList= FXCollections.observableArrayList();
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
        cmbId.setItems(observableList);
    }

    public void btnSavePriceOnAction(ActionEvent actionEvent) {
        try {
            priceBo.savePrice(new PriceDto(txtRoomTypeId.getText(),txtRoomType.getText(),Double.parseDouble(txtNewPrice.getText()),null));
            new Alert(Alert.AlertType.INFORMATION, "Package Saved Successfully!").showAndWait();
            resetPage();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
        }
    }

    private void resetPage() {
        txtRoomTypeId.clear();
        txtRoomType.clear();
        txtNewPrice.clear();
        txtRoomType.setDisable(false);
        txtRoomTypeId.setDisable(false);
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            PriceDto priceDto=priceBo.searchPrice(txtRoomTypeId.getText());
            priceBo.updatePrice(new PriceDto(txtRoomTypeId.getText(),priceDto.getRoomType(),Double.parseDouble(txtNewPrice.getText()),null));
            new Alert(Alert.AlertType.INFORMATION, "Package Updated Successfully!").showAndWait();
            resetPage();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void btnSaveUniversityOnAction(ActionEvent actionEvent) {
        try {
            universityBo.saveUniversity(new UniversityDto(txtUniversity.getText()));
            new Alert(Alert.AlertType.INFORMATION, "University Saved Successfully!").showAndWait();
            txtUniversity.clear();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void cmbIdOnAction(ActionEvent actionEvent) {
        try {
            PriceDto priceDto = priceBo.searchPrice(String.valueOf(cmbId.getSelectionModel().getSelectedItem()));
            txtRoomTypeId.setText(priceDto.getTypeId());
            txtRoomType.setText(priceDto.getRoomType());
            txtRoomType.setDisable(true);
            txtRoomTypeId.setDisable(true);
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }
}
