public class Coffee extends Product{
    private String coffeeType= "";

    public Coffee(String name, double price, String coffeeType) {
        super(name, price);
        this.setCoffeeType(coffeeType);
    }
    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), coffeeType);
    }
}
