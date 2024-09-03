package generics;

public class Demo<T> {
	public T input;
	public Demo(T input) {
		this.input=input;
	}
	public T getNum() {
		return input;
	}
	
	public static void main(String[] args) {
		Demo<Integer> obj=new Demo<Integer>(78);
		System.out.println(obj.getNum());
		Demo<String> obj2=new Demo<String>("Rakesh");
		System.out.println(obj2.getNum());
	}

}
