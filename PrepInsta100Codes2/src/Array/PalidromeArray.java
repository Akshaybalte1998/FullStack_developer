package Array;

public class PalidromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-121;
		int rev=0;
	      int temp1=x;
	      if(x<0)
	      {
	    	  while(x<0)
	  	    {
	  	     int temp=x%10;
	  	    rev=rev*10+temp;
	  	    x/=10;
	  	    } 
	      }
	      else
	      {
	    	  while(x>0)
	  	    {
	  	     int temp=x%10;
	  	    rev=rev*10+temp;
	  	    x/=10;
	  	    } 
	      }
	    System.out.println(rev);
	    if(temp1==rev)
	    
	        System.out.println(" true");
	    
	    else
	    	System.out.println("falase");
	    }

}
