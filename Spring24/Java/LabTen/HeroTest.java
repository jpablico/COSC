import java.util.ArrayList;
import java.*;

/**
 * Main class for testing the Hero class and its subclasses
 * Josh Pablico
 * COSC-1437.200
 * Created on April 18th, 2024
 */

public class HeroTest {

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Wizard("Wyll", "Purple"));
        heroes.add(new Dwarf("Gimli", "Axe"));
        heroes.add(new Elf("Shadowheart", "Elven longbow"));

        System.out.println("Here are your mighty heroes and companions: \n");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
