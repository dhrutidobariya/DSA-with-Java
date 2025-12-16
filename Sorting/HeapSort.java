import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Heap_sort {

    public static void main(String[] args) {
        int[] a={1,12,9,5,6};
        heapSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static void heapSort(int[] arr,int n){
        //convert into maxheap
        for(int i=n/2-1;i>=0;i--){ //first non leaf in tree at the n/2-1 pos
            maxHeapify(arr,n,i);
        }
        //heap sort->swap root with last element
        for(int i=n-1;i>=0;i--)
        {swap(arr,0,i);
        // Heapify root element to get highest element at root again
        maxHeapify(arr,i,0);}//last root element delete
    }

    static void maxHeapify(int[] arr,int n, int i){
        int largest=i;

        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left] > arr[largest])
            largest=left;

        if(right<n && arr[right] > arr[largest])
            largest=right;

        if(largest!=i)
        {   swap(arr,i,largest);
            maxHeapify(arr,n,largest);}
    }
}