package view.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Book;
import utils.ModelManagement;
import view.AlertBox;

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


    public void initialize() {
        modelManagement = new ModelManagement();
        initializeTable();
    }


    private void initializeTable() {
        isbnCol.setCellValueFactory(new PropertyValueFactory("isbn"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));

        updateTableGUI();


    }

    @FXML
    private void reservePressed() {

    }

    @FXML
    private void searchPressed() {

        tableView.setItems(FXCollections.observableList(modelManagement.searchBooksByTitle(titleInp.getText().trim())));

    }

    @FXML
    private void RemoveBookButton(ActionEvent event) {

        Book selectedBookFromGUI = tableView.getSelectionModel().getSelectedItem();
        if (selectedBookFromGUI==null){
            AlertBox.display("Select a book to remove");
            return;
        }
        modelManagement.removeBook(selectedBookFromGUI);
        AlertBox.display("Book removed successfully");
        updateTableGUI();


    }

    private void updateTableGUI(){
        tableView.setItems(FXCollections.observableList(modelManagement.getAllBookItems()));
    }
}
