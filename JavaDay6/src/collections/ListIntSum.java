package collections;
import java.util.*;
public class ListIntSum {
	Scanner sc;
	List<Integer> list2;
	static int noofelements;
	public double sum;
	public double avg;
	
	public ListIntSum() {
		sc=new Scanner(System.in);
		list2=new ArrayList<>();
	}
	public void insert() {
		System.out.println("Enter how many elements you want to insert");
		noofelements=sc.nextInt();
		for(int i=0;i<noofelements;i++) {
			System.out.println("Enter elements:");
			list2.add(sc.nextInt());
		}
	}
	public void sum() {
		for(int i:list2) {
			sum=sum+i;
		}
		System.out.println("the sum is:"+sum);
	}
	public void avg() {
		avg=sum/noofelements;
		System.out.println("the average is:"+avg);
	}
	public static void main(String[] args) {
		ListIntSum obj=new ListIntSum();
		obj.insert();
		obj.sum();
		obj.avg();
	}

}
