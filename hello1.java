package practice_pgm;

public class hello1 {
	static void print(String str,int no)
	{
		for(int i=1;i<=no;i++)
		{
			System.out.print(str.substring(str.length()-no));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print("hello",2);
		print("hello",3);
		print("hello",4);
		print("hello",5);
		// TODO Auto-generated method stub

	}

}
