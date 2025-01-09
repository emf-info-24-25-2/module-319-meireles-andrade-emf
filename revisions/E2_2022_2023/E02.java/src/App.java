import java.util.Scanner;

public class App {
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    public static final int[] CATEGORIE_SALLE = { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 };

    public static int afficherTarifs() {
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_TROIS + " CHF");
        return 0;

    }

    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle");
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(CATEGORIE_SALLE[i]);
        }
        System.out.println("");

        for (int j = 0; j < occupationSalle.length; j++) {
            if (occupationSalle[j]) {
                System.out.print("O");
            } else {
                System.out.print("X");
            }
        }

        System.out.println(" ");
    }

    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            if (categorie == CATEGORIE_SALLE[i]) {
                if (!occupationSalle[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean[] commanderBillet(boolean[] occupationSalle) {
        System.out.println("Quelle catégore voulez-vous : ");
        Scanner scanner = new Scanner(System.in);
        int categorie = scanner.nextInt();
        int positionPlace = trouverPlace(categorie, occupationSalle);
        if (positionPlace != -1) {
            occupationSalle[positionPlace] = true;
            switch (categorie) {
                case 1:
                    System.out.println(" Votre place est réservée et coûte " + PRIX_CATEGORIE_UN + " CHF");
                    break;
                case 2:
                    System.out.println(" Votre place est réservée et coûte " + PRIX_CATEGORIE_DEUX + " CHF");
                    break;
                case 3:
                    System.out.println(" Votre place est réservée et coûte " + PRIX_CATEGORIE_TROIS + " CHF");
                    break;
                default:
                    System.out.println("Cette catégorie n'existe pas");
                    break;
            }
        } else {
            System.out.println("Aucune place disponible");
        }

        return occupationSalle;
    }

    public static void main(String[] args) {

        boolean[] occupationSalle = new boolean[] { false, false, false, false, false, false, false, false, false,
                false };
        int commande = -1;
        while (commande != 0) {
            System.out.println("----------------------------------------------------------------------------------------------");

            System.out.println(
                    "1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");

            Scanner scanner = new Scanner(System.in);
            commande = scanner.nextInt();

            switch (commande) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                case 1:
                    occupationSalle = commanderBillet(occupationSalle);
                    break;

                case 2:
                    afficherTarifs();
                    break;
                case 3:
                    afficherSalle(occupationSalle);
                    break;

                default:
                    System.out.println("Commande inconnue");
                    break;
            }
        }
    }
}
y