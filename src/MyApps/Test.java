/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApps;

import MyLibs.*;

/**
 *
 * @author Alcaraz
 */
public class Test {
    public static void main(String[] args) {
        Book bk = new Book();
        
        bk.setAuthor("Clark, Dan");
        bk.setTitle("C# Object-oriented Programming");
        
        Publisher pub = new Publisher();
        bk.setPublisher(pub);
        bk.getPublisher().setName("Apress");
        
       
        Address add = new Address();
        bk.getPublisher().setAddress(add);
        bk.getPublisher().getAddress().setCity("California");
        bk.getPublisher().getAddress().setCountry("USA");
        bk.getPublisher().getAddress().setNumber(21);
        
        Date date = new Date();
        
        
        bk.setPubDate(date);
        bk.getPubDate().setMonth(2);
        bk.getPubDate().setYear(2015);
        bk.getPubDate().setDay(21);
        
        
        
        System.out.println(bk.getAuthor() + ". " + bk.getTitle() + ". " +  bk.getPublisher().getName() + ", " + bk.getPublisher().getAddress().getCity() + ", " + bk.getPublisher().getAddress().getCountry() + ". " + bk.getPubDate().getMonth() + " " + bk.getPubDate().getYear());
        
    }
}