# Übungsblatt: Struktur von Java-Programmen
[Link to English version](./README_en.md)

In diesem Übungsblatt lernen Sie, die Struktur von einfachen Java-Programmen zu lesen und zu verstehen.

## Übung: Ein einfaches Java-Programm implementieren

Um die Java-Syntax zu üben, werden Sie ein einfaches Java-Programm implementieren, um die Gesamtkosten eines Einkaufs in einem Geschäft zu berechnen.
Das Projekt soll im Paket `de.phl.programmingproject.syntax` implementiert werden.

### Aufgaben

1. Legen Sie eine neue Java-Klasse mit dem Namen `Purchase` im Paket `de.phl.programmingproject.syntax` an.
2. Deklarieren Sie eine `public static void main` Methode.
3. Deklarieren Sie eine lokale Variable vom Typ `double` mit dem Namen `price` und initialisieren Sie sie mit einem Wert Ihrer Wahl.
4. Deklarieren Sie eine lokale Variable vom Typ `int` mit dem Namen `quantity` und initialisieren Sie sie mit einem Wert Ihrer Wahl.
5. Deklarieren Sie eine lokale Variable vom Typ `double` mit dem Namen `discountRate` und initialisieren Sie sie mit einem Wert Ihrer Wahl.
6. Berechnen Sie die Gesamtkosten des Einkaufs, indem Sie den `price` mit der `quantity` multiplizieren und das Produkt durch das Produkt von `price`, `quantity` und `discountRate` subtrahieren.
7. Weisen Sie das Ergebnis einer neuen Variable mit dem Namen `totalCost` zu.
8. Geben Sie den Wert von `totalCost` mit der `System.out.println`-Methode aus. Die Ausgabe muss entweder "total cost" oder "Gesamtkosten" beinhalten.
9. Laden Sie Ihren Code in das Git-Repository hoch.


### Beispiel

Hier ist ein Beispiel für ein Java-Programm, das die Gesamtkosten eines Einkaufs berechnet:

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

## Übung: Arbeiten mit einem Bankkonto

Ihnen wurde ein Programm zur Verfügung gestellt, das ein Bankkonto modelliert.
Der Quellcode ist ebenfalls im Paket [`de.phl.programmingproject.banking`](src/main/java/de/phl/programmingproject/banking/) verfügbar.


### Programm und Beispiel

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

### Aufgaben

1. Diskutieren Sie für jede Zeile die Komponenten, aus denen dieser Quellcode besteht.
   Achten Sie auf die korrekten technischen Begriffe, wie _Anweisung_, _Ausdruck_, _Schlüsselwort_, _Token_, _Parameter_, _Argument_ usw.
2. Diskutieren Sie, aus welchen Teilen eine Methodensignatur besteht.
3. Erklären Sie für `final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);` die Begriffe "Deklaration", "Initialisierung", "Allokation" und "Zuweisung".
   Berücksichtigen Sie auch, wie Objekte und primitive Datentypen in Java gespeichert werden.
4. Laden Sie für die zweite und dritte Aufgabe eine Markdown-Datei `banking.md` mit Ihren Antworten in das Hauptverzeichnis hoch.
