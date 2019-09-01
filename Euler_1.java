class Euler_1
 {
 	public static void main(String args[])
 	{ 
 		int a=0;
 		for(int i=1;i<1000;i++)
 		{
 			if(i%3==0||i%5==0)
 			 a=a+i;
 		}
 		System.out.println("Sum:"+a);
 	}
 }