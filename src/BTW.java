public class BTW {

    public static String haalLandcodeUitBTWNummer (String btwNummer) {
        return btwNummer.substring (0, 2);
    }

    private Werelddeel europa;

    public BTW (Werelddeel europa) {
        this.europa = europa;
    }

    public double getBTWPercentage (String landcode) {

        if (landcode.equals ("NL")) {
            return 21.0;
        }
        else if (europa.landLigtInEuropa (landcode)) {
            return 0.0;
        }
        else {
            return 21.0;
        }
    }
}
