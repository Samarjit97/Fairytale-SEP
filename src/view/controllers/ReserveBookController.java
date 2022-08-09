package view.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.text.Text;
import model.Book;
import model.ItemsList;
import utils.ModelManagement;
import javafx.scene.control.TextField;

import java.awt.*;

public class ReserveBookController {

    TextField textField=new TextField();
    @FXML
    private TextField titleText;
    @FXML
    private TextField authorText;
    @FXML
    private TextField isbnText;
    @FXML
    private Button myButton;

    private ModelManagement modelManagement;
    private Controller controller;



    private  ItemsList itemsList;
    public void initialize(){
        modelManagement=new ModelManagement();
       itemsList = new ItemsList();
       controller = new Controller();


    }

    private void initializeBook(){

       String title=titleText.getText();
        int ISBN= Integer.parseInt(isbnText.getText());
        String author=authorText.getText();
       modelManagement.addBook(new Book(ISBN, title, author));

    }
    @FXML
    private void SubmitList(ActionEvent event){
        initializeBook();


    }





}
