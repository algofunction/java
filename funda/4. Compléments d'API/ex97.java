/*
Instructions

La classe Comparateur n'a d'autre intérêt que de fournir un objet de type
Comparator à l'appel de min.
Supprimer cette classe, puis remplacer son instance dans l'appel de min par :
1. une instance de classe anonyme,
2. une lambda expression conforme au type cible Comparator 
3. une référence de méthode.
*/

// Solution 
// Version avec instance de classe anonyme
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, new Comparator<T>() {
    public int compare(T o1, T o2) {
      return o1.compareTo(o2);
    }
  });
}

// Version avec lambda expression (forme générale)
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, (T o1, T o2) -> { return o1.compareTo(o2); }); 
}

// Version avec lambda expression (forme simplifiée)
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, (o1, o2) -> o1.compareTo(o2) ); 
}

// Version avec méthode compareTo de l'interface Comparable <T>
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, Comparable<T>::compareTo);  
}




