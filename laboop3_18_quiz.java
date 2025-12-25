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
public class laboop3_18_quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Please insert a number : ");
        num = input.nextInt();
        for (int i = 1; i <= num ; i++){
            if (i % 5 == 0){
                System.out.println("|");
            } else{
                System.out.print("|");
            }
        }
    }    
}
