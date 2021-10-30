package DSA;
//this is the Cyclic sort with the 0(n) time Complexicity
import java.util.Arrays;



public class cyclic_sort {
    public static void main(String[] args) {
        int arr[]={3,5,1,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr){

        int i=0;
        while(i< arr.length)
        {
            int search=arr[i]-1;
            if(arr[i]!=arr[search])
                swap(arr,i,search);
            else
                i++;
        }
        //This is the Swap Method and is used to swap
    private static void swap(int[] arr, int i, int i1) {

        int temp=0;
       temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }


    }
