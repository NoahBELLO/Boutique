public class ProgrammePrincipal {
    public static void main(String[] args) throws Exception {
        /* Programme Principal */
        System.out.println("Programme de la Boutique");

        /*********************** PRODUITS ***********************/

        /* Création des Produits */
        ProduitAlimentaire produit1 = new ProduitAlimentaire();
        ProduitElectronique produit2 = new ProduitElectronique();
        ProduitBoisson produit3 = new ProduitBoisson();

        /*********************** BOUTIQUE ***********************/

        /* Création d'une instance Boutique */
        Boutique boutique = new Boutique();

        /* Ajout des produits dans la boutique */
        boutique.addProduit(produit1);
        boutique.addProduit(produit2);
        boutique.addProduit(produit3);

        /* Afficher le stock */
        System.out.println();
        boutique.afficherStock();

        /*********************** PANIER ***********************/

        /* Création d'un panier */
        Panier panier = new Panier();

        /* Ajout des produits */
        panier.addProduit(produit1);
        panier.addProduit(produit2);

        /* Afficher le panier */
        System.out.println();
        panier.afficherPanier();

        /* Calcul du panier */
        System.out.println("Voici le prix de votre panier : " + panier.prixTotalPanier() + " euros");
    }
}