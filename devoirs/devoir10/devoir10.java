public class MonteCarloPI {

    public static final int NBRE_ESSAIS = 100000;

    public static void main(String[] args) {
        int pointsDansLeCercle = 0;

        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = Math.random(); // Génère un x entre 0 et 1
            double y = Math.random(); // Génère un y entre 0 et 1

            if (x * x + y * y <= 1) {
                pointsDansLeCercle++;
            }
        }

        double piEstime = 4.0 * pointsDansLeCercle / NBRE_ESSAIS;
        System.out.println("pi =~ " + piEstime);
    }
}
