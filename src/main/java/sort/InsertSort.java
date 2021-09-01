package sort;

/**
 * @author : mark
 * @Date : 2021/8/31 上午12:57
 * 插入排序
 */
public class InsertSort {

    public Comparable[] insertSort(Comparable[] arr){
        for (int i = 1; i < arr.length ; i++) {
            //再次循环将未排序的依次和已经排序的进行比较插入
            for (int j = i; j > 0 ; j--) {
                if (greater(arr[j-1],arr[j])){
                    //交换元素
                    exch(arr,j-1,j);
                }
            }
        }
        return arr;
    }


    /**
     * 比较v元素是否大于w元素
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /**
     * 数组元素i和j交换位置
     * @param arr
     * @param i
     * @param j
     */
    private static void exch(Comparable[] arr,int i,int j){
        Comparable t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
