/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

/**
 * @author Darragh O'Connor
 */
public class bossBattle 
{
 
    public void bossBattle(FlatLander one, FlatLander two) 
    
    {
     int i = 0;
     
        do {
            doAttack(one, two);
           } 
        while (one.isAlive() && two.isAlive() && i > 10);

    if (one.isAlive()) {
        System.out.println("You win!");
    } else if (two.isAlive()) {
        System.out.println("You lose!");
    } else {
        System.out.println("Draw!");
    }
    i++; //breaks the loop
}

    private void doAttack(FlatLander one, FlatLander two)
    
    {

    int damage = Math.max(0, one.getAttack() - two.getToughness());
    int health = two.getHealth() - damage;

    System.out.println(one.getName() + "'s attack does " + damage + " damage!\n");
    System.out.println(two.getName() + "'s Health\n");
    System.out.println(health);

    two.setHealth(health);     
    }

}

