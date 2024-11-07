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
            } else if (valeur < nbreMystere) {
                System.out.println("Trop petit, entrez un nouveau nombre :");
            } else {
                System.out.println("Bravo, trouvé !");
            }
        }

        
        scanner.close();

    }
}