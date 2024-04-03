/*Instructions

Définir une fonction max renvoyant la plus grande valeur d'une collection
d'objets comparables entre eux en utilisant min et une lambda expression
adaptée en guise de compateur.

Exemple d'utilisation :
Collection<Integer> c1 = /* ... */ ; // [3, 8] 
Collection<String> c2 = /* ... */ ; // ["table", "maison"]
max(c1) // 8 
max(c2) // "table" 
*/
  
// Solution
/*Il suffit d'inverser la relation d'ordre naturel en renvoyant l'opposé du résultat de
compareTo :
*/
public static <T extends Comparable<T>> T min(Collection<T> l) {
  return min(l, (o1, o2) -> o2.compareTo(o1));
}


  
