package Conversion;

public class Conversition {
	
	public static void main(String[] args) {
		
		//int value to string value
		
		int x = 10;
		
		String s = Integer.toString(x);
		System.out.println(s);
		
		//Double to string
		
		double y =12.78;
		
		String s1 = Double.toString(y);
		System.out.println(s1);
		
		//string to integer conversion
		String s2 = "12345";
		int x1 = Integer.parseInt(s2);
		System.out.println(x1);
		
		//string to double
		String s3 = "234.345";
		double d1 = Double.parseDouble(s3);
		System.out.println(d1);
		
		//string to long
		String s4 = "45646456";
		long l = Long.parseLong(s4);
		System.out.println(l);
		
		System.out.println(l/4);
		
		//double to integer 
		
		double dd = 6534.34;
		String ds = Double.toString(dd);
		int xx = Integer.parseInt(ds);
		System.out.println("Integer value is : "+xx);
		
	}
}
