package com.d24hostels.controller;

import com.d24hostels.bo.BOFactory;
import com.d24hostels.bo.custom.ReservationBo;
import com.d24hostels.bo.custom.PriceBo;
import com.d24hostels.bo.custom.RoomBo;
import com.d24hostels.bo.custom.StudentBo;
import com.d24hostels.dto.*;
import com.d24hostels.dto.tm.ReservationTM;
import com.d24hostels.dto.tm.StudentTM;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

public class ReservationFormController implements Initializable {
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
    public JFXComboBox cmbRoomType;
    public JFXComboBox cmbSelectedRoom;
    public JFXRadioButton rBtnPaid;
    public ToggleGroup keymoney;
    public JFXRadioButton rBtnNotPaid;
    public JFXTextField txtAmount;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    ReservationBo reservationBo= (ReservationBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.RESERVATION);
    PriceBo priceBo= (PriceBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.PRICE);
    RoomBo roomBo= (RoomBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.ROOMS);
    StudentBo studentBo= (StudentBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.STUDENT);
    ObservableList<ReservationTM> observableList= FXCollections.observableArrayList();
    ObservableList<String> obList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getAllStudents();
        getAllRoomTypes();
        getAllReservations();
        setCellValueFactory();
    }

    private void getAllStudents() {
        try {
            obList.clear();
            List<StudentDto> studentDtos = studentBo.getAllStudents();
            if (studentDtos!=null){
                for (StudentDto studentDto : studentDtos) {
                    obList.add(
                            studentDto.getSid()
                    );
                }
                cmbSId.setItems(obList);
            }else{
                new Alert(Alert.AlertType.INFORMATION, "Students not found!").showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getAllRoomTypes() {
        ObservableList<String> observableList= FXCollections.observableArrayList();
        try {
            List<PriceDto> priceDtos=priceBo.getAllPrices();
            for (PriceDto priceDto : priceDtos) {
                observableList.add(String.valueOf(priceDto.getRoomType()));
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
        cmbRoomType.setItems(observableList);
    }

    private void setCellValueFactory() {
        colPayId.setCellValueFactory(new PropertyValueFactory<>("payId"));
        colStudentId.setCellValueFactory(new PropertyValueFactory<>("stId"));
        colStudentName.setCellValueFactory(new PropertyValueFactory<>("stName"));
        colPaidDateTime.setCellValueFactory(new PropertyValueFactory<>("payDateTime"));
        colPaidAmount.setCellValueFactory(new PropertyValueFactory<>("payAmount"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colCompleted.setCellValueFactory(new PropertyValueFactory<>("keyMoneyCompleted"));
    }

    private void getAllReservations() {
        try {
            /*observableList.clear();
            List<ReservationDto> allReservations = reservationBo.getAllReservations();
            if (reservationTmDtos!=null){
                for (ReservationTmDto reservationDto : reservationTmDtos) {
                    observableList.add(
                            new ReservationTM(
                                    reservationDto.getPayId(),
                                    reservationDto.getStId(),
                                    reservationDto.getStName(),
                                    reservationDto.getPayDateTime(),
                                    reservationDto.getPayAmount(),
                                    reservationDto.getRoomNo(),
                                    reservationDto.getRoomType(),
                                    reservationDto.getKeyMoneyCompleted()
                            )
                    );
                }
                tblPayment.setItems(observableList);
            }else{
                new Alert(Alert.AlertType.INFORMATION, "Payments not found!").showAndWait();
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cmbSIdOnAction(ActionEvent actionEvent) {
    }

    public void cmbRoomTypeOnAction(ActionEvent actionEvent) {
        ObservableList<String> roomNoList=FXCollections.observableArrayList();
        try {
            List<RoomDto> availableRooms = roomBo.getAvailableRooms();
            for (RoomDto availableRoom : availableRooms) {
                if (availableRoom.getPriceDto().getRoomType().equals(cmbRoomType.getSelectionModel().getSelectedItem())){
                    roomNoList.add(availableRoom.getRoomNo());
                }else{
                    continue;
                }
            }
            if (roomNoList.isEmpty()){
                new Alert(Alert.AlertType.INFORMATION, "No Available rooms in selected Type!").showAndWait();
            }else{
                cmbSelectedRoom.setItems(roomNoList);
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void cmbSelectedRoomOnAction(ActionEvent actionEvent) {
    }

    public void txtAmountOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        try {
            StudentDto studentDto = studentBo.searchStudents(String.valueOf(cmbSId.getSelectionModel().getSelectedItem()));
            RoomDto roomDto = roomBo.searchRoom(String.valueOf(cmbSelectedRoom.getSelectionModel().getSelectedItem()));
            roomDto.setAvailability("Filled");
            reservationBo.saveReservation(new ReservationDto(
                    0,
                    LocalDate.now(),
                    Double.parseDouble(txtAmount.getText()),
                    roomDto,
                    studentDto
            ));
            new Alert(Alert.AlertType.INFORMATION, "Reservation Saved Successfully!").showAndWait();
            resetPage();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        try {
            StudentDto studentDto = studentBo.searchStudents(String.valueOf(cmbSId.getSelectionModel().getSelectedItem()));
            RoomDto roomDto = roomBo.searchRoom(String.valueOf(cmbSelectedRoom.getSelectionModel().getSelectedItem()));
            roomDto.setAvailability("Filled");
            reservationBo.updateReservation(new ReservationDto(
                    0,
                    LocalDate.now(),
                    Double.parseDouble(txtAmount.getText()),
                    roomDto,
                    studentDto
            ));
            new Alert(Alert.AlertType.INFORMATION, "Reservation Update Successfully!").showAndWait();
            resetPage();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            e.printStackTrace();
        }
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    private void resetPage() {
        cmbSId.setValue("Search Student");
        cmbRoomType.setValue("Room Type");
        cmbSelectedRoom.setValue("Selected Room");
        txtAmount.clear();
        getAllReservations();
        setCellValueFactory();
    }
}