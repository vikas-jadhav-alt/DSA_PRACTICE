#include<stdio.h>
#include<stdlib.h>

int binarySearch(int *sortedArray, int size, int dataToFound){
    int mid =0;
    int lowerBound = 0;
    int upperBound = size-1;
    int index = -1;
    int comparisons =0;

    while(lowerBound<=upperBound){
        mid = lowerBound + (upperBound - lowerBound)/2;
        comparisons++;
        if(sortedArray[mid] ==  dataToFound){
            index = mid;
            break;
        }else{
            if(dataToFound > sortedArray[mid])
                lowerBound = mid + 1;
            else
            {
                upperBound = mid-1;
            }
            
        }
    }

    printf("\nComparison made Binary = %d",comparisons);
    return index;

}

int InterpolationSearch(int *sortedArray, int size, int dataToFound){
    int mid =0;
    int lowerBound = 0;
    int upperBound = size-1;
    int index = -1;
    int comparisons =0;

    while(lowerBound<=upperBound){
        mid = lowerBound + ((double)(upperBound - lowerBound)/(sortedArray[upperBound] - sortedArray[lowerBound]))* (dataToFound - sortedArray[lowerBound]);
        comparisons++;
        if(sortedArray[mid] ==  dataToFound){
            index = mid;
            break;
        }else{
            if(dataToFound > sortedArray[mid])
                lowerBound = mid + 1;
            else
            {
                upperBound = mid-1;
            }
            
        }
    }

    printf("\nComparison made interpolation = %d",comparisons);
    return index;

}

int main(int argc, char * argv[]){
    int size = atoi(argv[1]);
    int * array = (int*)malloc(size*sizeof(int));

    for(int i = 2,j=0;i<size+2;i++){
        array[j++] = atoi(argv[i]);
    }
    int dataToFound = atoi(argv[size+2]);

    int index = binarySearch(array,size,dataToFound);
    int index2 = InterpolationSearch(array,size,dataToFound);
    
    if(index == -1)
    printf("\nnot found");
    else
    {
        printf("\n value index = %d",index);
    }
    
    if(index2 == -1)
    printf("\nnot found");
    else
    {
        printf("\n value index2 = %d",index2);
    }
    

}