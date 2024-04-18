public class Wizard extends Hero {
    private String robeColor;

    public Wizard(String name, String robeColor) {
        super(name, "Wizard");
        this.robeColor = robeColor;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Name: " + getName() + ", Robe Color: " + robeColor;
    }
}
