package heroes;

import Items.ArmorType;
import Items.WeaponType;

import java.util.Arrays;
import java.util.HashSet;

public class Warrior extends Hero{

    public Warrior (String name) {
        super(name, new HeroAttributes(5, 2,1),
                new HashSet<>(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD)),
                new HashSet<>(Arrays.asList(ArmorType.MAIL, ArmorType.PLATE)));
                damagingAttribute=this.levelAttributes.getStrength();
    }

    @Override
    public void levelUp() {
        levelAttributes.setStrength(levelAttributes.getStrength()+3);
        levelAttributes.setDexterity(levelAttributes.getDexterity()+2);
        levelAttributes.setIntelligence(levelAttributes.getIntelligence()+1);
        level+=1;
        damagingAttribute=levelAttributes.getStrength();
    }

}
