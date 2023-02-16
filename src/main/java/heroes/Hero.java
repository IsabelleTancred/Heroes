package heroes;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;

import java.util.*;

public abstract class Hero {
    String name;
    int level;
    HeroAttributes levelAttributes;

     public Map<Slot, Item> equipment = new HashMap<>();

    Set<WeaponType> validWeaponTypes;

    Set<Armor> validArmorTypes;

    public Hero(String name, HeroAttributes heroAttributes, Set validWeaponTypes, Set validArmorTypes) {
        this.name = name;
        level = 1;
        //TODO: set equipment to null;
        this.levelAttributes = heroAttributes;
        this.validWeaponTypes = validWeaponTypes;
        this.validArmorTypes = validArmorTypes;
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.WEAPON, null);
    }

    public abstract void levelUp();

    public void equip(Weapon weapon) {
        try {

        if (weapon.requiredLevel > this.level) {
            throw new InvalidWeaponException("The weapons required level is higher than the heroes level");
        }
        if (!validWeaponTypes.contains(weapon.getWeaponType())) {
            throw new InvalidWeaponException("invalid weaponType");
        }
        equipment.put(weapon.slot, weapon);
        }
        catch (InvalidWeaponException e){
            System.out.println(e.getMessage());
        }
    }

    public void equip(Armor armor) {
        try {
            if (armor.requiredLevel > this.level) {
                throw new InvalidArmorException("The armors required level is higher than the heroes level"); //TODO: fix a custom InvalidArmorException
            }
            if (!validArmorTypes.contains(armor.getArmorType())) {
                throw new InvalidArmorException("invalid armorType");
            }
            equipment.put(armor.slot, armor);
        }
        catch (InvalidArmorException e){
            System.out.println(e.getMessage());
        }
    }

    public int damage() {
        int weaponDamage;
        if (equipment.get(Slot.WEAPON) == null || equipment.get(Slot.WEAPON) instanceof Armor) {
            weaponDamage = 1;
        } else{
            Weapon a = (Weapon) equipment.get(Slot.WEAPON);
            weaponDamage = a.getWeaponDamage();
        }
        int heroDamage = weaponDamage * (1 + (totalAttributes().getDexterity() / 100));
        return heroDamage;
    }

    public HeroAttributes totalAttributes() {
        HeroAttributes total = new HeroAttributes(levelAttributes.getStrength(), levelAttributes.getDexterity(), levelAttributes.getIntelligence());
        for (Map.Entry<Slot, Item> entry : equipment.entrySet()) {
            if (entry.getValue() != null && entry.getValue() instanceof Armor) {
                total.add(((Armor) entry.getValue()).getArmorAttribute());
            }
        }
        return total;
    }

    public void display() {
        String str = "Name: " + name + " Level: " + level + " Class: " + this.getClass().getSimpleName() +
                " Hero attributes: Strength:" + levelAttributes.getStrength() +
                " Dexterity: " + levelAttributes.getDexterity() + " Intelligence: " + levelAttributes.getIntelligence();

        System.out.println(str);
    }

}
