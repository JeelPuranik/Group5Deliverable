/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warfinal;

import java.util.Scanner;

/**
 *
 * @author JEEL
 */
public class WarFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HERE's A SMALL DESCRIPTION ON HOW TO PLAY THIS GAME\n"+ "This game comes to an end when one player out of two has all 52 cars\n"+"GOOD LUCK!");
       
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
       
        Player real = new Player(name);
        Player bot = new Player("Computer");
       
        System.out.println("We are about to start this Game");
       
        Deck deck = new Deck();
       
        deck.shuffle();
       
        real.setHand(new playerHand());
        bot.setHand(new playerHand());
       
        for(int i = 0; i < 26; i++){
            real.getHand().topCard(deck.dealCard());
            bot.getHand().topCard(deck.dealCard());
        }
        try{
            do{
                          
                Card player1TopCardRemove = bot.getHand().getCard();
                
                Card player2TopCardRemove = real.getHand().getCard();
                real.getHand().topCardRemove();
                             
                //THis is for the normal game
                if((player1TopCardRemove.getCards().ordinal()) > (player1TopCardRemove.getCards().ordinal())){
                    System.out.println("Bot "+player1TopCardRemove+" "+ name+" "+player2TopCardRemove);
                    System.out.println("And the winner is" +name);
                    real.getHand().bottomCard(player2TopCardRemove);
                    real.getHand().bottomCard(player1TopCardRemove);
                   
                    System.out.println("There are " +real.getHand().playerHandSize()+" Cards left with "+name);
                    System.out.println("There are " +bot.getHand().playerHandSize()+ " Cards left with bot \n");                
                }
               
                else if ((player2TopCardRemove.getCards().ordinal()) < (player1TopCardRemove.getCards().ordinal())){
                    System.out.println("Bot "+player1TopCardRemove+" "+ name+" "+player2TopCardRemove);
                    System.out.println("And the winner is Bot");
                    bot.getHand().bottomCard(player2TopCardRemove);
                    bot.getHand().bottomCard(player1TopCardRemove);
                    
                    System.out.println("There are " +real.getHand().playerHandSize()+" Cards left with "+name);
                    System.out.println("There are " +bot.getHand().playerHandSize()+ " Cards left with bot \n");
                }
               
               //This comes into scene when WAR occurs
               
                else{
                    System.out.println("Bot "+player1TopCardRemove+" "+ name+" "+player2TopCardRemove);
                    System.out.println("ITS TIME FOR THE WAR!");
                   
                    if(real.getHand().playerHandSize() == 1 || bot.getHand().playerHandSize() == 1){
                        
                        Card player2TopCardRemoveWar = real.getHand().getCard();
                        real.getHand().topCardRemove();
                        
                        Card player1TopCardRemoveWar = bot.getHand().getCard();
                        bot.getHand().topCardRemove();                
                       
                        if((player2TopCardRemoveWar.getCards().ordinal())>(player1TopCardRemoveWar.getCards().ordinal())){
                            System.out.println("And the winner is" +name);
                            real.getHand().bottomCard(player2TopCardRemove);
                            real.getHand().bottomCard(player2TopCardRemoveWar);
                            real.getHand().bottomCard(player1TopCardRemove);
                            real.getHand().bottomCard(player1TopCardRemoveWar);
                   
                            System.out.println("There are " +real.getHand().playerHandSize()+" Cards left with "+name);
                            System.out.println("There are " +bot.getHand().playerHandSize()+ " Cards left with bot \n");                   
                        }
                        else if((player2TopCardRemove.getCards().ordinal()) < (player1TopCardRemove.getCards().ordinal())){
                            System.out.println("And the winner is Bot");
                            bot.getHand().bottomCard(player2TopCardRemove);
                            bot.getHand().bottomCard(player2TopCardRemoveWar);
                            bot.getHand().bottomCard(player1TopCardRemove);
                            bot.getHand().bottomCard(player1TopCardRemoveWar);
                            
                    
                            System.out.println("There are " +real.getHand().playerHandSize()+" Cards left with "+name);
                            System.out.println("There are " +bot.getHand().playerHandSize()+ " Cards left with bot \n");
                        }
                        else{
                            if(bot.getHand().getCount() ==0){
                                real.getHand().bottomCard(player1TopCardRemoveWar);
                                real.getHand().bottomCard(player1TopCardRemove);
                                real.getHand().bottomCard(player2TopCardRemoveWar);
                                real.getHand().bottomCard(player2TopCardRemove);
                            }
                            else{
                                bot.getHand().bottomCard(player1TopCardRemoveWar);
                                bot.getHand().bottomCard(player1TopCardRemove);
                                bot.getHand().bottomCard(player2TopCardRemoveWar);
                                bot.getHand().bottomCard(player2TopCardRemove);
                            }
                        }
                    }
                   
                }            
                
           }
           while(bot.getHand().playerHandSize() >0 || real.getHand().playerHandSize() >0);
        }
        
        catch(IndexOutOfBoundsException e){
            if(real.getHand().playerHandSize()==0){
                System.out.println("Bot won the game");
            }
            else{
                System.out.println("Yayyy! You won the Game");
            }
       }
    }
}
      