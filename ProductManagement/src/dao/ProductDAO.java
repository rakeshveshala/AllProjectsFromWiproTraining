package dao;
import java.sql.*;
import pojo.Product;
import util.DBConnection;
public class ProductDAO {
private Connection con;
private PreparedStatement stat;
public ProductDAO()
{
	con=DBConnection.getInstance();
}
	public void insert(Product product) throws SQLException{
		
		stat=con.prepareStatement("insert into product values(?,?,?,?)");
		stat.setInt(1, product.getProductid());
		stat.setString(2, product.getProductname());
		stat.setDouble(3, product.getPrice());
		stat.setString(4, product.getCategory());
		int result=stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data inserted ");
		}
		
	}
}
