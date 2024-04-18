public class Dwarf extends Hero {
    private String weaponType;

    public Dwarf(String name, String weaponType) {
        super(name, "Dwarf");
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Name: " + getName() + ", Weapon Type: " + weaponType;
    }
}
