/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

import java.util.Arrays;

/**
 *
 * @author Darragh O'Connor
 */
public abstract class FlatLander 

{          
        //everything that is generic goes here - THIS IS THE SET UP CLASS 

    private String name;
    private String skill;
    private int health;
    private int toughness;
    private int level;
    private int attack;
    
    boolean isAlive()
    {
        return health > 0;
    }
    
private String[] inventory = new String[3];

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "FlatLander{" + "name=" + name + ", skill=" + skill + ", health=" + health + ", toughness=" + toughness + ", level=" + level + ", attack=" + attack + ", inventory=" + Arrays.toString(inventory) + '}';
    }


    
    
}
