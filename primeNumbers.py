def primeNumbers(number):
    if number <= 1:
        # Not a Prime Number if its less than 1
        return 0
    
    for i in range(2,int(number**0.5) + 1):
        if number % i == 0:
            # Not a prime Number
            return 0
    
    # Is a Prime Number
    return 1

if __name__ == "__main__":
    # Random number between 1 and 1000
    n = 555
    
    print("Prime Number from 1 to " + str(n) + " is: ", end="")

    # Looping over numbers from 1 to n
    for i in range(1,n):
        if primeNumbers(i):
            print(str(i) + " ", end="")