package heroes;

import items.*;

import java.util.Arrays;
import java.util.HashSet;

public class Ranger extends Hero{

    public Ranger (String name) {
        super(name, new HeroAttributes(1, 7,1),
                new HashSet<>(Arrays.asList(WeaponType.BOW)),
                new HashSet<>(Arrays.asList(ArmorType.LEATHER,ArmorType.MAIL)));
    }

    @Override
    public void levelUp() {
        levelAttributes.setStrength(levelAttributes.getStrength()+1);
        levelAttributes.setDexterity(levelAttributes.getDexterity()+5);
        levelAttributes.setIntelligence(levelAttributes.getIntelligence()+1);
        level+=1;
    }

}
