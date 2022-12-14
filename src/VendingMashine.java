import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMashine {
    private List<Product> products;
    private static List<Product> default1 = new ArrayList<Product>(Arrays.asList(new Product("tea", 12.3)));


    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public VendingMashine() {
        this(default1);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

//    public List<Product> findByName(String name) {
//        List<Product> result = new ArrayList<>();
//        products.forEach(i -> {
//            if (i.getName().equals(name))
//                result.add(i);
//        });
//
//        return result;
//    }
    public List<Product> findByName(String name) {
        return finder(p -> p.getName().equals(name));
    }

    public List<Product> findByPrice(double price){
        return finder(p -> p.getPrice()== price);
    }

    public List<Product> findByPriceRange(double p1, double p2){
        return finder(p -> p.getPrice()>p1 && p.getPrice()<p2 );
    }

    private List finder(Function<Product, Boolean> f) {
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if (Boolean.TRUE.equals(f.apply(i))){
                result.add(i);
            }
        });
        return result;
    }
}
