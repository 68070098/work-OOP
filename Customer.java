/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer() {
        acct = new Account[5];
        numOfAccount = 0;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        numOfAccount = 0;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + numOfAccount + " accounts.";
    }

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

}


//    private String firstName;
//    private String lastName;
//    private ArrayList<Account> acct;
//
//    public Customer() {
//        acct = new ArrayList<>();
//    }
//
//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        acct = new ArrayList<>();
//    }
//
//    public void addAccount(Account acct) {
//        this.acct.add(acct);
//    }
//
//    public Account getAccount(int index) {
//        return acct.get(index);
//    }
//
//    public int getNumOfAccount() {
//        return acct.size();
//    }
//
//    public String getFirstName() { return firstName; }
//    public String getLastName() { return lastName; }
//
//    @Override
//    public String toString() {
//        return firstName + " " + lastName + " has " + acct.size() + " accounts.";
//    }
//}
