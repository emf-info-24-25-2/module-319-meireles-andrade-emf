public class formativeE2 {

final static int PRIX_CATEGORIE_UN = 25;
final static int  PRIX_CATEGORIE_DEUX = 18;
final static int PRIX_CATEGORIE_TROIS = 12;
public static final int[] CATEGORIE_SALLE = new int[] {3, 3, 2, 2, 1, 1,
    2, 2, 3 ,3};

public static void main(String[] args) {
        
    int[] OCCUPATION_SALE = new boolean[10];
    afficherSalle(OCCUPATION_SALE);
}

public static void afficherTarifs(String[] categoriePlace){
    System.out.println("Ctégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
    System.out.println("Ctégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
    System.out.println("Ctégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
}

public static void afficherSalle(boolean[] occupationSalle){
    //écrire "Occupation de la salle :"
    System.out.println("Occupation de la salle :");
    //parcourir et afficher CATEGORIE_SALLE
    
    //faire un println
    System.out.println();
    //parcourir et afficher OCCUPATION_SALLE
    for (int i = 0; i < occupationSalle.length; i++){
       //tester si vrai -> O, sinon X
       if (i == true) {
        System.out.println("O");
        
       } else {
        System.out.println("X");
       }
    }
}
}

