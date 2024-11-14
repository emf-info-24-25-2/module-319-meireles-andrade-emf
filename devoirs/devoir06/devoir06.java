public class devoir06 {

    final int TAILLE_TABLEAU = 20;
    final int VALEUR_MIN = 0;
    final int VALEUR_MAX = 50;
    final int VALEUR_RECHERCHEE = 7;

    public static int[] genereTableau(int tailleTableau, int min, int max) {

        int[] tableau = new int[tailleTableau];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;

        }
        return tableau;

    }

    public static int rechercheMin(int[] tableau) {

        int min = tableau[0];

        for (int j = 1; j < tableau.length; j++) {
            if (tableau[j] < min) {
                min = tableau[j];
            }
        }

        return min;
    }

    public static int rechercheMax(int[] tableau) {

        int max = tableau[0];

        for (int k = 1; k < tableau.length; k++) {
            if (tableau[k] > max) {
                max = tableau[k];
            }
        }

        return max;

    }

    public static int rechercheValeur(int[] tableau, int cible) {
        int position = -1;

        for (int f = 0; f < tableau.length; f++) {
            if (tableau[f] == cible) {
                position = f;
            }
        }

        return position;
    }

    public static void main(String[] args) {

        int[] exemple = genereTableau(12, 3, 19);

        int valeurRecherchee = 27;
        
        for (int z = 0; z < exemple.length; z++) {
            System.out.println(exemple[z]);
        }

        int minimum = rechercheMin(exemple);
        int positionMinimum = rechercheValeur(exemple, minimum);
        System.out.println("Le plus petite valeur trouvée est : " + positionMinimum);

        int maximum = rechercheMax(exemple);
        int positionMaximum = rechercheValeur(exemple, maximum);
        System.out.println("Le plus grang valeur toruvée est : " + positionMaximum);

        int Valeur = rechercheValeur(exemple, valeurRecherchee);
        System.out.println("Le nombre [" + valeurRecherchee + "] figure à la position [" + Valeur + "] du tableau");

    }
}