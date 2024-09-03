package java8.filambda.practice;

public class Greet {
	public void greeting() {
		Greeting gm=(str)->{
			System.out.println(str);
		};
		gm.greet("Good Morning");
		Greeting bw=(str)->{
			System.out.println(str);
		};
		gm.greet("Happy Birthday");
	}
	public static void main(String[] args) {
		Greet obj=new Greet();
		obj.greeting();
	}

}
