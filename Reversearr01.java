package Practice;

public class Reversearr01 {
    public static void main(String[] args) {
        
        int arr[]={23,74,18,41,22,20};
        int first=0;
        int last=arr.length-1;
        int c=0;
        while(first<=last){
            c= arr[first];
            arr[first]=arr[last];
            arr[last]=c;

            first++;
            last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
       
        
        

    }
    
}
