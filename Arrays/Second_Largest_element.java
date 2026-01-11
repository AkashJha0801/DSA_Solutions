class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length ;
        
        // method 1 brute force
        
        // if(n < 2){
        //     return -1 ; 
        // }
            
        // Arrays.sort(arr) ;
        // int max = arr[n-1] ;
        
        // for(int i = n - 2 ; i >= 0 ; i--){
            
        //     if(arr[i] != max){
        //         return arr[i] ;
        //     }
        // }
        // return - 1 ;
        
        // method 2  optimal
        
        int max2 = Integer.MIN_VALUE ;
        int max = Integer.MIN_VALUE ;
        
        if(n < 2){
            return -1 ;
        }
        
        if(arr[0] > max){
                max = arr[0] ;
            }
            
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max2 = max ;
                max = arr[i] ;
            }
            else if(arr[i] < max && arr[i] > max2){
                max2 = arr[i] ;
            }
        }
        
        if(max2 == Integer.MIN_VALUE){
            return -1 ;
        }
        
        return max2 ;
    }
}
