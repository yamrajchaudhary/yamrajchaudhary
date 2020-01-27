package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Exmp4 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		  n=sc.nextInt();
          
  		float[] a = new float[n];
  		for(int i=0;i<n;i++) {
  			a[i] = sc.nextFloat();

	}
  		Arrays.sort(a);
		 System.out.printf("Modified arr[] : %s", Arrays.toString(a));
 }
}