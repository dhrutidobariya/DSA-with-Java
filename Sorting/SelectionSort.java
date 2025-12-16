import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[])
    {
        int[] a={-1,3,0,-32,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    
    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    //insrtionsort using max value change
    static void sort1(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxIndex=getMaxValue(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxValue(int[] arr,int start,int last)
    {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}