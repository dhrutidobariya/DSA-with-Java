import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[])
    {
        int[] a={2,3,1,8,0};//{-1,3,0,-32,2}
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean isChange=false;
            for(int j=1;j<arr.length-i;j++){ //j<=arr.length-i-1

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                isChange=true;
            }

            if(!isChange)//if the array is already sorted then to not iterate over whole array this is used
                break;
        }
    }
}