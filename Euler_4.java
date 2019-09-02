class Euler_4
 {
 	public static void main(String args[])
 	{ 
 		int tprod=0,prod=0,i,j,r,rev=0,palin=0;
 		for(i=100;i<1000;i++)
 		{
 		 for(j=100;j<1000;j++)
 	  {
 	  	prod=i*j;
 	  	tprod=i*j;
  		while(tprod!=0)
  		{
  			r=tprod%10;
  			rev=rev*10+r;
  			tprod/=10;
  		}
  		if(rev==prod)
  		{
  			if(prod>palin)
  			 palin=prod;	
  		}
  		rev=0;
  		}
 		}
 		System.out.println("Greatest no:"+palin);
 	}
 }
