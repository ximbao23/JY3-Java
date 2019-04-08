public class Text
	{
	public static void main(String[] args)
		{
			int age1 = 18;
			int age2 = 25;
			int num1 = 19;
			long num2 = 12345678901L;
			float num3 = 3.1415926F;
			double num4 = 1234567890.0987654321;
			char ch1 = 97; //a
			char ch2 = 48; //0
			double bird = 0.00045;
			double lightYear = 9460500000000.0 * 4.2;
			double x = 2 * 9.8 * 384;
			System.out.println(age1+age2);
			System.out.println(Integer.toBinaryString(num1));
			System.out.println(Integer.toHexString(num1));
			System.out.println(Integer.toOctalString(num1));
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(ch1);
			System.out.println(ch2);
			System.out.println(lightYear / bird);
			System.out.println(Math.sqrt(x));
		}
	}