package practice1;

public class ArrayObjPojo {
	private String department;
	private int salary;
	private int id;
	public ArrayObjPojo(String department,int salary,int id) {
		this.department=department;
		this.salary=salary;
		this.id=id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
