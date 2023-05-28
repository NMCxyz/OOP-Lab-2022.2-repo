package AimsProject.hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }


    public Book() {

    }
    public void addAuthor(String authorName) {
//        if (authors.contains(authorName)) {
//            System.out.println("Author already exists");
//        } else {
//            authors.add(authorName);
//        }
        // using for loop
        for(String author: authors) {
            if(authorName == author) {
                System.out.println("Author already exists");
                return;
            }
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author does not exist");
        }
    }
}
