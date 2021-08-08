package door;


/**
 * @author zhangguolin
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] r = {30,24,5,58,18,36,12,42,39};
        quickSort(r,0,8);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }

    }

    static void quickSort(int r[],int low,int high){
        if (low<high){
            int mid = partition(r, low, high);
            quickSort(r, low, mid-1);
            quickSort(r, mid+1, high);
        }
    }

    static int partition(int r[],int low,int high){
        int i = low,j=high,pivot=r[low];

        while (i<j){
            while (i<j&&r[j]>pivot){j--;}
            if (i<j){
                int temp = r[i];
                r[i] = r[j];
                r[j] = temp;
                i++;

            }
            while (i<j&&r[i]<=pivot){i++;}
            if (i<j){
                int temp = r[i];
                r[i] = r[j];
                r[j] = temp;
                j--;
            }
        }
        return i;
    }

}
