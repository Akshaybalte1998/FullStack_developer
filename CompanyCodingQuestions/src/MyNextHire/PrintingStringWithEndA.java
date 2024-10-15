package MyNextHire;

public class PrintingStringWithEndA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "StAjqapaNa";
        
        String upperInput = input.toUpperCase();
        
        int count = 0;
        
        for (int i = 0; i < input.length(); i++)
        {
            if (upperInput.charAt(i) == 'A')
             {
                // Print the substring from 0 to the current index
                System.out.println(input.substring(0, i + 1));
                count++;
            }
        }
        
        System.out.println("Number of strings ending with character 'A or a': " + count);
	}

}
