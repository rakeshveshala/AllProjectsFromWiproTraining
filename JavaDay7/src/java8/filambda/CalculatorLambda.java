package java8.filambda;

public class CalculatorLambda {
	public void operation() {
		Calculator caladd=(x,y)-> {
			System.out.println(x+y);
		};
		caladd.calculate(87, 34);
	}
	public static void main(String[] args) {
		CalculatorLambda obj=new CalculatorLambda();
		obj.operation();
	}

}
