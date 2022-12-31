// Time Complexity : O(logn)
// Space Complexity : O(1)

// Your code here along with comments explaining your approach
// Divide array into two halfs and compare target to mid value, based on that decide which half to discard
// Do this iteratively till we find the target 

class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                r = mid-1;
            else
                l = mid+1;
            
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 