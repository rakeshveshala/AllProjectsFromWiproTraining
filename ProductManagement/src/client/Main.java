package client;
import java.sql.SQLException;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        try {
            productService.insertProduct();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
