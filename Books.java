/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books {
int bookID;
String bookTitle;
int bookRating;

Books(){
    this.bookID = 0;
    this.bookTitle ="Unknown";
    this.bookRating = 0;
    
}
Books(int bookID,String bookTitle, int bookRating){
    this.bookID=bookID;
    this.bookTitle = bookTitle;
    this.bookRating =bookRating;
}
       void setID(int ID){
           this.bookID = bookID;
           }
       int getID(){
           return this.bookID;
           }
       void setbookTitle(String title){
           this.bookTitle = title;
       }
       String getTitle(){
           return this.bookTitle;
       }
       void setRating(int rate){
           this.bookRating = rate;
       }
       int getRating(int rate){
           return this.bookRating;
           
       }
       void displayinfo(){
           System.out.println("BookID :"+ this.bookID +
                   "\n Book Title : "+ this.bookTitle +
                   "\n Book Rating : "+ this.bookRating);
       }

}
class bookTitleComparator implements Comparator<Books>{
    
    @Override
    public int compare (Books o1,Books o2){
        if (o1.bookRating ==o2. bookRating)
            return 0;
        else if (o1.bookRating< o2.bookRating)
            return 1;
        else 
            return -1;
        
        
    }
}


