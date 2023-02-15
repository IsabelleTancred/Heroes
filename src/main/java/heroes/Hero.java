package heroes;


import Items.Armor;
import Items.Item;
import Items.Slot;
import Items.WeaponType;

import java.util.*;

public abstract class Hero {
    String name;
    int level;
    HeroAttributes levelAttributes;

    HashMap<Slot, Item> equipment= new HashMap<>();
    
    Set<WeaponType> validWeaponTypes ;

    Set<Armor> validArmorTypes;

    public Hero(String name, HeroAttributes heroAttributes, Set validWeaponTypes , Set validArmorTypes ){
        this.name = name;
        level = 1;
        //TODO: set equipment to null;
        this.levelAttributes =heroAttributes;
        this.validWeaponTypes=validWeaponTypes;
        this.validArmorTypes=validArmorTypes;
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.WEAPON,null);
    }
    
    public abstract void levelUp ();
    
    public void equip(Item item){
        if(item.requiredLevel>this.level){
            throw new RuntimeException("too high level"); //TODO: fix a custom InvalidArmorException
        }
        //TODO: check if weapon or armor
        //TODO: check valid type
        equipment.put(item.slot, item);
    }
    ;

    //public abstract int damage();

    //public abstract int totalAttributes();
    public void display (){
        StringBuilder str= new StringBuilder();
        str.append("Name: " + name +  " Level: " + level + " Class: " + this.getClass().getSimpleName() +
                " Hero attributes: Strength:" + levelAttributes.getStrength() +
                  " Dexterity: " + levelAttributes.getDexterity() + " Intelligence: " + levelAttributes.getIntelligence());

        System.out.println(str);
    }

}
