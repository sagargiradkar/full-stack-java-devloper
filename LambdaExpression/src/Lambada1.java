// Write a p to compute length of string 
@FunctionlInterface
interface CLS
{
	int getLenghth(String str);
}
class LOS implements CLS{
	public int getLenghth(String str) {
		int length = str.length();
		return length;
		
	}
}
public class Lambada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOS obj = new LOS();
		System.out.println(obj.getLenghth("SAGARPRAKASHGIRADKAR"));
		
		CLS cls = str -> str.length();
		System.out.println(cls.getLenghth("565464654564544null"));
	}

}
