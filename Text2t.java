import java.util.Random;
public class Text2t
	{
	public static void main(String[] args)
		{
			Random r = new Random();
			//int rInt = r.nextInt(26);
			//System.out.println(rInt);
			char c = (char)('A' + r.nextInt(26));
			System.out.print(c);
		}
	}