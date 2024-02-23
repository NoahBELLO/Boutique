import java.util.ArrayList;

public class Panier {
    /* Attributs */
    private ArrayList<Produit> produits = new ArrayList<>();

    /* Méthode pour ajouter des produits dans le panier */
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public void suppPanier(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom() == nom) {
                produits.remove(produit);
                break;
            }
        }
    }

    /* Méthode pour calculer le prix total du panier */
    public float prixTotalPanier() {
        float prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }

        return prixTotal;
    }

    /* Méthode pour afficher le panier */
    public void afficherPanier() {
        for (Produit produit : produits) {
            produit.afficher();
        }
    }
}