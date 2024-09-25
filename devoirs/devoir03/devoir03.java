public class devoir03 {
    
    public static void main(String[] args) {
        
        int jour;
        int mois;
        int annee;

        jour = 25;
        mois = 9;
        annee = 24;
        
        if (annee < 0 || annee > 9999) {
            System.out.println("Année invalide !");
            return;
        }
        
        if (mois < 1 || mois > 12) {
            System.out.println("Mois invalide !");
            return;
        }
        
        
        boolean anneeBissextile = false;
        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                if (annee % 400 == 0) {
                    anneeBissextile = true; 
                }
            } else {
                anneeBissextile = true; 
            }
        }
        
        int joursDansLeMois;
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                joursDansLeMois = 31;
                break;
            case 4: case 6: case 9: case 11:
                joursDansLeMois = 30;
                break;
            case 2:
                joursDansLeMois = anneeBissextile ? 29 : 28;
                break;
            default:
                joursDansLeMois = 0; 
                break;
        }
        
        if (jour < 1 || jour > joursDansLeMois) {
            System.out.println("Jour invalide !");
            return;
        }
        
        // Calcul pour du jour dans l'année
        int jourDeLAn = 0;
        
        
        for (int m = 1; m < mois; m++) {
            switch (m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    jourDeLAn += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    jourDeLAn += 30;
                    break;
                case 2:
                    jourDeLAn += anneeBissextile ? 29 : 28;
                    break;
            }
        }
        
        
        jourDeLAn += jour;

        
        System.out.printf("Le %d/%d/%d est le jour %d de l'An.%n", jour, mois, annee, jourDeLAn);
        
        
        System.out.printf("Le 1/1/%d est le jour 1 de l'An.%n", annee);
        System.out.printf("Le 26/10/%d est le jour %d de l'An.%n", annee, calculerJourDeLAn(26, 10, annee));
    }
    
    
    public static int calculerJourDeLAn(int jour, int mois, int annee) {
        boolean anneeBissextile = (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0));
        int joursDansLeMois;
        int jourDeLAn = 0;

        for (int m = 1; m < mois; m++) {
            switch (m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    jourDeLAn += 31;
                    break;
                case 4: case 6: case 9: case 11:
                    jourDeLAn += 30;
                    break;
                case 2:
                    jourDeLAn += anneeBissextile ? 29 : 28;
                    break;
            }
        }
        
        jourDeLAn += jour;
        return jourDeLAn;
    }

}