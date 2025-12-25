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
public class laboop3_15_quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0 , total = 0;
        while (true){
            System.out.print("Enter deposit amount: ");
            int dep = input.nextInt();
            total += dep;
            count += 1;
            if (total >= 1000){
                System.out.println(" ");
                System.out.println("Target reached!");
                System.out.println("Total amound saved = " + total);
                System.out.println("Number of deposits = " + count);
                break;
            }
        }
    }    
}
