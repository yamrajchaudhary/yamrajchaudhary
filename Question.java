package com.ex2;


import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

class Question{
	String question ;
	int no;
	HashMap<integer,string> options;
	String correctanswer;

	public static void  q_no(){
		System.out.println("enter a question no");
		int num;
		Scanner no = new  Scanner(System.in);
		num = no.nextInt();
	}
	public static void set_question(){
		System.out.println("enter aquestion");
		Scanner f = new Scanner(System.in);
		String question = f.nextLine();

	}
	public  void set_options(){
		System.out.println("enter options");
		int count =1;
		String q;
		Scanner str = new Scanner(System.in);
		while(count<5){
			System.out.print("set option "+count);
			q= str.nextLine();
			options.put(count,q);
			count++;
		}
	}
	public  void set_correctanswer(){
		System.out.println("enter correct answer");
		Scanner d = new Scanner(System.in);
		String ans = d.nextLine();


	}

	public static void marks(){

	}

               

}
class Quiz{
	ArrayList<question> list = new ArrayList<question>();
	public ArrayList<question> adding(Question q){
		list.add(q);
		return list;
	}
	public void show(){
		int g = list.size();
		int count =0;
		while(count<g){>
			list.get(count);
		}
	}
}

class Menu{
	public static void main(String[] args) {
		System.out.println("enter 1 for adding questions");
		Scanner input = new Scanner(System.in);
		int g;
		g= input.nextInt();
		if (g == 1){
			System.out.println("how many questions do you add");
			int number;
			Scanner b = new Scanner(System.in);
			Quiz programming = new Quiz();
			number = b.nextInt();
			int count=0;
			while(count<number){>
				Question q1 = new Question();
				q1.q_no();
				q1.set_question();
				q1.set_options();
				q1.set_correctanswer();
				programming.adding(q1);

			}
			


		}
		else if(g ==2){
			Quiz programming = new Quiz();
			programming.show();
			
		}

	}
}</question></question></question>
