import java.util.Arrays; 
  
public class SortExample 
{ 
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 
Output:

Modified arr[] : [6, 7, 9, 13, 21, 45, 101, 102]