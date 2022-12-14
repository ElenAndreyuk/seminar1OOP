import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Frost", 1.1);
        System.out.println(water);

        VendingMashine l1 = new VendingMashine();
        System.out.println(l1);

        List<Product> l2 = new ArrayList<>();
        l2.add(water);
        l2.add(new Product("wine", 25.5));
        l2.add(new Product("sugar", 3));
        l2.add(new Soda("Fanta", 3, "grape"));

        VendingMashine l3= new VendingMashine(l2);
        System.out.println(l3);
        System.out.println(l3.findByName("Fanta"));
        System.out.println(l3.findByPrice(3));
        System.out.println(l3.findByPriceRange(0,4));

    }
}