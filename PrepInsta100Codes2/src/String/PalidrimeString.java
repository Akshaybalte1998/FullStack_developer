package String;

public class PalidrimeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Radar";
		
		// 
		name=name.toLowerCase();
		System.out.println(name);
		System.out.println("using StringBUilder");
		String rev=new StringBuilder(name).reverse().toString();
		System.out.println(rev);
		if(rev.equals(name))
		
			System.out.println("String is palidrome");
			
		
		else
			System.out.println("string is not palidrome");
		
		System.out.println("using for loop");
		int len=name.length();
		String reverse="";
		for(int i= len-1;i>=0;i--)
		{
			reverse=reverse+ name.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equals(name))
			
			System.out.println("String is palidrome");
			
		
		else
			System.out.println("string is not palidrome");
	}

}
