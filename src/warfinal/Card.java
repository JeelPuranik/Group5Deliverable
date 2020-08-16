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

public class Card {

   

  
    public enum Suits {SPADES, CLUBS, DIAMONDS, HEARTS}
    public enum Cards {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    


    final Suits suit;
    final Cards cards;

    /**
     *
     * @param suit
     * @param cards
     */
    public Card (final Cards cards,final Suits suit){
        this.cards=cards;
        this.suit= suit;
     
    }

    /**
     *
     * @return suit
     */
    public Suits getSuit(){
        return suit;
    }

    /**
     *
     * @return cards
     */
    public Cards getCards() {
        return cards;
    }

} 

