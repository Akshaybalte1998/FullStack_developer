package String;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="asaasbbasidblaa";
		StringBuilder sb=new StringBuilder(str);
		int len=sb.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					len--;
					j--;
				}
			}
		}
		System.out.println(sb.toString());
	}

}
