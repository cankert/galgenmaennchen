import java.util.Scanner;

public class GalgenmännchenTestDrive {
    public static boolean gameWon = false;
    public static Scanner Scanner = new Scanner(System.in);
    public static void main (String[] args){

        String wortZuRaten = "";

        Galgenmännchen galgenmännchen = new Galgenmännchen("KATRIN");
        System.out.println("Los gehts, tippe einen Buchstaben um das Wort zu erraten: ");
        while ( gameWon == false) {
            char rateBuchstabe = getUserInput();
            String loesungswort = galgenmännchen.RateBuchstabe(rateBuchstabe);
            System.out.println(loesungswort);
        }
        System.out.println("Du hast gewonnen!");
        Scanner.close();
    }

    static char getUserInput(){
        char result = Character.toUpperCase(Scanner.next().charAt(0));
        return result;
    }


}
