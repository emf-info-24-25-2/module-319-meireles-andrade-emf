public class ex12 {

    public static void main(String[] args) {
        
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";


        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());

        
        int positionContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);

        
        char lettrePosition10 = maChaineDeCaractere.charAt(10);
        System.out.println("Le position 17 contient la lettre : " + lettrePosition10);

       
        String monPrenom = "HELOISA";

        // Affichage lettre par lettre
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        //Test pour voir si monPrenom contient la chaîne "test"
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère"  + monPrenom +  " contient test ");
        } else {
            System.out.println("La chaîne de caractère " + monPrenom + " ne contient pas test");
        }
    }

}