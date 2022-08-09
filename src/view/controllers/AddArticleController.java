package view.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Article;
import model.Book;
import model.ItemsList;
import utils.ModelManagement;

import java.awt.*;

public class AddArticleController {
    @FXML
    private TextField titleText;
    @FXML
    private TextField authorText;
    @FXML
    private TextField magazineText;
    @FXML
    private Button myButton;

    private ModelManagement modelManagement;
    private Controller controller;



    private ItemsList itemsList;
    public void initialize(){
        modelManagement=new ModelManagement();

        itemsList = new ItemsList();
        controller = new Controller();


    }

    private void initializeArticle(){

        String title=titleText.getText();
        String magazine= magazineText.getText();
        String author=authorText.getText();
        modelManagement.addArticle(new Article(magazine, title, author));

    }
    @FXML
    private void SubmitArticle(ActionEvent event){
        initializeArticle();


    }

}
