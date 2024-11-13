import java.util.Scanner;

public class devoir05 {

    public static void main(String[] args) {
        
        int nbreMystere = (int)(Math.random() * 100) + 1;

        
        Scanner scanner = new Scanner(System.in);
        int valeur = 0; 

        // Tant que l'utilisateur n'a pas trouvé le nombre
        while (valeur != nbreMystere) {
            System.out.print("Entrez une valeur svp : ");
            valeur = scanner.nextInt();

            // Comparer la valeur de l'utilisateur avec le nombre aléatoire
            if (valeur > nbreMystere) {
                System.out.println("Trop grand, entrez un nouveau nombre :");
                //RIF: avec ce sout, quand vous jouez, cela vous dira 2 fois d'entrer un nombre (car on recommence la boucle et il y a ce message)
                // arrangez-vous pour que ça soit plus proche du résultat demandé dans la consigne.
                // pensez aussi à compter le nombre de tentatives du joueur!
            } else if (valeur < nbreMystere) {
                System.out.println("Trop petit, entrez un nouveau nombre :");
            } else {
                System.out.println("Bravo, trouvé !");
            }
        }

        
        scanner.close();

    }
}
