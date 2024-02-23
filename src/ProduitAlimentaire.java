import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {
    /* Attributs */
    private LocalDate dateExpiration;

    /* Constructeurs */
    public ProduitAlimentaire() {
        super();

        this.dateExpiration = LocalDate.of(verificationAnnee(), verificationMois(), verificationJour());
    }

    /* Méthodes pour vérifier les types */
    private int verificationAnnee() {
        int annee;

        while (true) {
            System.out.println("Entrez l'annee : ");
            try {
                annee = Integer.parseInt(getScanner().nextLine());
                if (annee >= 1582 && annee <= 2100) {
                    break;
                } else {
                    System.out.println("Veuillez entrer une annee valide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une annee valide.");
            }
        }

        return annee;
    }

    private int verificationMois() {
        int mois;

        while (true) {
            System.out.println("Entrez le mois : ");
            try {
                mois = Integer.parseInt(getScanner().nextLine());
                if (mois >= 1 && mois <= 12) {
                    break;
                } else {
                    System.out.println("Veuillez entrer un mois valide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une mois valide.");
            }
        }

        return mois;
    }

    private int verificationJour() {
        int jour;

        while (true) {
            System.out.println("Entrez le jour : ");
            try {
                jour = Integer.parseInt(getScanner().nextLine());
                if (jour >= 1 && jour <= 31) {
                    break;
                }
                else{
                    System.out.println("Veuillez entrer un jour valide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer une jour valide.");
            }
        }

        return jour;
    }

    /* Méthode setter et getter */
    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    /* Méthode pour afficher les informations du produit */
    public void afficher() {
        System.out.println(super.toString() + "\nExpire le " + dateExpiration + "\n");
    }
}