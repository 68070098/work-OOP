/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;

    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }

    public void setPosition(String p) {
        this.position = p;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }

    public boolean isSamePosition(FootballPlayer p) {
        return this.getTeam().equals(p.getTeam())
                && this.position.equals(p.position);
    }
}
