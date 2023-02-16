package heroes;

import Items.*;

import java.util.Arrays;
import java.util.HashSet;

public class Rogue extends Hero{

    public Rogue (String name) {
        super(name, new HeroAttributes(2, 6,1),
                new HashSet<>(Arrays.asList(WeaponType.DAGGER, WeaponType.SWORD)),
                new HashSet<>(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL)));
    }


    @Override
    public void levelUp() {
        levelAttributes.setStrength(levelAttributes.getStrength()+1);
        levelAttributes.setDexterity(levelAttributes.getDexterity()+4);
        levelAttributes.setIntelligence(levelAttributes.getIntelligence()+1);
        level+=1;
    }


}
