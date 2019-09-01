class Euler_4
 {
 	public static void main(String args[])
 	{ 
 		double prod=0,i,j;
 		for(i=100;i<1000;i++)
 		{
 		 for(j=100;j<1000;j++)
 		 {
  			if(i*j>prod)
  			 prod=i*j;
  		}
 		}
 		System.out.println("Greatest no:"+prod);
 	}
 }