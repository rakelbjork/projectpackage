

### Funcational interface / Lamba Expressions

Definiera ett funktionellt interface Villkor, med en abstract metod som tar in en String och returnerar en boolean (beroende på om ett visst villkor är uppfyllt, t.ex. om första bokstaven i strängen är "p" eller något annat.)
Skapa en metod vars parametrar är dels en String, dels en parameter av samma typ som ditt interface. Anropa din metod med en teststräng och ett lämpligt lambda-uttryck.

Metoden skall sedan returnera sant eller falskt beroende på om strängen uppfyllde det givna villkoret.

Kodex:
```java
    @FunctionalInterface
    interface Villkor{
    // innehåll 
    }   
    
    public class main {
        public static void main(String[] args) {
            Villkor startsWithTheLetterP = // lambda-expression
            String str = // innehåll
            boolean result = testString(str, startsWithTheLetterP);
            System.out.println(result);
        }
        
        private static boolean testString(String str, Villkor villkor)
            // innehåll
            return //innehåll
    }
```

### Streams

Skapa en Enum _Gender_ som håller enumerationerna MALE och FEMALE.  
Skapa en klass _Person_ med fälten (variablerna)  
```java 
private String name, 
private Gender gender, 
private double salary
```  
Skapa en lista, och fyll den med 10 stycken sådana personer.
  
Med hjälp av streams, räkna ut:  
1. Snittlönen för kvinnorna respektive männen i listan
2. Vem som har högst lön
3. Vem som har lögst lön.

### Annotations

Skapa en egen annotation, och annotera något med din nya annotation.

Förklara i en kommentar i ditt program (yay för snygga lösningar)

### Factory Pattern

Skapa en class _Car_  
Skapa en bilfabrik, med hjälp av factory pattern  
Skapa ett antal olika bilar med hjälp av din bilfabrik.

### Date and Time
Skapa en metod som tar in tid och datum i en viss tidzon, och sedan returnerar vad tid och datumet är i en annan tidzon vid samma tidpunkt.

T.ex. användaren matar in att klockan är 12:36 den 7 Februari 2019 i Paris, och vill veta vad tiden vid samma tidpunkt var i Tokyo.  
Metoden returnerar då att vid samma tidpunkt i Japan var det klockan och datumet 02:36 den 8 februari 2019.

Kodex:
```java
    private static ZonedDateTime convertTime(ZonedDateTime originalZoneDateTime, ZoneId otherZone){
        //        
        // Gör något
        //
        return zonedDateTimeForOtherZone;
    }
```

### Regular Expressions

Skapa en lista av ord. Använd reguljära uttryck för att filtrera ut alla ord som innehåller 2 eller fler vokaler  
(a, e, i, o, u, y, å, ä och ö)

### Threads

Räkna ut antalet primtal inom intervallet 0 till 500'000.  
Dela upp intervallet på 2 eller flera trådar, som var för sig räknar på antalet primtal inom sin tilldelade del parallellt.
Det enklaste är ju att t.ex. låta en tråd ta en första del (typ 0 till 350'000) och en annan tråd resten (i det exemplet 350'001 till 500'000). men det är givetvis tillåtet med något mer avancerat upplägg också.

### Reflections

Skapa en klass _Patient_ som har en _privat_ metod, som skriver ut några hemliga sjukdomar ur patientjournalen.  
Kodex:
```java
private void printSecretJournal(){
     System.out.println("Patienten har kroniskt näshår, brustet hjärta samt multipel tv-personlighet")
        }
```
  
Skapa ett objekt av din patient i din main-klass. Hitta ett sätt att köra den privata metoden med hjälp av Reflections, och få ut din patients sekretessbelagda hemligheter.


