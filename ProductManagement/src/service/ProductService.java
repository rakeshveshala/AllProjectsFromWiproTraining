package service;
import java.sql.SQLException;
import java.util.*;
import dao.ProductDAO;
import pojo.Product;
public class ProductService {
	private Scanner sc;
	private ProductDAO pdao;
	public ProductService()
	{
		pdao=new ProductDAO();
		sc=new Scanner(System.in);
		
	}
	public void insertProduct() throws SQLException
	{
		System.out.println("Enter how many products u want to have");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter PRoduct id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter price ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter Category");
			p.setCategory(sc.next());
			pdao.insert(p);
		}
		
	}
	public void delete() throws SQLException {
		
	}
	
	
}
