class Euler_2
 {
 	public static void main(String args[])
 	{ 
 		 int a=1,b=2,c=0,sum=0;
 		for(int i=0;i<4000000;i++)
 		{
 			c=a+b;
 			if(c%2==0)
 			{
 			 sum=c+sum;
 			}
 			a=b;
 			b=c; 
 		}
 		System.out.println("Sum of even fibonacci nos:"+sum);
 	}
 }
