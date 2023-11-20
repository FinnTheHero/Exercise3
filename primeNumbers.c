#include <stdio.h>

int primeNumbers(int number)
{
    if (number <= 1)
    {
        // Not a Prime Number if its less than 1
        return 0;
    }

    for (int i = 2; i*i <= number; i++)
    {
        if (number % i == 0)
        {
            // Not a Prime Number
            return 0;
        }
    }


    // Is a Prime Number
    return 1;
}

int main()
{
    // Random number between 1 and 1000
    int n = 555;

    printf("Prime Number from 1 to %d is: ", n);

    // Looping over numbers from 1 to n
    for (int i = 1; i <= n; i++)
    {
        if (primeNumbers(i))
        {
            printf("%d ",i);
        }
    }

    return 0;
}