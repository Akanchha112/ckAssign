package SmallAssign;

public class Book {
    String title,author;
    double price;
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void printinfo(){
        System.out.println(" SmallAssign.Book details: "+this.title+", "+this.author+", "+this.price);
    }

}
