/*

Todays topic 
============
1.import statment
2.static import
3.pacages and its usage
4.instanceof vs isInstance()

compiler => current class ,Explicit , Implicit 
*/
//informing the compiler plz search for ArrayList class in "java.util"
import java.util.*;//implicit import
import java.util.ArrayList;//Explicit import
import static java.lang.Math.*;//static import * refers to the class static element
import static java.lang.System.out;
import static java.lang.Byte.*;
class Student 
{
	static 
	{
		System.out.println("Student .class file is loading");
	}
	
	Student()
	{
		System.out.println("Student constructor called");
	}
}
public class TestApp {
	
	static
	{
		System.out.println("TestApp.class file id loading by jvm");
	}
	public static void main(String[] args) {
		Student st = new Student();
		
		ArrayList a1 = new ArrayList();
		
		System.out.println(Math.sqrt(25));
		System.out.println(random());
		System.out.println(sqrt(500));
		
		out.println("Sagar");
		out.println("Prakash");
		out.println("Giradkar");
		
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
	}
	}

/*
 javac =>serach for the required class information on 
 		a.cwd
 		b.Did the programmer specified where the class is available
 		
 		
 		case 1: Types of Import Statment
 		1] Implicit import
 		2] Explicit import 
 */
