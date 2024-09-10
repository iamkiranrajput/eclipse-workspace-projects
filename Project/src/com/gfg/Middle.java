package com.gfg;
import java.util.*;
public class Middle {
public static void main(String[] args) {
	int[]v= {56,67,30,79};
	 Arrays.sort(v);
     int a=(v.length-1);
     int b=a/2;
     int ans = (v[b]+v[a-b])/2;
     
     System.out.print(ans);
     
}
}
