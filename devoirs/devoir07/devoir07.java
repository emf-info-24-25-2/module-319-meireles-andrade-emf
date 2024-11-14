public class devoir07 {

    final static int TAILLE_TABLEAU = 10;
    final static int MIN_NOMBRE = -8;
    final static int MAX_NOMBRE = +8;
    final static int VALEUR_RECHERCHEEà = 7;

    public static int[] genererValeursAleatoires(int nombreDeValeursGenerees, int min, int max) {
        int[] tableau = new int[nombreDeValeursGenerees];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableau;
    }

    public static int positionValeur(int[] tableau, int nombre) {
        
        int position = -1;

        int nombre = 12;

        for (int f = 0; f < tableau.length; f++) {
            if (tableau[f] == nombre) {
                position = f;
            }
        }

        return position;

    }

    public static void main(String[] args){


    int[] tableauVA = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);
    
    int valeurMin = positionValeur(tableauVA, MAX_NOMBRE);
    System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU +" valeurs");
    System.out.println("Les deux dernières valeurs sont : ");//je pas compris la phrase
    System.out.println("Le valeur " + nombre + );
    }
}
