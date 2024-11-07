public class App {
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // Remplir un tableau avec une valeur fixe
    public static int[] remplirTableauAvecValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }
        return tableau;
    }

    // Remplir un tableau avec des valeurs aléatoires
    public static int[] remplirTableauAleatoire(int[] tableau) {
        Random rand = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(21);  // Valeurs entre 0 et 20
        }
        return tableau;
    }

    // Déterminer la taille d'un tableau
    public static int obtenirTailleTableau(int[] tableau) {
        return tableau.length;
    }

    // Afficher le contenu d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    //valeur minimum d'un tableau
    public static int trouverMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    //valeur maximum d'un tableau
    public static int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    // Compter la fréquence d'une valeur dans un tableau
    public static int compterOccurrences(int[] tableau, int valeur) {
        int count = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                count++;
            }
        }
        return count;
    }

    // Calculer la somme des valeurs d'un tableau
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    // Calculer la moyenne des valeurs d'un tableau
    public static double moyenneTableau(int[] tableau) {
        int somme = sommeTableau(tableau);
        return (double) somme / tableau.length;
    }

    // Remplacer une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur) {
                tableau[i] = nouvelleValeur;
            }
        }
        return tableau;
    }

    // Rechercher la première occurrence d'une valeur dans un tableau
    public static int premiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // Pas trouvé
    }

    // Rechercher la dernière occurrence d'une valeur dans un tableau
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // Pas trouvé
    }

    // Méthode main pour tester tout le programme
    public static void main(String[] args) {
        // 1. Créer un tableau de 50 éléments
        int[] tab = creerTableau(50);
        
        // 2. Remplir le tableau avec des valeurs aléatoires
        tab = remplirTableauAleatoire(tab);

        // 3. Afficher la taille du tableau
        System.out.println("Le tableau a une taille de " + obtenirTailleTableau(tab) + " cellules.");

        // 4. Afficher le contenu du tableau
        System.out.println("Contenu du tableau aléatoire :");
        afficherTableau(tab);

        // 5. Trouver la valeur min et max
        System.out.println("La valeur min trouvée = " + trouverMin(tab));
        System.out.println("La valeur max trouvée = " + trouverMax(tab));

        // 6. Remplacer une valeur dans le tableau
        tab = remplacerValeur(tab, 12, 5); // Remplacer 12 par 5
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tab);

        // 7. Calculer la somme et la moyenne
        System.out.println("La somme des cellules du tableau = " + sommeTableau(tab));
        System.out.println("La moyenne des cellules du tableau = " + String.format("%.2f", moyenneTableau(tab)));

        // 8. Recherche des occurrences d'une valeur (ex: 13)
        System.out.println("La valeur 13 a été trouvée à la 1ère position N°" + premiereOccurrence(tab, 13));
        System.out.println("La valeur 13 a été trouvée à la dernière position N°" + derniereOccurrence(tab, 13));
    }
}
