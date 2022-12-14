public class Fruit extends Product{


    private String fruitPackaging = "";

    public Fruit(String name, double price, String fruitPackaging) {
        super(name, price);
        this.setFruitPackaging(fruitPackaging);
    }
    public String getFruitPackaging() {
        return fruitPackaging;
    }

    public void setFruitPackaging(String fruitPackaging) {
        this.fruitPackaging = fruitPackaging;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), fruitPackaging);
    }

}
