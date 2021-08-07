package door;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("quit")){
            System.out.println(input);
            input = sc.nextLine();
        }

    }

    void quickSort(int r[],int low,int high){
        if (low<high){
            int mid = partition(r, low, high);
            quickSort(r, low, mid-1);
            quickSort(r, mid+1, high);
        }
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b=temp;
    }

    int partition(int r[],int low,int high){
        int i = low,j=high,pivot=r[low];

        while (i<j){
            while (i<j&&r[j]>pivot)j--;
            if (i<j){
                swap(r[i++],r[j]);
            }
            while (i<j&&r[i]<=pivot)i++;
            if (i<j){
                swap(r[i],r[j--]);
            }
        }
        return i;
    }


}
