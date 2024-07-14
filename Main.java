public class Main{
    
    
    
    static int s = Integer.MAX_VALUE;
      static int ss = Integer.MAX_VALUE;
     static int m = Integer.MIN_VALUE;
     static int mm = Integer.MIN_VALUE;
    
    
    
    public static int secondLargest(int arr[], int n){
        if(n < 2){
        return -1;
    }
        
        for(int i =0; i< n ;i++){
            if(arr[i] < s){
                s = arr[i];
                
            }
            if(arr[i] < ss && arr[i] != s){
                ss= arr[i];
            }
        }
        
        return ss;
        
    }
    public static int secondMinimum(int arr[],int n){
        if(n < 2){
        return -1;
    }
        
        for(int i = 0; i< n ; i++){
            if(arr[i] > m){
                arr[i] =m;
                
            }
            if(arr[i] > mm && arr[i] != m){
                arr[i] =mm;
            }
            
        }
        return mm;
    }
    public static void  main(String args[]){
        int [] arr= { 3,7,2,8,1,0,5};
        int n = arr.length;
        int ans1 = secondLargest(arr,n);
        int ans2 = secondMinimum(arr, n);
        
        System.out.print(ans1);
        System.out.println();
        System.out.print(ans1);
        
    }
}