public final class Singleton {

    private static Singleton instance = null;

    public int x;
    public int y;

    // Constructeur prive sans parametres
    private Singleton() {
        this(0, 0);
    }

    // Constructeur prive avec parametres
    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Retourne l'unique instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Retourne l'unique instance en tenant compte des valeurs initiales
    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int Somme(int x, int y) {
        return x + y;
    }

    public float moyenne(int x, int y) {
        return Somme(x, y) / 2.0f;
    }

    public int Produit(int x, int y) {
        return x * y;
    }

    public void affiche() {
        System.out.println("Je suis une instance Singleton.");
        System.out.println("Valeur de x : " + this.x);
        System.out.println("Valeur de y : " + this.y);
    }

    // Empeche le clonage de l'objet
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
            "Le clonage du Singleton est interdit."
        );
    }
}