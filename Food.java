/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
class Food {
    private final int energy = 10;
    private double price = 50;

    public void setPrice(double price) {
        if (price < this.price) {
            System.out.println("Cannot update the food price.");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getEnergy() {
        return energy;
    }
}
