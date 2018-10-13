class Galgenmaennchen {
    private String loesungswort;
    private StringBuilder result = new StringBuilder();

    Galgenmaennchen(String wortZuRaten){
        loesungswort = wortZuRaten;
        System.out.println("Los gehts, das gesuchte Wort hat " +wortZuRaten.length() + " Buchstaben. Tippe einen Buchstaben um das Wort zu erraten: ");

        for (int i = 0; i < loesungswort.length(); i++){
            result.append("-");
        }
        System.out.println(result);
    }

    String RateBuchstabe (Character buchstabe){

        for (int i = 0; i < loesungswort.length(); i++){

            if (loesungswort.charAt(i)== buchstabe) {
               result.setCharAt(i,buchstabe);
            }
            int sindNochStricheVorhanden = result.indexOf("-");
            if (sindNochStricheVorhanden == -1){
                GalgenmaennchenTestDrive.gameWon = true;
            }

        }
        return(result.toString());
    }
}
