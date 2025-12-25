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
public class laboop3_16_quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0 , min = 999999 , max = 0,num = 0;
        while (true){
            System.out.print("Enter a number (-1 to stcp) : ");
            num = input.nextInt();
            if (num == -1 & count == 0){
                System.out.println("No numbers were entered.");
                break;
            } else if (num == -1){
                System.out.println("");
                System.out.println("Maximum = " + max);
                System.out.println("Minimum = " + min);
                break;
            } if (num > max){
                max = num;
            } if (min > num){
                min = num;
            }
            count += 1;
        }
    }    
}
