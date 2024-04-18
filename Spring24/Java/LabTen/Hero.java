public abstract class Hero {
    private String name;
    private String type;

    public Hero(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public abstract String toString();
}
