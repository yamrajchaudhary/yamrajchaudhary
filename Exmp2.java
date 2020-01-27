package ex1;

import java.util.Scanner;

public class Exmp2 {

	public static void main(String[] args) {
		String name;
		String year;
         Scanner sc=new Scanner(System.in);
         while(true)
			{
				int nflag=0;
				int yearflag=0;
				
				
				year=sc.next();
				name =sc.next();
				
				
				if(year.matches("[0-9]+"))
				 {
					yearflag = 0;
				 }
				else {
					System.out.println("invalid year");
					yearflag = 1;
				}
				 
				 for (int i = 0; i < name.length(); i++) {
						if (!name.matches("[0-9]+")) {
							
						}
						else {
							nflag=1;
							System.out.println("invalid name");
							break;
						}
				 }
				 
				 if(nflag==0 && yearflag==0) {
					 break;
				 }
				 
			}
			// System.out.println("invalid input");	
			
			System.out.println(  year + " " + name);
		 
	     
	}

	}