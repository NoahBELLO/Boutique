public class ProduitBoisson extends Produit {
    /* Attributs */
    private float quantite;

    /* Constructeurs */
    public ProduitBoisson() {
        super();

        this.quantite = verificationQuantite();
    }

    /* Méthode pour vérifier le type */
    private float verificationQuantite() {
        float quantite;

        while (true) {
            System.out.println("Entrez la quantite : ");
            try {
                quantite = Float.parseFloat(getScanner().nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une quantite valide.");
            }
        }

        return quantite;
    }

    /* Méthode setter et getter */
    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    /* Méthode pour afficher les informations du produit */
    public void afficher() {
        System.out.println(super.toString() + "\nQuantite = " + quantite + " centilitres");
    }
}