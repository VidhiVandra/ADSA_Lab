#include <stdio.h>

void merge(int arr[], int l, int m, int r) {
    int i = l;
    int j = m + 1;
    int k = 0;
    int temp[50];

    // Merge two sorted halves
    while(i <= m && j <= r) {
        if(arr[i] <= arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements from left half
    while(i <= m) {
        temp[k] = arr[i];
        i++;
        k++;
    }

    // Copy remaining elements from right half
    while(j <= r) {
        temp[k] = arr[j];
        j++;
        k++;
    }

    // Copy temp array to original array
    i = l;
    k = 0;
    while(i <= r) {
        arr[i] = temp[k];
        i++;
        k++;
    }
}

void mergeSort(int arr[], int l, int r) {
    if(l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
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
