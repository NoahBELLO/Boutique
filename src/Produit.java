import java.util.Scanner;

public abstract class Produit {
    /* Attributs */
    private String nom;
    private String description;
    private float prix;
    private Scanner scanner = new Scanner(System.in);

    /* Constructeurs */
    public Produit() {
        System.out.println();

        System.out.println("Entrez le nom du produit : ");
        this.nom = scanner.nextLine();

        System.out.println("Entrez la description du produit : ");
        this.description = scanner.nextLine();

        this.prix = verificationPrix();
    }

    /* Méthode pour vérifier le type */
    private float verificationPrix() {
        float prix;

        while (true) {
            System.out.println("Entrez le prix du produit : ");
            try {
                prix = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un prix valide.");
            }
        }

        return prix;
    }

    /* Méthodes setter et getter */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Scanner getScanner() {
        return scanner;
    }

    /* Méthodes abstraite */
    public abstract void afficher();

    /* Méthode toString */
    @Override
    public String toString() {
        return "Nom = " + nom + "\nDescription = " + description + "\nPrix = " + prix + " euros";
    }
}