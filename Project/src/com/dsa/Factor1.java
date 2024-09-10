package com.dsa;

public class Factor1 {
	static int countFactor(int n) {
		int count=0;	
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {		
				if(i!=n/i) {
					count=count+2;

				}
				else {
					count=count+1;	

				}
			}
		}
		return count;
	}
static long fact(int n) {
	  long factorial = 1;
      for (int i = 1; i <= n; i++) {
          factorial *= i;
      }
      return factorial;
  }

	public static void main(String[] args) {
		System.out.println(countFactor(12));
		System.out.println(fact(5));
	}
}
