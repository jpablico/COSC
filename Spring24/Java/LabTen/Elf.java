public class Elf extends Hero {
    private String bowType;

    public Elf(String name, String bowType) {
        super(name, "Elf");
        this.bowType = bowType;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Name: " + getName() + ", Bow Type: " + bowType;
    }
}
