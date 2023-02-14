package heroes;

public class Main {

    static Mage mage = new Mage("Isabelle");
    public static void main(String[] args) {
        System.out.println("Hello World");
         mage.display();
         mage.levelUp();
         mage.display();

    }
}