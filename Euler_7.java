

 class Euler_7
 {
 	public static void main(String args[])
 	{ 
 		int num=1,ctr=0,i,n=10001;
 	  while (ctr<n)
     {
      for (i=2;i<=num;i++)
      {
        if (num%i == 0)
        {
          break;
        }
      }
      if (i==num)
      {
        ctr=ctr+1;
      }
      ++num;
    }
    System.out.print("10001st prime no. is:"+num);
 	}
 }
