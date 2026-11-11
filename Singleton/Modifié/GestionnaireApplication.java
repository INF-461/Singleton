public final class GestionnaireApplication {

    private static GestionnaireApplication instance = null;

    private String nomApplication;
    private int nombreActions;

    // Constructeur prive
    private GestionnaireApplication() {
        nomApplication = "Application Oyoki";
        nombreActions = 0;
    }

    // Creation controlee et securisee de l'unique instance
    public static synchronized GestionnaireApplication getInstance() {
        if (instance == null) {
            instance = new GestionnaireApplication();
        }
        return instance;
    }

    public void definirNomApplication(String nom) {
        this.nomApplication = nom;
    }

    public void enregistrerAction() {
        nombreActions++;
    }

    public String getNomApplication() {
        return nomApplication;
    }

    public int getNombreActions() {
        return nombreActions;
    }

    public void afficherEtat() {
        System.out.println("Nom : " + nomApplication);
        System.out.println("Nombre d'actions : " + nombreActions);
    }

    // Empeche le clonage
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
            "Le clonage du gestionnaire est interdit."
        );
    }
}