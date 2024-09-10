package com.gfg;

public class CountDigits {
    static void evenlyDivides(int N){
        
    	  
        int k=N;
        int count=0;
        while(k>=1){
        	
         int v=k%10;
        
         if(v!=0 && N%v==0) {
          count++;
        }
        k=k/10;
        }
//        return count;
        System.out.println(count);
        
    
}  
	
	public static void main(String[] args) {
		evenlyDivides(22074);
//		System.out.println(evenlyDivides(22074));
//		 System.out.println(23%10);
	}

}
