package c_annotations;

interface Math{
    int calculate(int number, int otherNumber);
}

public class Annotations {


    @MyAnnotation
    public static void main(String[] args) {
        String sound = "Brum";
        Toyota toyota = new Toyota();
        toyota.carSounds(sound);
    }


    static class car
    {
        public void carSounds(String sound) {
            System.out.println(sound);
        }
    }

    static class Toyota extends car
    {
        @Override
        public void carSounds(String sound) {
            System.out.println("Vroom vroom!");
        }
    }
}
