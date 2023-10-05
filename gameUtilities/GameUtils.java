package gameUtilities;

public class GameUtils {
    private GameUtils() {
        throw new IllegalStateException("Util class");
    }

    public static void slowType(String inputString) throws InterruptedException {
        long limitL = 50;
        long limitR = 150;

        char[] inputChars = inputString.toCharArray();

        for(int i = 0; i < inputChars.length; i++) {
            System.out.print(inputChars[i]);
            Thread.sleep(limitL + (long) (Math.random() * (limitR - limitL)));
        }
        System.out.println("");
    }

    public static void slowType(String inputString, long speed) throws InterruptedException {
        long limitL = speed / 2;
        long limitR = (long) (speed * 1.5);

        char[] inputChars = inputString.toCharArray();

        for(int i = 0; i < inputChars.length; i++) {
            System.out.print(inputChars[i]);
            Thread.sleep(limitL + (long) (Math.random() * (limitR - limitL)));
        }
        System.out.println("");
    }
}