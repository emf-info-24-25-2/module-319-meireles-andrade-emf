import java.util.Random;

public class devoir08 {

public static final String[] CARACTERES = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
    };

    public static final int NBR_ESSAI = 5;
    public static final int TAILLE_MOT_DE_PASSE = 15;

    
    public static String genereMotDePasse(int taille) {
        String resultat = "";
        Random random = new Random();

        while (resultat.length() < taille) {
            int position = random.nextInt(CARACTERES.length); 
            resultat += CARACTERES[position]; 
        }

        return resultat; 
    }

    public static void main(String[] args) {
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE); 
            System.out.println(motDePasse); 
        }
    }

}
