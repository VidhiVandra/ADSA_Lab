#include <stdio.h>

int main() {
    int n;
    printf("Number of Array: ");
    if (scanf("%d", &n) != 1 || n <= 0) {
        printf("Invalid number!\n");
        return 1;
    }

    int arr[n];
    printf("Enter Array lengths:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Simple Bubble Sort
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }

    printf("Optimal storage order: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    // MRT Calculation using cumulative sum
    long cumulative = 0, total = 0;
    for (int i = 0; i < n; i++) {
        cumulative += arr[i];
        total += cumulative;
    }
    double mrt = (double) total / n;

    printf("Minimum Retrieval Time (MRT): %.2f\n", mrt);
    return 0;
}
