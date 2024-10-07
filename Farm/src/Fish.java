class Fish extends Farm{
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String move() {
        return "swim";
    }
}