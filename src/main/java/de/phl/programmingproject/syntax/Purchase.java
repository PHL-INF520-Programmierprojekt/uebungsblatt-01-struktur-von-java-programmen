package de.phl.programmingproject.syntax;

public class Purchase {
    public static void main(String[] args) {
        // Lokale Variablen
        double price = 10.0;       // Beispielpreis
        int quantity = 3;          // Beispielmenge
        double discountRate = 0.2; // 20 % Rabatt

        // Berechnung der Gesamtkosten:
        // price * quantity - (price * quantity * discountRate)
        double totalCost = price * quantity - price * quantity * discountRate;

        // Ausgabe muss "total cost" oder "Gesamtkosten" enthalten
        System.out.println("Total cost: " + totalCost);
    }
}
