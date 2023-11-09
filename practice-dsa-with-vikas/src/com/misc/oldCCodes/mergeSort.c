#include <stdio.h>
#include <stdlib.h>
int *b = NULL;

void merging(int *a, int low, int mid, int high)
{
    int l1, l2, i;
    for (l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++)
    {
        if (a[l1] <= a[l2])
            b[i] = a[l1++];
        else
            b[i] = a[l2++];
    }
    while (l1 <= mid)
        b[i++] = a[l1++];
    while (l2 <= high)
        b[i++] = a[l2++];
    for (i = low; i <= high; i++)
        a[i] = b[i];
}
void sort(int *a, int low, int high)
{
    int mid;
    if (low < high)
    {
        mid = (low + high) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merging(a, low, mid, high);
    }
    else
    {
        return;
    }
}

void display(int *arr, int size)
{
    printf("\n[ ");
    for (int i = 0; i < size; i++)
    {
        printf("%d, ", arr[i]);
    }
    printf("] ");
}

int main(int argc, char *argv[])
{
    int size = atoi(argv[1]);
    int *array = (int *)malloc(size * sizeof(int));
    b = (int *)malloc(size * sizeof(int));

    for (int i = 2, j = 0; i < size + 2; i++)
    {
        array[j++] = atoi(argv[i]);
    }
    printf("\n Before");
    display(array, size);
    sort(array, 0, size - 1);
    printf("\n After");
    display(b, size);
    return 0;
}