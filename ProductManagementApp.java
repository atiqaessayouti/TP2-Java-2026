import java.util.ArrayList;

public class ProductManagementApp {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

     
        products.add(new Product(1, "Laptop", 12000));
        products.add(new Product(2, "Smartphone", 8000));
        products.add(new Product(3, "Headphones", 500));

        
        System.out.println("Liste des produits:");
        products.forEach(System.out::println); 

       
        products.remove(1);

        
        System.out.println("\nAprès suppression:");
        products.forEach(System.out::println);
    }
}
