package collections;
import java.util.*;
public class ProductMain {
	private Set<Product> prdset;
	private Scanner sc;
	public ProductMain()
	{
		prdset=new HashSet<>();
		sc=new Scanner(System.in);
	}
	
	public void insert()
	{
		System.out.println("Enter how many product u want to have");
		int noofproducts=sc.nextInt();
		for(int x=1;x<=noofproducts;x++)
		{Product p=new Product();
		System.out.println("Enter product id ");
		p.setProductid(sc.nextInt());
		System.out.println("Enter Product name ");
		p.setProductname(sc.next());
		System.out.println("Enter price ");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter quantity");
		p.setQuantity(sc.nextInt());
		prdset.add(p);
		}
			
	}
	public void delete()
	{
		System.out.println("Enter the productid which u want to delete");
		Product pdelete=null;
		int id=sc.nextInt();
		for(Product p:prdset)
		{
			if(p.getProductid()==id)
			{
				pdelete=p;
			}
		}
		prdset.remove(pdelete);
	}
	public void update()
	{
		Product pupdate=null;
		System.out.println("Enter the product id which u want to updte");
		int productid=sc.nextInt();
		for(Product p:prdset)
		{
			if(p.getProductid()==productid)
			{
				pupdate=p;
				System.out.println("Enter new quantity");
				pupdate.setQuantity(sc.nextInt());
				
			}
		}
	}
	public void view()
	{
		for(Product p:prdset)
		{
			System.out.println("Prouctname is "+p.getProductname());
			System.out.println("Quantity is "+p.getQuantity());
			System.out.println("Product id is "+p.getProductid());
		}
	}
	public void menu()
	{
		String choice="y";
		while(choice.equals("y"))
		{
			System.out.println("1. Insert Product");
			System.out.println("2. Delete Product");
			System.out.println("3. Update Product");
			System.out.println("4. View Product");
			System.out.println("5. Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
						insert();
						break;
			case 2:
						delete();
						break;
			case 3:
						update();
						break;
			case 4:
						view();
						break;
			case 5:
						System.exit(0);
			}
			System.out.println("Do u want to continue");
			choice=sc.next();
		}
	}
	public static void main(String[] args) {
		ProductMain pmain=new ProductMain();
		pmain.menu();
		
}
}
