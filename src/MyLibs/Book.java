/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;


/**
 *
 * @author Alcaraz
 */
public class Book extends Date{
    private String author;
    private String title;
    private Date pubDate;
    private Publisher publisher;

    
    
    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
    

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }
    
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

   
    
    
    
    
    public int checkBookAge() {
        if (pubDate.getYear() <= 2018) {
            return 0;
        }
        else {
            return 1;
        }
    }
    
    
}