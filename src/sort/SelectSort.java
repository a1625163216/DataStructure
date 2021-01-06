package sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10); //
        }
        System.out.println("before："+ Arrays.toString(arr));
        selectSort(arr);
        System.out.println("after："+Arrays.toString(arr));
    }

    public static  void selectSort(int[] arr){//选择排序
        // 4,6,8,7,9,2,10,1
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int min=arr[i];
            for (int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                   min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
            // 4,6,8,7,9,2,10,1
            //外层第1趟： 1,6,8,7,9,2,10,4
            //外层第2趟： 1,2,8,7,9,6,10,4
            //外层第3趟： 1,2,4,7,9,6,10,8
            //....
            //外层第7趟： 1,2,4,6,7,8,9,10
        }
    }
}
