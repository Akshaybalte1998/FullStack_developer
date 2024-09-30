package String;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name : ");
		
		char input=sc.next().charAt(0);
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
			System.out.println(" given charater is vowel");
		else
			System.out.println("given charter is not vowel");
		
		
		
		//String name=sc.nextLine();
		//System.out.println(" name : "+name);
	}

}
