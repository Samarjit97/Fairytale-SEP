import model.*;
import utils.ModelManagement;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
      /*  model.Items items=new model.Items("samanjit", "singh");
        items=new model.Book(1387873,"YO BABY","SINGH");
        items=new model.Article("Plural","Yo Baby", "Singh");

        System.out.println(items.toString());
        */


/*


 */


        Date startDate=new Date(12,10,2022);
        Date EndDate=new Date(23,12,2022);
        Date one=new Date(1,1,2022);
        Date two=new Date(2,2,2022);
        Book book=new Book(18287,"kjsdhfshf","nxfnlsdk");
        Book samr=new Book(627462,"Paradox","Samarjit");
        Book citron=new Book(627462,"Citron","Samarjit");
        Book alnok=new Book(627462,"Alnok","Samarjit");
        Book Cetrazen=new Book(734723,"Cetrazen","Samarjit ");
        Article article=new Article("jfjshf","nhskfhsh","nsfnsdfj");
        Borrower samar=new Borrower("samanjit","sas@gmail.com",6575775,"student");





        ItemsList itemsList = new ItemsList();
        itemsList.addArticle(article);
        itemsList.addBook(book);
        itemsList.addBook(samr);
        itemsList.addBook(citron);
        itemsList.addBook(alnok);


//        new ModelManagement().saveItems(itemsList);
        System.out.println(itemsList.getAllArticles().get(0));

        System.out.println(new ModelManagement().getAllArticleItems());
       // System.out.println(new ModelManagement().addBook(Cetrazen));
        System.out.println(new ModelManagement().getAllItemList());

        Reservation reservation=new Reservation(startDate,EndDate,samar,Cetrazen);
        System.out.println(new ModelManagement().getAllReservationList());




    }
}
