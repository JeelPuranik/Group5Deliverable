package warfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import warfinal.Card.Cards;
import warfinal.Card.Suits;

/**
 *
 * @author 
 * Jeel Puranik
 * Tapasvi Patel
 * Kush Patel
 */
public class Deck {
    public int usedCards;
    
    private final List<Card> deck = new ArrayList<Card>();
    
    public Deck(){
        makeDeck();
    }
    
    private void makeDeck(){
        for(Suits s : Suits.values()){
            for(Cards c : Cards.values()){
               deck.add(new Card(c, s));
            }
        }
        usedCards = 0;
    }
   public void shuffle(){
       Collections.shuffle(deck);
     
       
   }
   public int emainingCards() {
        return deck.size()- usedCards;
    }
   public Card dealCard(){
       if (usedCards == deck.size())
           System.out.println("0 cards left in deck");
       usedCards++;
       return deck.get(usedCards -1);
   }
}