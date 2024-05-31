
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Number system
		//=> base-2 ,base-8,base-10,base-16
		
		Integer i1 = Integer.valueOf("100",2);
		System.out.println(i1);
		System.out.println("MAX_RADIX => "+ Character.MAX_RADIX);
		System.out.println("MIN_RADIX => "+ Character.MIN_RADIX);
		
		
		Integer i = new Integer(130);
		//result =  minrange + (total - mazrange - 1)
		
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
		Character c = new Character('a');
		char c1 = c.charValue();
		System.out.println(c1);
		
		Boolean b1 = new Boolean("true");
		
		//valueOf()   => convert String/Primitive to wrapper type
		//XXvalueOf() => convert Wrapper type to Primitive type
		//parseXXX()  => converts String to primittive type
		
		
		boolean b2 = b1.booleanValue();
		System.out.println(b2);
		
		int i11 =Integer.parseInt("10");
		System.out.println(i11);
		
		boolean b3 = Boolean.parseBoolean("Sachin");
		System.out.println(b3);
		
		double d1 = Double.parseDouble("10.01");
		System.out.println(d1);
		
		
		
		int i5=Integer.parseInt("100",2);
		System.out.println(i5);
		
		String s1 = Integer.toString(10);
		String s2 = Boolean.toString(true);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String a1 = Integer.toString(7,2);
		String a2 = Integer.toString(17,2);
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		String b11 = Integer.toBinaryString(7);
		String b111 = Integer.toOctalString(10);
		String b1111 = Integer.toHexString(70);
		
		System.out.println(b11);
		System.out.println(b111);
		System.out.println(b1111);
		
		
		
		String sa = String.valueOf(true);
		System.out.println(sa);
		
		String data = String.valueOf(sa);
		System.out.println(data);
		
	}

}