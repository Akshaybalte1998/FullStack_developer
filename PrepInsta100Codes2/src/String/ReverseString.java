package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="akshay";
		
		// 1 using String builder
  
		StringBuilder rev=new StringBuilder(name);
		rev.reverse();
		System.out.println(rev);
		
		int len=name.length();
		String demoRev="";
		for(int i=len-1;i>=0;i--)
		{
			demoRev=demoRev+name.charAt(i);
		}
		
		System.out.println(demoRev);
	}

}
