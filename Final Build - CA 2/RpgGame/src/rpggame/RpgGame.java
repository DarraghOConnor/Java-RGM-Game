/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

import java.util.Scanner;

/**
 *
 * @author Darragh O'Connor
 */
public class RpgGame {
    

    public static void main(String[] args) {
        // TODO code application logic here
     
     //GameStart to name select
     
  
        Scanner input = new Scanner(System.in);

        String username;
        double age;
        String gender;

        // Allows a person to enter his/her name   
        Scanner one = new Scanner(System.in);
        System.out.println("Enter Name:" );  
        username = one.next();
        System.out.println("Name accepted : " + username);

        // Allows a person to enter his/her age   
        Scanner two = new Scanner(System.in);
        System.out.println("Enter Age:" );  
        age = two.nextDouble();
        System.out.println("Age accepted " + age);

        // Allows a person to enter his/her gender  
        Scanner three = new Scanner(System.in);
        System.out.println("Enter Gender:" );  
        gender = three.next();
        System.out.println("Gender accepted " + gender);

    System.out.println("Hello Hero \n " + "\u0020" + username + "\n let's fight the evil."); 
    System.out.println ( "Will you be apart of this band of heroes fighting the evil Norrix danger?");
    System.out.println ( username   + "\n you will help us?");
 
        
     //Character selection Menu class -- Menu m = new Menu();    
      Menu wel = new Menu(); //Menu 
        
      Barbarian bar = new Barbarian();
      DarkWarrior drk = new DarkWarrior();
      
      bar.setName("Clubber");
      bar.setSkill("Brute");
      bar.setHealth(5);  
      bar.setToughness(120);
      bar.setLevel(3);
      bar.setAttack(25);
     
      drk.setName("Daken");
      drk.setSkill("Assassin");
      drk.setHealth(5);  
      drk.setToughness(100);
      drk.setLevel(6);
      drk.setAttack(35);
      //the above shouldn't be in main method but I don't know where to put it
      
      
    //COMBAT!!
      Combat cm = new Combat();
      cm.battleHand2Hand(bar, drk);
    
      //Duel Turn
      Duel dl = new Duel();  
      dl.duel(bar, drk);
      
      //Next Battle
      //Character selection Menu class -- Menu m = new Menu();    
      Menu battle2 = new Menu(); //Menu 
        
      Elf leg = new Elf();
      DarkMage drkM = new DarkMage();
      
      leg.setName("Blondie");
      leg.setSkill("Archer");
      leg.setHealth(4);  
      leg.setToughness(100);
      leg.setLevel(9);
      leg.setAttack(40);
     
      drkM.setName("Dawgur");
      drkM.setSkill("Dark Elf Mage");
      drkM.setHealth(3);  
      drkM.setToughness(90);
      drkM.setLevel(9);
      drkM.setAttack(35);
      //the above shouldn't be in main method but I don't know where to put it
      
      
    //COMBAT!!
      Combat cm3= new Combat();
      cm3.battleHand2Hand(leg, drkM);
    
      //Duel Turn
      Duel dl3 = new Duel();  
      dl3.duel(leg, drkM);
            
      
      //Boss Menu Selection!!
     
      bossMenu boss = new bossMenu(); //Menu 
     
        Wizard Gandalf = new Wizard();
        ShadowBoss Sauron = new ShadowBoss();
      
      Sauron.setName("Sauron");
      Sauron.setSkill("Dark Lord");
      Sauron.setHealth(10);  
      Sauron.setToughness(250);
      Sauron.setLevel(7);
      Sauron.setAttack(45);
     
      Gandalf.setName("Gandalf");
      Gandalf.setSkill("Grey Wizard");
      Gandalf.setHealth(15);  
      Gandalf.setToughness(190);
      Gandalf.setLevel(7);
      Gandalf.setAttack(40);
      
      //the above shouldn't be in main method but I don't know where to put it
      
      
     //how to class an action method
      Combat cm2 = new Combat();
      cm2.battleHand2Hand(Gandalf, Sauron);
      
    bossBattle BB = new bossBattle();
    BB.bossBattle(Gandalf, Sauron);
  
      
 
      //Creation Class -- CreateDudes cd = new CreateDudes();
      
      //cd.buildChars(m.mainMenu()); how to call them in the main method 
      
    System.out.println("Good Job,\n " + "\u0020" + username + "\n the evil boss is beaten."); 
    System.out.println ( "The Norrix will remember this day!");
 
        
    }

    private static void display_menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
