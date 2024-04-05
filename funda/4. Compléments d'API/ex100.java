/*
Instruction 

Utiliser dans la fonction affiche la méthode forEach de Collection à la place de la
boucle de parcours.
Pour rappel, la méthode forEach applique une lambda expression de type cible Consumer aux éléments
de la collection :
@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);
}
*/

// Solution
public static <T> void affiche(Collection<T> l) {
  l.forEach( t -> System.out.println(t) );
}

public static void affiche(Collection<?> l) {
  l.forEach( o -> System.out.println(o) );
}


