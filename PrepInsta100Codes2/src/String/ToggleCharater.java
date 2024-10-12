package String;

public class ToggleCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Aks Kes Ba";
		String str="";
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) 
				str=str+Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))
				str=str+Character.toUpperCase(ch);
			else
				str=str+ch;
		}
		System.out.println(str);

	}

}
