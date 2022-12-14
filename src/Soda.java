public class Soda extends Product{

    private String flavour = "";

    public Soda(String name, double price, String flavour) {
        super(name, price);
        this.setFlavour(flavour);
    }

    public String getFlavour() {
        return flavour;
    }

    private void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), flavour);
    }
}
