import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="1ra ce";
		String s2="care 1";
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		s1.toLowerCase();
		s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2)){
			System.out.println("It is an Anagram");
		}else {
			System.out.println("It is not an Angram");
		}
		

	}

}
