/* Program to demonstrate time taken by function fun() */
#include <stdio.h> 
#include <time.h> 
  long long unsigned int perSecondCount=0;
// A function that terminates when enter key is pressed 
void fun() 
{ 
    printf("fun() starts \n"); 
    printf("Press enter to stop fun \n"); 
    while(1) 
    { 
        perSecondCount++;
        if (getchar() == 'e') 
            break; 
    } 
    printf("fun() ends \n"); 
} 
  
// The main program calls fun() and measures time taken by fun() 
int main() 
{ 
    // Calculate the time taken by fun() 
    clock_t start, end, total;

    start = clock(); 
    fun(); 
    end = clock();

    total = end - start;
    double time_taken = ((double)total)/CLOCKS_PER_SEC; // in seconds 
    
    printf("fun() took %lf seconds to execute \n", time_taken); 
    printf("perSecondCount = %llu\n", perSecondCount); 
    printf("CLOCKS_PER_SECOND took %u seconds to execute \n", CLOCKS_PER_SEC); 
    printf("Start took %u seconds to execute \n", start); 
    printf("End took %u seconds to execute \n", end); 
    printf("Total took %u seconds to execute \n", total); 
    return 0; 
} 

/*
D:\Data Structures and Algo\Practice DS ALGO>g++ code.c

D:\Data Structures and Algo\Practice DS ALGO>a
fun() starts
Press enter to stop fun

fun() ends
fun() took 2.186000 seconds to execute
CLOCKS_PER_SECOND took 1000 seconds to execute
Start took 0 seconds to execute
End took 2186 seconds to execute
Total took 2186 seconds to execute

*/

