/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

import java.util.Random;
/**
 *
 * @author Darragh O'Connor
 */
public class Combat 
{

 String[] items = {"mana", "mead", "poison", "fisheye", "lightsword"};
    Random rG = new Random(); //random method to pick what is in the inv
    
    
    public void battleHand2Hand(FlatLander one, FlatLander two)
    {
    
        if(one instanceof Barbarian)
        {
        
          System.out.println("Barbarian steps up to fight!");
          System.out.println("The Barbarian shouts : 'This day is mine!'");
          System.out.println("Combat Stats = " + one.toString());
           
        }
    
        else 
        {
        
          System.out.println("Barbarian has fallen");
            System.out.println(one.toString());
           
        }
    
        System.out.println("Darkness falls over the field");
        System.out.println("Our heroes are blocked by an evil force");
        System.out.println("Combat Stats = " + two.toString());
        
        one.setInventory(fillInventory(one.getInventory()));
        two.setInventory(fillInventory(two.getInventory()));
        
     
        //action items 
        //who wins??
    
    }

    /**
     *
     * @param inventory
     * @return
     * uses player field Inventory with fillInventory method
     */
    public String[] fillInventory(String[] inventory)
        {
            for(int i=0;i<inventory.length;i++)
            {
                inventory[i] = items[rG.nextInt(items.length)];
           
            }
                    

            return inventory;
            
        }
    

    
}
