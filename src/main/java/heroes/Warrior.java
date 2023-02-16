package heroes;

import items.*;

import java.util.Arrays;
import java.util.HashSet;

public class Warrior extends Hero{

    public Warrior (String name) {
        super(name, new HeroAttributes(5, 2,1),
                new HashSet<>(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD)),
                new HashSet<>(Arrays.asList(ArmorType.MAIL, ArmorType.PLATE)));
    }

    @Override
    public void levelUp() {
        levelAttributes.setStrength(levelAttributes.getStrength()+3);
        levelAttributes.setDexterity(levelAttributes.getDexterity()+2);
        levelAttributes.setIntelligence(levelAttributes.getIntelligence()+1);
        level+=1;
    }

    @Override
    public int damage() {
        int weaponDamage;
        if (equipment.get(Slot.WEAPON) == null || equipment.get(Slot.WEAPON) instanceof Armor) {
            weaponDamage = 1;
        } else{
            Weapon a = (Weapon) equipment.get(Slot.WEAPON);
            weaponDamage = a.getWeaponDamage();
        }
        int heroDamage = weaponDamage * (1 + totalAttributes().getStrength() / 100);
        return heroDamage;
    }

}
