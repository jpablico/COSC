public class Elf extends Hero {
    private String bowType;

    public Elf(String name, String bowType) {
        super(name, "Elf");
        this.bowType = bowType;
    }

    @Override
    public String toString() {
        return "The half-" + getType() + ", " + getName() + ", wielding her " + bowType + " with deadly accuracy.";
    }
}
