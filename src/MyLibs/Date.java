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
public class Date {
   private int day;
   private int month;
   private int year;

   
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return convertMonth();
    }

    public void setMonth(int month) {
        this.month = month;
    }
   
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
      
   
   public String convertMonth() {
       switch (month) {
           case 1:
               return "January";
           case 2:
               return "February";
           case 3:
               return "March";
           case 4:
               return "April";
           case 5:
               return "May";
           case 6:
               return "June";
           case 7:
               return "July";
           case 8:
               return "August";
           case 9:
               return "September";
           case 10:
               return "October";
           case 11:
               return "November";
           case 12:
               return "December";
           default:
               return "Invalid month!";
       }
   } 
   
  
   
   
}
