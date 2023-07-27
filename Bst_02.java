class Bst_02{

    static int firstOcc(int arr[],int k){

        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int ans=-1;
       while(start<=end){
        if(k==arr[mid]){
            ans=mid;
            end=mid-1;   // move in left side
        } 
        else if(k>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2;
       }
        
        return ans; 

    }

   static int SecondOcc(int arr[],int k){

        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int ans=-1;
       while(start<=end){
        if(k==arr[mid]){
            ans=mid;
            start=mid+1;   // move in right side
        }
        else if(k>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2;
       }
        
        return ans;    
    }

    
    // Find First and Last occrance in an array 
    public static void main(String[] args) {
        int arr[]={};
        // int size=8;
        int k=0;
        int first=firstOcc(arr,   k);
        int Second=SecondOcc(arr, k);
        System.out.println("First Occrance : " +first);
        System.out.println("Second Occrance : "+Second);

    }
}