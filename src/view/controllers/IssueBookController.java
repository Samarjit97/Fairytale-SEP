package view.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class IssueBookController{
    @FXML
    private DatePicker startDate;
    @FXML
    private  DatePicker endDate;






    public void getDate(ActionEvent event){
        LocalDate start=startDate.getValue();
        LocalDate end=endDate.getValue();

    }


    public void getStartDate(javafx.event.ActionEvent event) {

    }

    public void getEndDate(javafx.event.ActionEvent event) {
    }
}
