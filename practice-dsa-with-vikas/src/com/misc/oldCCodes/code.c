#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(int argc, char * argv[]){
    int c = atoi(argv[1]);
    clock_t start = clock();
    long k;
    for(int i =0;i<=c;i++){printf("<>");}

    clock_t end = clock();
    clock_t elapse = end - start;
    double double_total = ((double)elapse)/CLOCKS_PER_SEC;
    long long unsigned long_total = ((long long unsigned)elapse)/CLOCKS_PER_SEC;

    printf("Time taken is \n%lf clocks== \n %lf double seconds\n %llu long seconds",double(elapse),double_total,long_total);
    return 0;
    }