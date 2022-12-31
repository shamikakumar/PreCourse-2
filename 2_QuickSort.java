// Time Complexity : O(nlogn)
// Space Complexity : O(logn) (max logn calls in recursion stack)

// Your code here along with comments explaining your approach
class QuickSort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        if(i==j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    int partition(int arr[], int low, int high) 
    { 
   	    int partitionIdx = low;
        int pivot = high;
        for(int i=low;i<high;i++){
            if(arr[i]<arr[pivot]){
                swap(arr,partitionIdx,i);
                partitionIdx++;
            }
        }
        swap(arr,partitionIdx,pivot);
        return partitionIdx;
    } 
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
            // Recursively sort elements before 
            // partition and after partition 
        if(low<high){
        int partitionIdx = partition(arr,low,high);
        sort(arr, low, partitionIdx-1);
        sort(arr, partitionIdx+1, high);
             }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 