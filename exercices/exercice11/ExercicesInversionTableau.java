import java.security.PublicKey;

public class ExercicesInversionTableau {

    public static final int MIX = 0;
    public static final int MAX = 100;

    public static void main(String[] args) {
        
        Int[] tableauInitial = new int[4];
        Random random = new Random();
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        System.out.println("Contenu du tableau initial: ");
        for (int i=0; i< tableauInitial.length; i++) {
            System.out.println( tableauInitial[i]);
        }
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        
        // Affiche du tableauFinal (inversé)
        System.out.println("\nContenu du tableau final (inversé) : ");
        for (int valeur : tableauFinal) {
            System.out.println(valeur);
        }
        
    }
    
    
    // Méthode pour inverser un tableau d'entiers
    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        int j = tableau.length - 1;  // Index pour parcourir le tableau inversé
        
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[j];
            j--;
        }
        
        return tableauInverse;
    }


}