public class Wizard extends Hero {
    private String robeColor;

    public Wizard(String name, String robeColor) {
        super(name, "Wizard");
        this.robeColor = robeColor;
    }

    @Override
    public String toString() {
        return "The great " + getType() + ", " + getName() + ", in his lavish " + robeColor + " robe.";
    }
}
