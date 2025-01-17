public class Loto {

    public static final int NBRE_CHIFFRES = 6;
    public static final int MIN = 0;
    public static final int MAX = 42;

    public static void main(String[] args) {
        int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);

        System.out.println("Tirage du loto :");
        for (int chiffre : tirage) {
            System.out.println(chiffre);
        }
    }

    public static int[] genereTirage(int nbreChiffres, int min, int max) {
        int[] tirageArray = new int[nbreChiffres];
        int index = 0;

        while (index < nbreChiffres) {
            int chiffre = (int) (Math.random() * (max - min + 1)) + min;

            boolean dejaPresent = false;
            for (int i = 0; i < index; i++) {
                if (tirageArray[i] == chiffre) {
                    dejaPresent = true;
                    break;
                }
            }

            if (!dejaPresent) {
                tirageArray[index] = chiffre;
                index++;
            }
        }

        return tirageArray;
    }
}