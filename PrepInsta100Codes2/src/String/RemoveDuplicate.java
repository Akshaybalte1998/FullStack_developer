package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="asaasbbasidblaa";
		String str1="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char cur=str.charAt(i);
			
			if(str1.indexOf(cur)==-1)
			{
				str1=str1+cur;			}
		}
		System.out.println(str1);
		System.out.println(str1.length());
	}

}
