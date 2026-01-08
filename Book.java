/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
public class Book {
    public String title,author,publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    
    public void printDetails(){
        System.out.println("Title: " + title );
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished );
        System.out.println("Price: $"+ price);
        if (isAvailable == false){
            System.out.println("Available: No");
        } else{
            System.out.println("Available: Yes");
        }
    }
    public void updatePrice(double newPrice){
        this.price = newPrice;
    }
    public void markAsUnavailable(){
        this.isAvailable = false;
    }
    public void markAsAvailable(){
        this.isAvailable = true;
    }
    public boolean isPublishedAfter(int year){
        return year < yearPublished;
    }
}