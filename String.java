public class String{  
public static void main(String args[]){  
String strMain ="Welcome to java"; 
String[] arrSplit_3 = strMain.split("\\s");
    for (int i=0; i < arrSplit_3.length; i++){
      System.out.println(arrSplit_3[i]);
    }
  }
}