import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ItemsList implements Serializable {

    private ArrayList<Book> books;
    private  ArrayList<Article> articles;




    public ItemsList(){
        books=new ArrayList<>();
        articles=new ArrayList<>();
    }

    public int bookSize(){
      return books.size();
    }
    public int articleSize(){
        return articles.size();
    }

    public  void addBook(Book book){
    books.add(book);

    }
    public void addArticle(Article article){
        articles.add(article);
    }




    public void removeBook(Book book){
        ArrayList<Book> temp=new ArrayList<>();
        for (int i=0; i<bookSize(); i++){
            if (!books.get(i).equals(book)){
                temp.add(books.get(i));
            }


        }
        books=temp;

    }
    public void removeArticle(Article article){
        ArrayList<Article> temp=new ArrayList<>();
        for (int i=0; i<articleSize(); i++){
            if (!articles.get(i).equals(article)){
                temp.add(articles.get(i));
            }
        }
        articles=temp;
    }

    public Book[] getAllBooks(){
        Book[] allBooks=new Book[books.size()];
        return  books.toArray(allBooks);
    }
    public Article[] getAllArticles(){
        Article[] allArticles=new Article[articles.size()];
        return articles.toArray(allArticles);
    }

 public void sortBook(){
     Collections.sort(books, new Comparator<Book>() {
         @Override
         public int compare(Book t1, Book t2) {
             return t1.getTitle().compareTo(t2.getTitle());
         }
     });
 }

 public void sortArticles(){
        Collections.sort(articles, new Comparator<Article>() {
            @Override
            public int compare(Article t1, Article t2) {
                return t1.getTitle().compareTo(t2.getTitle());
            }
        });
 }



}
