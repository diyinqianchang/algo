package door;

public class MergeSort {

    public static void main(String[] args) {

    }

    static void mergeSort(int a[],int low,int high){
        if (low < high){
            int mid = (low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }

    static void merge(int a[],int low,int mid,int high){

        int b[] = new int[high-low+1];
        int i = low,j=mid+1,k=0;
        while (i<=mid && j<=high){
            if (a[i]<a[j]){
                b[k++] = a[i++];
            }else {
                b[k++] = a[j++];
            }
        }
        while (i<=mid){
            b[k++] = a[i++];
        }
        while (j<=high){
            b[k++] = a[j++];
        }
        for (i = low,k=0; i <= high ; i++) {
            a[i] = b[k++];
        }
    }
}
