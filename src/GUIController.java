import javafx.fxml.FXML;

import java.awt.*;

public class GUIController {
    @FXML private Button addBook;
    @FXML private Button removeBook;
    @FXML private Button addArticle;
    @FXML private Button removeArticle;
private  ModelManagement modelManagement;

    public void initializer(){
        modelManagement=new ModelManagement("Reservation.bin","Items.bin");

    }


    public void createBook(){
  ItemsList book=modelManagement.getAllBookItems();






    }

}
