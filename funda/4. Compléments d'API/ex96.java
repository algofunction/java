/*Instructions

La classe suivante met en oeuvre l'interface Comparator<Integer>.
Sa méthode compareTo reflète la relation d'ordre sur les entiers:*/
class Comparateur implements Comparator<Integer> {
  public int compare(Integer e1, Integer e2) { return e1 - e2; }
  // (e1 - e2 < 0) <=> (e1 < e2)
}

/*Dans un premier temps, remplacer l'expression renvoyée par compare par une expression équivalente
qui utilise la méthode compareTo de la classe Integer.
Secondement, modifier la classe Comparateur afin qu'elle reflète la relation d'ordre sur des
éléments de type T comparables entre eux.
Grâce à cette classe, la méthode min à un paramètre peut être définie ainsi :
*/
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, new Comparateur <T>()); 
}

// Solution
/*La classe Integer implémente Comparable <Integer> et dispose donc de la méthode compareTo qui
reflète l'ordre naturel des entiers :*/
class Comparateur implements Comparator<Integer> {
  public int compare(Integer e1, Integer e2) {
    return e1.compareTo(e2); // (e1.compareTo(e2)<0) <=> (e1 < e2)
  } 
}

/*Pour généraliser cette classe, il faut substituer un paramètre de type T au type concret
Integer. Pour que la méthode compareTo reste applicable aux objets de type T, il faut contraindre T à être
de type Comparable<T>:*/
static class Comparateur <T extends Comparable <T>>
      implements Comparator<T> {
  public int compare(T e1, T e2) {
    return e1.CompareTo(e2);
  }
}
