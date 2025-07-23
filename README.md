# ADSA_Lab
#include <stdio.h>

void merge(int a[], int lb, int mid, int ub) {
    int i = lb, j = mid + 1, k = 0, b[50];

    while(i <= mid && j <= ub) {
        if(a[i]<=a[j]) {
            b[k]=a[i];
            i++;
            k++;
        } else {
            b[k]=a[j];
            j++;
            k++;
        }
   }
while(i<=mid){
    b[k]=a[i];
    i++;
    k++;
}
while(j<=ub) {
    b[k]=a[k];
    j++;
    k++;
}
 i=lb;
 k=0;
 while(i<=ub) {
     a[i]=b[k];
     i++;
     k++;
 }
}

void mergeSort(int a[], int lb, int ub) {
    if(lb < ub) {
        int mid = (lb + ub) / 2;
        mergeSort(a, lb, mid);
        mergeSort(a, mid + 1, ub);
        merge(a, lb, mid, ub);
    }
}
int main() {
    int arr[50];
    int n, i = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    while(i < n) {
        scanf("%d", &arr[i]);
        i++;
    }

    mergeSort(arr, 0, n - 1);

    printf("Sorted array:\n");
    i = 0;
    while(i < n) {
        printf("%d ", arr[i]);
        i++;
    }

    return 0;
}
