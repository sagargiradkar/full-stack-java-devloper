@FunctionalInterface
interface Add

{
	void add();
}
@FunctionalInterface
interface Sub
{
	int sub(int num1);
}

//To write lambada expression we are used lambda operator ->
//lambda operator divides into 2 parts 
//left side of lamda operator we write parameters requires
//right side of lambada operator we can write body or implementation 

public class TestLambda {

	public static void main(String[] args) {
		Add a=()->{
			int num1=10;
			int num2=30;
			int result=num1+num2;
			System.out.println(result);
		};
		
		a.add();
		
		Sub s =  num1 ->{
			int res=num1-5;
			System.out.println("Substaction result :: "+res);
			return res;
			
		};
		Sub b=num1 -> num1-545;
		System.out.println(b.sub(5000));
		System.out.println(s.sub(500));

	}

}
