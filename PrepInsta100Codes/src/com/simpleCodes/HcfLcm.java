package com.simpleCodes;

public class HcfLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1=15;
		int number2=15;
		int hcf=1;
		for(int i=1;i<=number1||i<=number2;i++)
		{
			if(number1%i==0&&number2%i==0)
			hcf=i;
		}
        
		System.out.println("HCF is "+hcf);
		int lcm=(number1*number2)/hcf;
		System.out.println("LCM is "+lcm);

	}

}
