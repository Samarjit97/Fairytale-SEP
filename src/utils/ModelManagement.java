package utils;

import model.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModelManagement {
    private final String RESERVATION_FILENAME;
    private final String ITEMS_FILENAME;

    public ModelManagement() {
        RESERVATION_FILENAME = "Reservations.bin";
        ITEMS_FILENAME = "Items.bin";
    }


    public List<Book> getAllBookItems() {
        ItemsList allItemList = getAllItemList();
        return allItemList.getAllBooks();
    }


    public List<Article> getAllArticleItems() {

        ItemsList allItemList = getAllItemList();
        return allItemList.getAllArticles();

    }

    public List<Reservation> getAllReserveItem(){
        ReservationList allReserveItem=new ReservationList();
        return getAllReserveItem();

    }

    public ReservationList getAllReservationList(){
        ReservationList reservationList=new ReservationList();
        try {
            reservationList= (ReservationList) MyFileHandler.readFromBinaryFile(RESERVATION_FILENAME);
        } catch (IOException e) {
            throw new RuntimeException("IO Error reading file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return reservationList;
    }

    public ItemsList getAllItemList() {
        ItemsList itemsList = new ItemsList();
        try {
            itemsList = (ItemsList) MyFileHandler.readFromBinaryFile(ITEMS_FILENAME);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error reading file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
        return itemsList;
    }


    public void saveItems(ItemsList itemList) {
//        itemList.sortArticles();
        try {
            MyFileHandler.writeToBinaryFile(ITEMS_FILENAME, itemList);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error writing to file");
        }
    }


    public List<Book> searchBooksByTitle(String title) {
        List<Book> bookItems = getAllBookItems();
        List<Book> bookToReturn = new ArrayList<>();

        for (Book book : bookItems
        ) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())){
                bookToReturn.add(book);
            }
        }
        return bookToReturn;
    }
    public List<Article> searchArticleByTitle(String title) {
        List<Article> articleItems = getAllArticleItems();
        List<Article> articleToReturn = new ArrayList<>();

        for (Article article : articleItems
        ) {
            if (article.getTitle().toLowerCase().contains(title.toLowerCase())){
                articleToReturn.add(article);
            }
        }
        return articleToReturn;
    }

    public void addBook(Book book){
        ItemsList addBook=getAllItemList();
        addBook.addBook(book);
        saveItems(addBook);
    }
    public void addArticle(Article article){
        ItemsList addArticle=getAllItemList();
        addArticle.addArticle(article);
        saveItems(addArticle);
    }

    public void  removeBook(Book  book){
        ItemsList removeBookList = getAllItemList();


        removeBookList.removeBook(book);
        System.out.println("Succsfully deæeted");
        saveItems(removeBookList);

    }

}
