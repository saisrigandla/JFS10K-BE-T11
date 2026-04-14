package JFS10KT4;
public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(75000.0);
        p1.setQuantity(5);
        Product p2 = new Product();
        p2.setProductId(102);
        p2.setProductName("Smartphone");
        p2.setPrice(30000.0);
        p2.setQuantity(10);
        p1.setQuantity(8);
        p2.setQuantity(15);
        displayProduct(p1);
        System.out.println("-------------------------");
        displayProduct(p2);
    }
    public static void displayProduct(Product p) {
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Updated Quantity: " + p.getQuantity());
    }
}