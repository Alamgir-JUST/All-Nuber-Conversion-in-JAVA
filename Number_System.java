package Conversion;

public class Number_System {

	public static void main(String[] args) {
		
		//decimal to binary
		int dec=90;
		String binary = Integer.toBinaryString(dec);
		System.out.println("Binary value is : "+binary);
		
		String oc = Integer.toOctalString(dec);
		System.out.println(oc);
		
		//Binary to decimal
		String s = "1011010";
		int dc = Integer.parseInt(s, 2);
		System.out.println("Decimal of "+s+" "+dc);
		
		//hexadecimal to decimal
		String hd = "ABCd";
		int dcc = Integer.parseInt(s, 16);
		System.out.println(dcc);
	}

}
