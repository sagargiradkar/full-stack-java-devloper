/*
interface Demo
  {
  void display();
  
  }
  
  If an interfeace contain only one abstarct method that interface is called functional interface 
  lambda expression and functional interface are works with togethor

	-> arrow operator
	-> lambda operator
	To write lambada expression 
	Divide 2 parts 
	
	-> left part of -> add parameter 
	-> right patt of -> body 
	
	eg:
	()->{ 
		System.out.println("Hello");
	}


 */
//@FunctionalInterface
interface Demo
{
	void display();//Functional Interface
	void add(int a,int b);
	
}

//class Trials implements Demo{
//	public void display() {
//		System.out.println("Hello Java Learners");
//	}
//}
public class TestApp {

	public static void main(String[] args) {
		
		
		Demo d = new Demo() {
			public void display() {
			   System.out.println("Hello iNeuron learners");
			}
			public void add(int a,int b) {
				System.out.println(a+b);
			}
		};
		d.display();
		d.add(100, 200);
		/*
		 * Trials obj = new Trials(); obj.display();
		 */
		/*
		 * Demo d =()-> System.out.println("Hello iNeuron learners");
		 * 
		 * d.display();
		 */
		
		
	}

}