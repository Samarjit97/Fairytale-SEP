package view.controllers;

import javafx.fxml.FXML;
import model.ItemsList;
import utils.ModelManagement;

import java.awt.*;

public class GUIController {
    @FXML private Button addBook;
    @FXML private Button removeBook;
    @FXML private Button addArticle;
    @FXML private Button removeArticle;
private ModelManagement modelManagement;

    public void initializer(){
        modelManagement=new ModelManagement();

    }


    public void createBook(){

    }

}
