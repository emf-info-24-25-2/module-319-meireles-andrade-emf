public class App {

    //2. Créez les constantes LIBRE, OCCUPEE et TOUCHEE qui contiendront des entiers avec les valeurs 0, 1 et 2. 
    public final static int LIBRE = 0;
    public final static int OCCUPEE = 1;
    public final static int TOUCHEE = 2;

    //3. Créez les constantes TAILLE_GRILLE et NBRE_BATEAUX qui contiendront des entiers avec les valeurs 20 et 5
    public final static int TAILLE_GRILLE = 20;
    public final static int NBRE_BATEAUX = 5;
   
    public static int choisirIndex(int min, int max) {

        int nombreAleatoire = (int)(Math.random() * (max - min + 1)) + min;
        return nombreAleatoire; 

    }

    public static int[] genererGrille(int taille, int nombreBateaux) {
        
        //5.1. Créez un tableau avec la taille passée en paramètre.
        int[] tableau = new int[taille];
        //5.2. Déclarez une variable entière nommée nbreBateauxPlaces que vous initialiserez avec la valeur 0.
        int nbreBateauxPlaces = 0;
        //5.3. Tant que le nombre de bateaux placés est inférieur au nombre de bateaux à placer :
        while (nbreBateauxPlaces < nombreBateaux) {
            
            //5.3.1. Choisissez un index aléatoire dans la grille à l'aide de la méthode choisirIndexAleatoire().
            int index = choisirIndex(nombreBateaux, nbreBateauxPlaces);
            //5.3.2. Si le contenu de la cellule désignée par cet index est libre (le contenu de la cellule est égal à LIBRE): 
            //mettez la valeur OCCUPEE dans cette cellule et incrémentez la variable nbreBateauxPlaces.
            if (tableau[index]==LIBRE) {
                tableau[index]=OCCUPEE;
                nbreBateauxPlaces++;
            }
        }
        return tableau; 
    }

    public static boolean testerGrille(int[]grille) {

        //Créez une méthode nommée testerGrille() qui prend un paramètre un tableau d'entier. Cette méthode 
        //retourne la valeur false s'il y a encore des cellules avec la valeur OCCUPEE dans le tableau passé en paramètre. 
        //S'il toutes les cellules sont LIBRE ou TOUCHEE, la méthode doit retourner true.

        boolean resultatTest = true;

        for (int i = 0; i < grille.length; i++) {
            if (grille[i] == OCCUPEE) {
                resultatTest = false; 
                break;
            }
        }
        
        return resultatTest;
    }

    public static void main(String[] args) throws Exception {
        
        //7.1. Déclarez une variable booléenne nommée jeuTermine à laquelle vous affectez la valeur initiale false.
        boolean jeuTermine = false;
        
        //7.2. Déclarez une variable entière nommée nbreCoups à laquelle vous affectez la valeur initiale 0.
        int nbreCoups = 0;
        
        //7.3. Déclarez une variable nommée grille qui contiendra un tableau d'entiers. Utilisez la méthode 
        //genererGrille() pour créer ce tableau (utilisez les constantes appropriées pour les paramètres de l'appel 
        int[] grille = genererGrille(TAILLE_GRILLE,NBRE_BATEAUX);

        
        //7.4. Tant que le jeu n'est pas terminé:

            //7.4.1. Incrémentez la variable nbreCoups.
            
            //7.4.2. Choisissez aléatoirement un index dans la grille à l'aide la méthode choisirIndexAleatoire().
            
            //7.4.3. Affichez le texte suivant : "Le joueur vise la cellule X." où le X représente l'index choisit aléatoirement 
            //lors de l'étape précédente.

        while (jeuTermine == false) {
            nbreCoups++;
            
            int valeurChoist = choisirIndex(0, TAILLE_GRILLE -1);

        

            //7.4.4. A l'aide d'un switch, testez la valeur contenue dans la cellule de la grille désignée par l'index aléatoire 
            //et implémentez les cas suivants:

                //7.4.4.1. La valeur est LIBRE : affichez "A l'eau" à la console.
                
                //7.4.4.2. La valeur est OCCUPEE : affichez "Touché" à la console et changez la valeur de la cellule de la grille 
                
                //avec TOUCHEE
                
                //7.4.4.3. La valeur est TOUCHEE : affichez "Déjà touchée…"

                switch (grille[valeurChoist]) {
                    case LIBRE :
                        System.out.println("A l'eau");
                        break;

                    case OCCUPEE :
                        System.out.println("Touché");
                        grille[valeurChoist] = TOUCHEE;
                        break;

                    case TOUCHEE : 
                        System.out.println("Déjà touchée…");

                        break;
                
                    default:
                        break;
                }
            
            //7.4.5. Déterminez si le jeu est terminé avec la méthode testerGrille(). Si cette dernière retourne true, 
            //affichez "Le jeu est terminé en X coups" où X représente le nombre de coups qui a été nécessaires et 
            //affectez la valeur true à la variable jeuTermine

            if (jeuTermine == true) {
                System.out.println("Le jeu ets trekné en " + nbreCoups + " coups");
                jeuTermine = true;
            } 
        }

    }

}
