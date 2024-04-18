public class Dwarf extends Hero {
    private String weaponType;

    public Dwarf(String name, String weaponType) {
        super(name, "Dwarf");
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "The mighty " + getType() + ", "+ getName() + ", brandishing his " + weaponType + " with unmatched strength.";
    }
}
