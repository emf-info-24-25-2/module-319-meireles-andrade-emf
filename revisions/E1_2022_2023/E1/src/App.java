public class App {

    public static final int TEMPS_MIN = 35;
    public static final int TEMPS_MAX = 75;

    public static int[] gerererTemps ( int tailleTableau, int TEMPS_MIN, int TEMPS_MAX) {
        
        int[] tableau = new int [tailleTableau];

        for (int i = 0; i < tableau.length; i++) {
            int nombre1 = (int) (Math.random() * (TEMPS_MAX - TEMPS_MIN + 1)) + TEMPS_MIN;
            tableau[1] = nombre1;
        }

        return tableau;

    }

    public static int positionMeilleurTemps ( int[]tabTemps ) {
 
            int minIndex = 0; 
            
            // On parcourt le tableau pour trouver la plus petite valeur
            for (int i = 1; i < tabTemps.length; i++) {
                if (tabTemps[i] < tabTemps[minIndex]) {
                    minIndex = i; // Si on trouve une valeur plus petite, on met à jour l'index
                }
            }
        return minIndex;
    }

    public static int calculQaulification ( String[]riders, int[]tabTemps) {
        
        
        String[] ridersRestants = new String[riders.length / 2];

        for (int i = 0; i < ridersRestants.length; i++) {
            
        }
        
        return riders;
    }

    public static void main(String[] args) throws Exception {

    }
}
