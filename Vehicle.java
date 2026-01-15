/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    protected void setFuel(int i){
        this.fuel = i;
    }
    protected void setTopSpeed(String n){
        this.topSpeed = n;
    }
    protected int getFuel(){
        return fuel;
    }
    protected String getTopSpeed(){
        return topSpeed;
    }
    public void showInfo(){
        System.out.println("Fuel is " + fuel + " 1itre and Top Speed is " + topSpeed + "m/s.");    
    }
}