class FrenchCoffee implements Coffee {
    private final String name;
    private final String seedName;
    private final int size;
    private final boolean sugar;
    private final boolean milk;
    public FrenchCoffee(String name, String seedName, int size, boolean sugar, boolean milk) {
        this.name = name;
        this.seedName = seedName;
        this.size = size;
        this.sugar = sugar;
        this.milk = milk;
    }
    @Override
    public void speak() {
        System.out.println("I am " + getName() + ".");
        System.out.println("Seed Name: " + getSeedName());
        System.out.println("Size: " + getSize());
        System.out.println("Sugar: " + hasSugar());
        System.out.println("Milk: " + hasMilk());
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSeedName() {
        return seedName;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public boolean hasSugar() {
        return sugar;
    }
    @Override
    public boolean hasMilk() {
        return milk;
    }
}