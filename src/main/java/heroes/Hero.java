package heroes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Hero {
    String name;
    int level;
    HeroAttributes heroAttributes;

    HashMap<Slot, Item> equipment=new HashMap<Slot, Item>();
    List<WeaponType> validWeaponTypes = new ArrayList<WeaponType>();

    List<Armor> validArmorTypes =new ArrayList<Armor>();

    public abstract void levelUp ();
    public void equip(Item item){
        if(item.requiredLevel>level){
            throw new RuntimeException("too high lever"); //TODO: fix a custom InvalidArmorException
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
                " Hero attributes: Strength:" +heroAttributes.getStrength() +
                  " Dexterity: " + heroAttributes.getDexterity() );
        System.out.println(str);
    }

}
