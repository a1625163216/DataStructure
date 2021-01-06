package sort;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[] = {10,1,35,61,89,36,55};

        System.out.println("before："+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("after："+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {//冒泡
        // 冒泡排序 的时间复杂度 O(n^2), 自己写出
        int temp = 0; // 临时变量
        boolean flag = false; // 标识变量，表示是否进行过交换

        //[10,1,35,61,89,36,55]

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //第一次 index=0  10和1 比较   1,10,35,61,89,36,55
        //第二次 index=1  10和35      1,10,35,61,89,36,55
        //第三次 index=2  35和61           1,10,35,61,89,36,55 ...
        //外循环第一次找出最大的，一次找出第二大的
    }
}
