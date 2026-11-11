public class Client {

    public static void main(String[] args) {

        System.out.println("===== TEST DU SINGLETON : COURS =====");

        // Le premier appel initialise x et y
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        // Le deuxieme appel recupere la meme instance
        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();

        System.out.println(
            "s1 et s2 sont-ils le meme objet ? " + (s1 == s2)
        );

        System.out.println("Somme de 8 et 3 : " + s1.Somme(8, 3));
        System.out.println("Moyenne de 8 et 3 : " + s1.moyenne(8, 3));
        System.out.println("Produit de 8 et 3 : " + s1.Produit(8, 3));

        System.out.println("===== FIN DES TESTS =====");
    }
}