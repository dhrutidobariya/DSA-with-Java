import java.util.Arrays;
public class InsertionSort {

    public static void main(String args[])
    {
        int[] a={-1,3,0,-32,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++){ //a<=arr.length-2
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;// if the one is short then after aena pachhina pn short hoy aetle comapare karvani jarur nathi aetle break
            }
        }
    }
}