class Pig extends Farm {
    private String name;

    public Pig(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String move() {
        return "walk";
    }
}