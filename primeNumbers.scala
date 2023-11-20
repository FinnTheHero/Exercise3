import scala.util.boundary, boundary.break
object main
{
    def primeNumbers(number: Int): Boolean = {
        if (number <= 1)
        {
            // Not a Prime Number if its less than 1
            return false    
        }

        for (i <- 2 to Math.sqrt(number).toInt) {
            if (number % i == 0)
            {
                // Not a prime Number
                return false
            }
        }

        // Is a Prime Number
        return true
    }

    def main(args: Array[String]): Unit = {
        // Random number between 1 and 1000
        val n = 555;

        print("Prime Number from 1 to " + n + " is: ")

        for (i <- 1 to n)
        {
            if(primeNumbers(i))
            {
                print(s"$i ")
            }
        }
    }
}