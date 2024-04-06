/*Instructions

Dans la fonction affiche, remplacez la lambda expression
utilisée par forEach par une référence de méthode.
*/

// Solution
public static <T> void affiche(Collection<T> l) {
  l.forEach( System.out::println );
}

public static <T> void affiche(Collection<?> l) {
  l.forEach( System.out::println );
}
