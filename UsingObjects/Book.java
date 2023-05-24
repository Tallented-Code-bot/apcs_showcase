package UsingObjects;

public class Book {
    private String title;
    private String author;
    private double rating; 
    private int numRatings = 0;



    public Book(String title, String author, double rating){
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.rating = 0;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
