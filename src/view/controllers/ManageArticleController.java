package view.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Article;
import model.Book;
import utils.ModelManagement;

public class ManageArticleController {
    @FXML
    private TableView<Article> tableView;
    @FXML
    private TableColumn<Article, String> authorCol;
    @FXML
    private TableColumn<Article, String> titleCol;
    @FXML
    private TableColumn<Article, String> magazineCol;

    @FXML
    private TextField titleInp;

    private ModelManagement modelManagement;

    public void initialize(){
        modelManagement = new ModelManagement();
        initializeTable();
    }


    private void initializeTable() {
        magazineCol.setCellValueFactory(new PropertyValueFactory("magazine"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));

        tableView.setItems(FXCollections.observableList(modelManagement.getAllArticleItems()));

    }

    @FXML
    private void reservePressed(){

    }
    @FXML
    private void searchPressed(){

        tableView.setItems(FXCollections.observableList(modelManagement.searchArticleByTitle(titleInp.getText().trim())));

    }
}



