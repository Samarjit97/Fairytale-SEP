package view.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;
import utils.ModelManagement;


import java.awt.*;
import java.io.IOException;

public class Controller {
    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML private Button addBook;
    @FXML private Button removeBook;
    @FXML private Button addArticle;
    @FXML private Button removeArticle;
    @FXML private TextField createAuthorName;
    @FXML private TextField createTitle;
    @FXML private Spinner createISBN;









    private ModelManagement modelManagement;


    public void initialize(){
        modelManagement=new ModelManagement();

    }

    public void MangeBook(ActionEvent event){
        Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("../ManageBook.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void ManageArticle(ActionEvent event)  {
        Parent root= null;
        try {
            root = FXMLLoader.load(getClass().getResource("../ManageArticle.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

public void createBook(){
String authorName=createAuthorName.getText();
String title=createTitle.getText();
int ISBN= (int) createISBN.getValue();



}




}
