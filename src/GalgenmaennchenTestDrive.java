import java.util.Scanner;

public class GalgenmaennchenTestDrive {
    static boolean gameWon = false;
    private static Scanner Scanner = new Scanner(System.in);
    private static int tries = 8;
    public static void main (String[] args){

        String wortZuRaten = "";

        Galgenmaennchen galgenmaennchen = new Galgenmaennchen("SIMBA");
        while (!gameWon) {
            char rateBuchstabe = getUserInput();
            String loesungswort = galgenmaennchen.RateBuchstabe(rateBuchstabe);
            System.out.println(loesungswort);
            tries--;
            if (tries == 0){
                System.out.println("Du hast verloren!");
                System.exit(0);
            } else if (tries == 1){
                System.out.println("Noch "+tries+" Versuch!");
            } else {
                System.out.println("Noch "+tries+" Versuche!");
            }
        }
        System.out.println("Du hast gewonnen!");
        Scanner.close();
    }

    private static char getUserInput(){
        return Character.toUpperCase(Scanner.next().charAt(0));
    }


}
