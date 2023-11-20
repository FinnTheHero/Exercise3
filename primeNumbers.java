public class primeNumbers {
    static boolean primeNums(int number)
    {
        if(number <= 1)
        {
            // Not a prime number if its less than 1
            return false;
        }

        for (int i = 2; i*i <= number; i++)
        {
            if (number % i == 0)
            {
                // Not a prime number
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args)
    {
        // Random number between 1 and 1000
        int n = 555;
        System.out.print("Prime Numbers between 1 and " + n + " is: ");

        // Loop over numbers from 1 to n
        for (int i = 1; i <= n; i++)
        {
            if(primeNums(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}