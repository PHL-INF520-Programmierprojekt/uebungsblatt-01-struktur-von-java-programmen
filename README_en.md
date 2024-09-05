# Exercise Sheet: Structure of Java programs
[Link to German Version](./README.md)

In this exercise sheet, you will learn to read and understand the structure of simple Java programs.

## Exercise: Implementing a Basic Java Program

You will implement a basic Java program to calculate the total cost of a purchase at a store to practice the Java syntax.
The program should be in the `de.phl.programmingproject.syntax` package.

### Tasks

1. Create a new Java class called `Purchase` in the `de.phl.programmingproject.syntax` package.
2. Declare a public static void main operation.
3. Declare a local variable of type double called `price` and initialize it to a value of your choice.
4. Declare a local variable of type int called `quantity` and initialize it to a value of your choice.
5. Declare a local variable of type double called `discountRate` and initialize it to a value of your choice.
6. Calculate the total cost of the purchase by multiplying the `price` by the `quantity` and subtracting the product by the product of `price`, `quantity`, and `discountRate`.
7. Assign the result to a new variable called `totalCost`.
8. Print the value of `totalCost` using the `System.out.println` operation. The output must contain either "total cost" or "Gesamtkosten".
9. Push your code to the Git repository.

### Example

Here is an example of a Java program that calculates the total cost of a purchase:

```java
public class Purchase {
    public static void main(String[] args) {
        double price = 10.0;
        int quantity = 3;
        double discountRate = 0.2;
        
        double totalCost = price * quantity - price * quantity * discountRate;
        
        System.out.println("The total cost of the purchase is: $" + totalCost);
    }
}
```


## Exercise: Working with a Bank Account

You have been given a program that models a bank account.
The source code is also available in the `de.phl.programmingproject.banking` package.

### Program and Example

```java
public class BankAccount {
    private final String ownerName;
    private final int accountNumber;
    private double balance;

    public BankAccount(final String ownerName, final int accountNumber, final double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(final double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(final double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive.");
        } else if (balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        final double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
    }
}
```

### Tasks

1. Discuss for each line the components this source code consists of.
   Pay attention to the correct technical terms, such as _instruction_, _expression_, _keyword_, _token_, _parameter_, _argument_, etc.
2. Discuss which parts an operation signature consists of.
3. Explain for `final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);` the terms "declaration", "initialisation", "allocation", and "assignment".
   Also consider how objects and primitive datatypes are stored in Java.
4. Submit your answers to task 2 and 3 in a markdown file `banking.md` in the root directory.


**Next Sheet**: [_Foundation of object usage_](Exercise-Sheet-2)
