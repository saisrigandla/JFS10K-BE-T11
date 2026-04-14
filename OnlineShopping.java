package JFS10KT11;
import JFS10KT4.Product;
public class OnlineShopping {
    public static void main(String[] args) {
        Product testObj = new Product();
        testObj.setProductName("Connection Test");
        System.out.println("Import Status: Success! ✅");
        System.out.println("Accessing Product: " + testObj.getProductName());
    }
}