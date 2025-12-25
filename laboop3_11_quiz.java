/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class laboop3_11_quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0,paid;
        System.out.print("Enter number of items: ");
        int item = input.nextInt();
        for (int i = 1; i <= item; i++){
            System.out.print("Enter price for item " + i + ": ");
            double price = input.nextDouble();
            total += price;
            if ( i == item){
                System.out.println("Total = " + (int)total);
                System.out.println(" ");
                System.out.print("Enter amount paid: ");
                paid = input.nextDouble();
                System.out.println("Change = " + (int)(paid - total));
                break;
            }
            
            
        }
    }    
}
