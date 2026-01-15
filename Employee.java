/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
class Employee {
    private final String nationality = "Thai";
    private String name;
    private int energy;
    private Wallet wallet;

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void eat(Food f) {
        if (f != null) {
            energy += f.getEnergy();
        }
    }

    public boolean buyFood(Seller s) {
        Food f = s.sell(this);
        if (f == null) {
            return false;
        }
        eat(f);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.name.equals(e.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "My name is " + name + ".\n"
                + "I have " + energy + " energy left.\n"
                + "I have a balance of " + wallet.getBalance() + " baht.";
    }
}
