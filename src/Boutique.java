import java.util.ArrayList;

public class Boutique {
    /* Attributs */
    private ArrayList<Produit> produits = new ArrayList<Produit>();

    /* Méthode pour ajouter des produits dans la boutique */
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    /* Méthode pour supprimer des produits dans la boutique */
    public void suppProduit(String nom) {
        for (Produit produit : produits) {
            if (produit.getNom() == nom) {
                produits.remove(produit);
                break;
            }
        }
    }

    /* Méthode pour récupérer la liste des produits dans le boutique */
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    /* Méthode pour afficher le stock de la boutique */
    public void afficherStock() {
        for (Produit produit : produits) {
            produit.afficher();
        }
    }
}