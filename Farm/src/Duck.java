class Duck extends Farm{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String move() {
        return "swim and walk";
    }
}