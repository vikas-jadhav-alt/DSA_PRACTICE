#include <stdio.h>
#include <stdlib.h>
int partition(int * arr, int start, int end);
void quickSort(int * arr, int start, int end){
    
    if(start<end){
    int p = partition(arr,start,end);
    quickSort(arr, start, p-1);
    
    quickSort(arr, p+1,end);
    }
    return;
}

int partition(int * arr, int start, int end){
    int pivot = arr[end];
    int pindex = start;
    for(int i=start;i<=end-1;i++){
        if(arr[i]<=pivot){
            int temp = arr[i];
            arr[i]=arr[pindex];
            arr[pindex] = temp;
            pindex++;
        }
    }
            int temp = arr[end];
            arr[end]=arr[pindex];
            arr[pindex] = temp;
    return pindex;
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
  
    for (int i = 2, j = 0; i < size + 2; i++)
    {
        array[j++] = atoi(argv[i]);
    }
    printf("\n Before");
    display(array, size);
    quickSort(array, 0, size - 1);
    printf("\n After");
    display(array, size);
    return 0;
}