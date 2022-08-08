import java.io.FileNotFoundException;
import java.io.IOException;

public class ModelManagement {
    private String reservationFileName;
    private String itemsFileName;

    public ModelManagement(String reservationFileName, String itemsFileName) {
        this.reservationFileName = reservationFileName;
        this.itemsFileName=itemsFileName;
    }

    public ItemsList getAllBookItems(){
        ItemsList allBookItems=new ItemsList();

        try
        {
            allBookItems=(ItemsList) MyFileHandler.readFromBinaryFile(itemsFileName);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");


        } catch (IOException e) {
            System.out.println("IO Error reading file ");

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }


        return allBookItems;
    }
    public ItemsList getAllArticleItems(){
        ItemsList allArticleItems=new ItemsList();
        try
        {
            allArticleItems=(ItemsList) MyFileHandler.readFromBinaryFile(itemsFileName);
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class Not Found");
        }
return allArticleItems;
    }

public void saveBook(ItemsList books){
books.sortBook();
try
{
    MyFileHandler.writeToBinaryFile(itemsFileName, books);
}
catch (FileNotFoundException e)
{
    System.out.println("File not found");
}
catch (IOException e)
{
    System.out.println("IO Error writing to file");
}
}

public void saveArticles(ItemsList articles){
    articles.sortArticles();
    try
    {
        MyFileHandler.writeToBinaryFile(itemsFileName, articles);
    }
    catch (FileNotFoundException e)
    {
        System.out.println("File not found");
    }
    catch (IOException e)
    {
        System.out.println("IO Error writing to file");
    }
}

public void removeBook( int ISBN,String title, String author){
        ItemsList allBookItems=getAllBookItems();
        for (int i=0; i<allBookItems.bookSize();i++){

              Book book=allBookItems.getAllBooks()[i];
              if (book.getTitle().equals(title)&&book.getAuthor().equals(author)&&book.getIsbn()==ISBN){
                  allBookItems.removeBook(book);
              }

        }
    saveBook(allBookItems);
}

    public void removeArticle( String magazine,String title, String author){
        ItemsList allArticleItems=getAllArticleItems();
        for (int i=0; i<allArticleItems.articleSize();i++){
            Article article=allArticleItems.getAllArticles()[i];
            if (article.getTitle().equals(title)&&article.getAuthor().equals(author)&&article.getMagazine().equals(magazine)){
                allArticleItems.removeArticle(article);
            }

        }
        saveArticles(allArticleItems);
    }

public void addBook(Book book){
ItemsList allBook= getAllBookItems();
allBook.addBook(book);
saveBook(allBook);
}

public void addArticle(Article article){
        ItemsList allArticle=getAllArticleItems();
        allArticle.addArticle(article);
        saveArticles(allArticle);
}










}
