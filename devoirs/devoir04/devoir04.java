import java.util.Scanner;

public class devoir04 {

    public static void main(String[] args) {
       
        int year, month, day;

        // Scanner pour obtenir les valeurs d'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Lecture des valeurs pour le jour, le mois et l'année
        System.out.print("Entrez l'année : ");
        year = scanner.nextInt();
        System.out.print("Entrez le mois : ");
        month = scanner.nextInt();
        System.out.print("Entrez le jour : ");
        day = scanner.nextInt();

        
        System.out.println("La date entrée est le " + day + "." + month + "." + year);

        // Vérification de l'année
        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
            return;
        }

        // Vérification du mois
        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
            return;
        }

        // Nombre de jours maximum en fonction du mois
        int maxDay = 31;
        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                // Vérifier l'année est bissextile
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
        }

        // Vérification du jour
        if (day < 1 || day > maxDay) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        // Convertir mois en texte
        String moisTexte = "";
        switch (month) {
            case 1: moisTexte = "janvier"; break;
            case 2: moisTexte = "février"; break;
            case 3: moisTexte = "mars"; break;
            case 4: moisTexte = "avril"; break;
            case 5: moisTexte = "mai"; break;
            case 6: moisTexte = "juin"; break;
            case 7: moisTexte = "juillet"; break;
            case 8: moisTexte = "août"; break;
            case 9: moisTexte = "septembre"; break;
            case 10: moisTexte = "octobre"; break;
            case 11: moisTexte = "novembre"; break;
            case 12: moisTexte = "décembre"; break;
            default: moisTexte = "invalide";
        }

        
        System.out.println("La date formatée est le " + day + " " + moisTexte + " " + year);
    }
}