package heroes;

import Items.Weapon;
import Items.WeaponType;

public class Main {

    static Mage mage = new Mage("Isabelle");
    static Weapon weapon = new Weapon("Axe", WeaponType.WAND, 3, 3);

    public static void main(String[] args) {
        System.out.println("Hello World");
        mage.display();
        mage.levelUp();
        mage.levelUp();
        mage.equip(weapon);
        mage.display();
        System.out.println(mage.equipment);

    }
}

//TODO: implement Total()
//TODO: use Total() in damage()
//TODO: Write own exceptions
//TODO: write tests
//TODO: If time-> refactor code