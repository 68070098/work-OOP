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
public class LabOOP1_17_quiz {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sec=input.nextInt();
        int second=input.nextInt();
        int total_time=sec+second;
        int hour=total_time / 60 / 60;
        int minute=total_time / 60;
        int secs=total_time % 60;
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(secs);
    }
}
