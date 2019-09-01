class Euler_6
 {
 	public static void main(String args[])
 	{ 
 		double sumsq,sqsum,d,n=100;
 		sumsq=(n*(n+1)*(2*n+1))/6;
 		sqsum=(n*(n+1)/2)*(n*(n+1)/2);
 		d=sqsum-sumsq;
 		System.out.println("Difference:"+d);	
 	}
 }