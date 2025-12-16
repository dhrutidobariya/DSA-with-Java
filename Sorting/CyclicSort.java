import java.util.Arrays;
public class CyclicSort {
    public static void main(String args[])
    {
        int[] a={2,5,1,3,4,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr){
        int i=0;

        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
                swap(arr,i,correctIndex);
            else
                i++;
        }
    }

    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}