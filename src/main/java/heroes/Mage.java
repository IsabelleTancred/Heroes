package heroes;


import Items.ArmorType;
import Items.WeaponType;

import java.util.Arrays;
import java.util.HashSet;

public class Mage extends Hero{


    public Mage (String name) {
        super(name, new HeroAttributes(1, 1,8),
                new HashSet<>(Arrays.asList(WeaponType.STAFF, WeaponType.WAND)),
                new HashSet<>(Arrays.asList(ArmorType.CLOTH)));
    }
    @Override
    public void levelUp() {
        levelAttributes.setStrength(levelAttributes.getStrength()+1);
        levelAttributes.setDexterity(levelAttributes.getDexterity()+1);
        levelAttributes.setIntelligence(levelAttributes.getIntelligence()+5);
        level+=1;
    }
}
