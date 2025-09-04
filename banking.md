# Banking – Antworten

## 1) Zeilenweise: Bausteine & Begriffe

### `public class BankAccount { ... }`
- **Schlüsselwörter**: `public`, `class`
- **Bezeichner**: `BankAccount`
- **Deklaration** einer Klasse, Klassenrumpf in `{ ... }`, **Token** sind z. B. `public`, `class`, `BankAccount`, `{`, `}`

### `private final String ownerName;`
- **Zugriffsmodifizierer**: `private`
- **final** = Referenzvariable nicht neu zuweisbar
- **Datentyp (Referenztyp)**: `String`
- **Feld/Attribut**: `ownerName`
- **Anweisung**: endet mit `;`

### `public BankAccount(final String ownerName, final int accountNumber, final double balance) { ... }`
- **Konstruktor** (kein Rückgabetyp)
- **Parameterliste** mit **Parametern** (`ownerName`, `accountNumber`, `balance`) jeweils mit **Typ** und optional `final`
- **Rumpf**: Zuweisungen zu den Feldern mittels `this.ownerName = ownerName;` (jeweils **Zuweisungsoperator** `=`)

### `public void deposit(final double amount) { ... }`
- **Methodendeklaration**: `public` + **Rückgabetyp** `void` + **Methodenname** `deposit`
- **Parameter**: `amount` (Typ `double`)
- **Kontrollstruktur**: `if (amount < 0)` → **Ausdruck** in Klammern, **Vergleichsoperator** `<`
- **Methodenaufruf**: `System.out.println(...)` (**Argument** ist der String)

### `public void withdraw(final double amount) { ... }`
- Wie oben; zusätzliche **else-if**-Kaskade mit Vergleich `balance < amount`, **Ausgabe** und **Zuweisung** `balance -= amount;`

### `public double getBalance() { return balance; }`
- **Getter**: Rückgabetyp `double`, **return-Anweisung** mit **Ausdruck** `balance`

### `public class BankDemo { ... }`
- Zweite Klasse mit `main`-Methode (Einstiegspunkt)

### `final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);`
- **Deklaration** einer lokalen Variable `account` (Typ `BankAccount`)
- **Initialisierung**: erste Wertzuweisung bei der Deklaration
- **Allokation**: `new BankAccount(...)` reserviert Speicher für das Objekt auf dem **Heap**
- **Argumente**: `"John Doe"`, `12345`, `1000.0` (passen zu den **Parametern** des Konstruktors)
- `final` bedeutet: die **Referenz** `account` kann nicht auf ein anderes Objekt zeigen; der **Objektzustand** (Felder) darf sich sehr wohl ändern.

### `account.deposit(500.0); account.withdraw(200.0);`
- **Methodenaufrufe** auf dem Objekt `account` mit **Argumenten** (`double`)

### `final double balance = account.getBalance();`
- **Deklaration** + **Initialisierung** eines **primitiven** Typs `double`
- **Wertkopie** (primitive liegen auf dem **Stack/Registers**), im Gegensatz zu Objektreferenzen

### `System.out.println("Current balance: " + balance);`
- **String-Konkatenation** (`+`) erzeugt neuen String, **Argument** an `println`

---

## 2) Methodensignatur – Bestandteile
Am Beispiel `public void withdraw(final double amount)`:
- **Zugriffsmodifizierer**: `public`
- **Rückgabetyp**: `void`
- **Methodenname**: `withdraw`
- **Parameterliste**: `(final double amount)` → Typ + Name (+ evtl. Modifizierer)
- (**throws-Klausel**, **Generics**) – hier nicht vorhanden

Die **voll qualifizierte Signatur** umfasst außerdem Paket- und Klassennamen (z. B. `de.phl.programmingproject.banking.BankAccount#withdraw(double)`).

---

## 3) Deklaration, Initialisierung, Allokation, Zuweisung
Für `final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);`:

- **Deklaration**: `final BankAccount account;` → Name + Typ ist dem Compiler bekannt.
- **Allokation**: `new BankAccount(...)` → Speicher für ein **Objekt** auf dem Heap wird reserviert; Konstruktor läuft.
- **Initialisierung**: Erstzuweisung eines Werts zur Variable (hier gleichzeitig mit der Deklaration).
- **Zuweisung**: `=` weist die **Referenz** auf das neu allokierte Objekt der Variablen `account` zu.

**Speicher-Modell (verkürzt):**
- **Primitives** (`int`, `double` …): Wert wird direkt in der Variable gespeichert (Stack/Registers bei lokalen Variablen).
- **Objekte**: Variable hält nur eine **Referenz** (Adresse). Das eigentliche Objekt liegt auf dem **Heap**.
- `final` bei Referenzen: die Referenz bleibt konstant; das **Objekt** selbst darf intern verändert werden.
