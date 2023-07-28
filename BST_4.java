public class BST_4 {
    // Find Peak Element In an Array :

    public static int peakEle(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end){
            if(arr[mid]<arr[mid+1]){
            start=mid+1;
            }
            else{
                end=mid;
            }
            mid=(start+end)/2;
        }
        // System.out.println("mid"+start);
        return start;
        
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1};
        System.out.print("mid is :"+peakEle(arr));
        
    }
    
}
