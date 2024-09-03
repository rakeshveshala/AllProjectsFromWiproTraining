package practice1;

import java.util.ArrayList;

public class ArrayObjPojoMain {
	static int x=7777;
	static int sal2=0;
	public static void main(String[] args) {
		ArrayObjPojo emp1 = new ArrayObjPojo("HR",30000,9999);
		ArrayObjPojo emp2 = new ArrayObjPojo("TECH",60000,8888);
		ArrayObjPojo emp3 = new ArrayObjPojo("Dev",80000,7777);
		ArrayList<ArrayObjPojo> arr=new ArrayList<>();
		arr.add(emp1);
		arr.add(emp2);
		arr.add(emp3);
		for(ArrayObjPojo k:arr) {
			if(k.getId()==x) {
				k.setDepartment("PHARMACY");
			}
		}
		for(ArrayObjPojo k:arr) {
			System.out.println(k.getDepartment());
		}
	}

}
