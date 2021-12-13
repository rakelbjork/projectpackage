package a_lambda;

@FunctionalInterface
interface Villkor{
    boolean testString(String a);
}
public class Lambda {


    public static void main(String[] args) {
        String str = "Peter";
        Villkor startsWithTheLetterP = x -> x.contains("P");
        boolean result = testString(str, startsWithTheLetterP);
        System.out.print("String " + str + " starts with P? : ");
        System.out.print(result);
    }

    private static boolean testString(String str, Villkor villkor)
    {
        return villkor.testString(str);
    }
}
