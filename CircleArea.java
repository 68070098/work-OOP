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
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area;
        area = Math.PI*(radius * radius);
        System.out.println(area);
    }
  
}
