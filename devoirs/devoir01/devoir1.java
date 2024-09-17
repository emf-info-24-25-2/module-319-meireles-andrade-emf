package devoir01;

public class devoir01 {
    public static void main(char[] args) {
        char monAge = 16;

        
        //Relisez bien la donnée, int n'est pas tout à fait
        //le bon choix pour estMajeur. Il faut une variable 
        //qui permet de stocker si oui ou non la personne est majeure.
        //changez ceci et corrigez la suite de l'exercice
        
        int estMajeur = "non";
        
        System.out.println("Je m'appelle Meireles Andrade Heloisa ");
        System.out.println("Mon age est de : " + monAge + "ans");
        
        if (monAge > 20) {System.out.println("Je suis majeur");
         }
        else System.out.println("Je suis pas ancore majeur");
        }
     }      

