/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 * Jeel Puranik
 * Tapasvi Patel
 * Kush Patel
 */
public class playerHand {
    private ArrayList<Card> playerHand;
    
    public playerHand(){
        playerHand = new ArrayList<>();
    }
    
    public void clear(){
        playerHand.clear();
    }
    
    public int playerHandSize() {
        return playerHand.size();
    }
    
    public void topCard(Card c){
        if(c == null){
            throw new NullPointerException("Try adding real card, cannot add null card");
        }
        playerHand.add(c);
    }
    
    public void topCards(List<Card> cs) {
        this.playerHand.addAll(cs);
    }
    
    public void bottomCard(Card c) {
        playerHand.add(0, c);
    }
    
    public Card topCardRemove() {
        if (playerHandSize() < 1) {
            return null;
        }
         return playerHand.remove(playerHandSize() - 1);
    }
    
    public Card bottomCardRemove() {
        if (playerHandSize() < 1) {
            return null;
        }
        return playerHand.remove(0);
    }
    
     public void removeCard(int position) {
        if (position < 0 || position >= playerHand.size())
            throw new IllegalArgumentException("it is not available: "+ position);
        playerHand.remove(position);
    }
     
      public int getCount() {
        return playerHand.size();
    }
      
      public Card getCard() {
       
        return playerHand.get(getCount()-1);
    }
         
}

    
