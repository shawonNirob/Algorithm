package sortingAlgorithms;

public class MergeSort {
    public void mergeSort(int A[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(A, left, mid);
        mergeSort(A, mid + 1, right);
        merge(A, left, mid, right);
    }

    public void merge(int A[], int left, int mid, int right) {
        int leftSize = mid - left + 1, rightSize = right - mid;
        int L[] = new int[leftSize];
        int R[] = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < rightSize; i++) {
            R[i] = A[mid + 1 + i];
        }
        int l = 0, r = 0, a;
        for (a = left; l < leftSize && r < rightSize; a++) {
            if (L[l] < R[r]) {
                A[a] = L[l];
                l++;
            } else {
                A[a] = R[r];
                r++;
            }
        }
        while (l < leftSize) {
            A[a] = L[l];
            a++;
            l++;
        }
        while (r < rightSize) {
            A[a] = R[r];
            a++;
            r++;
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 5, 6, 3, 8, 4, 7, 2};
        int n = A.length - 1;
        MergeSort cal = new MergeSort();
        cal.mergeSort(A, 0, n);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}
