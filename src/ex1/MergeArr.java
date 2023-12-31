//package ex1;
//import java.util.Arrays;
//
//public class MergeArr {
//    public static void main(String[] args) {
//        int[] a = {5, 1, 6, 2, 3, 4};
//        a = mergeSort(a);
//        System.out.println(Arrays.toString(a));
//    }
//    public static void merge(int[] a, int[] l, int[] r, int left, int right){
//        int i = 0, j = 0, k = 0;
//        while (i < left && j < right) {
//            if (l[i] <= r[j]) {
//                a[k++] = l[i++];
//            }
//            else {
//                a[k++] = r[j++];
//            }
//        }
//        while (i < left) {
//            a[k++] = l[i++];
//        }
//        while (j < right) {
//            a[k++] = r[j++];
//        }
//    }
//    public static void divArr(int[] a, int n) {
//        if (n < 2) {
//            return;
//        }
//        int mid = n / 2;
//        int[] l = new int[mid];
//        int[] r = new int[n - mid];
//
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
//        divArr(l, mid);
//        divArr(r, n - mid);
//
//        merge(a, l, r, mid, n - mid);
//    }
//    public static int[] mergeSort(int[]a){
//        int n = a.length;
//        divArr(a, n);
//        return a;
//    }
//}
