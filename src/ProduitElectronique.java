public class ProduitElectronique extends Produit {
    /* Attributs */
    private int dureeGarantie;

    /* Constructeurs */
    public ProduitElectronique() {
        super();

        this.dureeGarantie = verificationDureeGarantie();
    }

    /* Méthode pour vérifier le type */
    private int verificationDureeGarantie() {
        int garantie;

        while (true) {
            System.out.println("Entrez la duree de la garantie : ");
            try {
                garantie = Integer.parseInt(getScanner().nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une duree de garantie valide.");
            }
        }

        return garantie;
    }

    /* Méthode setter et getter */
    public int getdureeGarantie() {
        return dureeGarantie;
    }

    public void setdureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    /* Méthode pour afficher les informations du produit */
    public void afficher() {
        System.out.println(super.toString() + "\nGarantie = " + dureeGarantie + " mois\n");
    }
}