import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
      /*  Items items=new Items("samanjit", "singh");
        items=new Book(1387873,"YO BABY","SINGH");
        items=new Article("Plural","Yo Baby", "Singh");

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
        Article article=new Article("jfjshf","nhskfhsh","nsfnsdfj");





        Borrower samar=new Borrower("samanjit singh","sam@gmail.com",12238,"Student");
        samar.addArticle(article);
        samar.addBook(book);
        samar.addBook(citron);
        samar.addBook(samr);

        Reservation reservation=new Reservation(startDate,EndDate,samar);
        System.out.println(reservation.getBorrower());


        System.out.println(reservation.getBorrower().getBook(2));

        System.out.println(reservation.getStartDate());
        System.out.println(reservation.getEndDate());




















    }
}
