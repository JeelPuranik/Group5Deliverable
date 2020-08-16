/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warfinal;

/**
 *
 * @author 
 * Jeel Puranik
 * Tapasvi Patel
 * Kush Patel
 */
public class Player {
    private String name;
    private playerHand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public playerHand getHand() {
        return this.hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHand(playerHand hand) {
        this.hand = hand;
    }
    
}
