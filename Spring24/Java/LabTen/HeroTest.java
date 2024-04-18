import java.util.ArrayList;
import java.*;

public class HeroTester {

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Wizard("Gandalf", "White"));
        heroes.add(new Dwarf("Gimli", "Axe"));
        heroes.add(new Elf("Legolas", "Elven longbow"));

        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
