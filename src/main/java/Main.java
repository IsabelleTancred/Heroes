import heroes.Mage;
import items.Slot;
import items.Weapon;
import items.WeaponType;

public class Main {

    static Mage mage = new Mage("Isabelle");
    static Weapon weapon = new Weapon("Axe", WeaponType.STAFF, 5, 3);

    public static void main(String[] args) {
        System.out.println("Hello World");
        mage.display();
        mage.levelUp();
        mage.levelUp();
        mage.equip(weapon);
        mage.display();
        System.out.println(mage.equipment.get(Slot.WEAPON));
    }
}

//TODO: write tests
//TODO: If time-> refactor code