public class Client {

    public static void main(String[] args) {

        System.out.println("===== TEST DU SINGLETON MODIFIE =====");

        // Recuperation de l'instance
        GestionnaireApplication application1 =
            GestionnaireApplication.getInstance();

        application1.definirNomApplication("OyokiTech Solutions");
        application1.enregistrerAction();

        System.out.println("\nEtat depuis application1 :");
        application1.afficherEtat();

        // Deuxieme recuperation de la meme instance
        GestionnaireApplication application2 =
            GestionnaireApplication.getInstance();

        application2.enregistrerAction();

        System.out.println("\nEtat depuis application2 :");
        application2.afficherEtat();

        // Verification de l'unicite
        System.out.println(
            "\nLes deux references pointent-elles vers le meme objet ? "
            + (application1 == application2)
        );

        // Verification du partage des donnees
        System.out.println(
            "Nom partage : " + application1.getNomApplication()
        );

        System.out.println(
            "Actions partagees : " + application1.getNombreActions()
        );

        if (application1 == application2
                && application1.getNombreActions() == 2) {
            System.out.println("\nTEST REUSSI : Singleton fonctionne.");
        } else {
            System.out.println("\nTEST ECHOUE.");
        }

        System.out.println("===== FIN DES TESTS =====");
    }
}