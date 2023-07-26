package Practice;

public class Maxandmin02 {
    public static void main(String[] args) {

        
         

        // 2 -- approach
        int arr[]={10,2,78,254,888,96868};
        int max,min;
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else{
            max=arr[1];
            min=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max is: "+max);
        System.out.println("min is: "+min);
        






        // ---1 Approach
        // int arr[]={1,2,7,8,10};
        // int max=arr[0];  // int max=0;
        // int min=arr[0]; //int min=999;
        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max=arr[i];   
        //     }
        //     if(min>arr[i]){
        //         min=arr[i];
        //     }  
        // }
        // System.out.println("Max Element is : "+max+" ");
        // System.out.print("Minimum Element is :"+min+" ");





    }
    
}
