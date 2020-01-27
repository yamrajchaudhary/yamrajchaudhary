class Sorted{ 
  
    // function to print strings in sorted order 
    static void printInSortedOrder(String arr[], int n) { 
        int index[] = new int[n]; 
        int i, j, min; 
  
        // Initially the index of the strings 
        // are assigned to the 'index[]'  
        for (i = 0; i < n; i++) { 
            index[i] = i; 
        } 
  
        // selection sort technique is applied     
        for (i = 0; i < n - 1; i++) { 
            min = i; 
            for (j = i + 1; j < n; j++) { 
                // with the help of 'index[]' 
                // strings are being compared 
                if (arr[index[min]].compareTo(arr[index[j]]) > 0) { 
                    min = j; 
                } 
            } 
  
            // index of the smallest string is placed 
            // at the ith index of 'index[]' 
            if (min != i) { 
                int temp = index[min]; 
                index[min] = index[i]; 
                index[i] = temp; 
            } 
        } 
  
        // printing strings in sorted order 
        for (i = 0; i < n; i++) { 
            System.out.print(arr[index[i]] + " "); 
        } 
    } 
  
    // Driver program to test above 
    static public void main(String[] args) { 
        String arr[] = {"geeks", "quiz", "geeks", "for"}; 
        int n = 4; 
        printInSortedOrder(arr, n); 
    } 
} 
  
// This code is contributed by 29AjayKumar 
Output:

for geeks geeks quiz