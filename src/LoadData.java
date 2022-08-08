import java.io.*;
import java.util.Scanner;

public class LoadData {
    public LoadData() {
    }



    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title for book");
        String title = sc.nextLine();
        System.out.println("Enter ISBN for book");
        String ISBN = sc.nextLine();
        System.out.println("Enter author for book");
        String author = sc.nextLine();

        try {
            File f = new File("bookDb.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
            pw.append(title + ISBN + author + "\n");
            pw.close();
        } catch (Exception var7) {
        }

    }

    public void addArticle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title for article");
        String title = sc.nextLine();
        System.out.println("Enter magazine");
        String Magazine = sc.nextLine();
        System.out.println("Enter author for article");
        String author = sc.nextLine();


    }
    public void addDate(){

        Date startDate=new Date(12,02,2022);
        Date endDate=new Date(14,10,2022);



    }

    public static void main(String[] args) {
        LoadData dl = new LoadData();
        dl.addBook();
        dl.addArticle();




    }
}
