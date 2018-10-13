public class Galgenmännchen {
    private String loesungswort;
    private StringBuilder result = new StringBuilder();

    public Galgenmännchen(String wortZuRaten){
        loesungswort = wortZuRaten;

        for (int i = 0; i < loesungswort.length(); i++){
            result.append("-");
        }
    }

    public String RateBuchstabe (Character buchstabe){

        for (int i = 0; i < loesungswort.length(); i++){

            if (loesungswort.charAt(i)== buchstabe) {
               result.setCharAt(i,buchstabe);
            }
            int sindNochStricheVorhanden = result.indexOf("-");
            if (sindNochStricheVorhanden == -1){
                GalgenmännchenTestDrive.gameWon = true;
            }

        }
        return(result.toString());
    }
}
