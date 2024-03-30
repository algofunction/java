/*
Instructions

Modifier la fonction min afin qu'elle puisse s'appliquer à n'importe quelle
collection d'éléments comparables entre eux.
Ces éléments seront représentés par un type générique T contraint à mettre
en oeuvre Comparable<T>.

Illustration :
Collection<Integer> c1 = /* ... */ ; // [3, 8, 7, -1, 5, 8]
Collection<String> c2 = /* ... */ ; // ["table", "maison", "abricot"]
min(c1) // - 1
min(c2) // "abricot"
*/

// Solution
/*
Le code comporte un élément spécifique à Integer : l'opérateur<.
Le type Integer est maintenant généralisé à un type T contraint à
mettre en oeuvre Comparable<T>.
La méthode compareTo peut donc être utilisée comme substitut à l'opérateur
< : 
*/
public static <T extends Comparable<T>> T min(Collection<T> l) {
  if (l.isEmpty()) throw new NoSuchElementException();
  Iterator<T> it = l.iterator();
  T min = it.next();
  while (it.hasNext()) {
    T n = it.next();
    if (n.compareTo(min)<0) min = n;
  }
  return min;
}
