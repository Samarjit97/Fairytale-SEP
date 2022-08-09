package view.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Book;
import model.ItemsList;
import utils.ModelManagement;

import java.util.ArrayList;

public class ManageBookController {

    @FXML
    private TableView<Book> tableView;
    @FXML
    private TableColumn<Book, Integer> isbnCol;
    @FXML
    private TableColumn<Book, String> titleCol;
    @FXML
    private TableColumn<Book, String> authorCol;

    @FXML
    private TextField titleInp;

    private ModelManagement modelManagement;



    public void initialize(){
        modelManagement = new ModelManagement();
        initializeTable();
    }


    private void initializeTable() {
        isbnCol.setCellValueFactory(new PropertyValueFactory("isbn"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));

        tableView.setItems(FXCollections.observableList(modelManagement.getAllBookItems()));

    }

    @FXML
    private void reservePressed(){

    }
    @FXML
    private void searchPressed(){

        tableView.setItems(FXCollections.observableList(modelManagement.searchBooksByTitle(titleInp.getText().trim())));

    }
@FXML
    private void RemoveBookButton(ActionEvent event) {
    TableView.TableViewSelectionModel selectionModel =
            tableView.getSelectionModel();
    selectionModel.setSelectionMode(
            SelectionMode.SINGLE);
    ObservableList<Book> selectedItems =
            selectionModel.getSelectedItems();
    System.out.println(selectedItems.get(0).getIsbn());


    modelManagement.removeBook(selectedItems.get(0));
    }
}
