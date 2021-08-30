package sort;

/**
 * @author : mark
 * @Date : 2021/8/26 下午12:32
 * 快速排序：
 * 1. 基准值，分区
 */
public class QuickSort {

    public int[] quick(int[] arr,int start,int end){

        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) {
            arr=quick(arr,start,i-1);
        }
        if (j+1<end){
            arr=quick(arr,j+1,end);
        }
        return arr;
    }
}
