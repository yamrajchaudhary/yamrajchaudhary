package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Exmp5 {

	public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int[] a = new int[n];
    		int[] sorta = new int[n];
    		for(int i=0;i<n;i++) {
    			a[i] = sc.nextInt();
    		}
    		Arrays.sort(a);
    		 System.out.println("Min is" + a[0]);
    		 System.out.println("Max is" + a[n-1]);
	}

}