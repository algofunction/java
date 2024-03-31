/*Instruction
La fonction min est fondée sur l'ordre naturel des éléments de la collection
qu'elle manipule.
On souhaite maintenant généraliser cette relation d'ordre.

Dans ce but, définir une surcharge de la fonction min qui s'applique :
- à une collection d'éléments T non contraints à être comparables entre eux
- et à un objet de type Comparator<T> qui définit une relation d'ordre sur T.

La fonction min doit renvoyer la plus petite valeur selon ce comparateur.
*/

// Solution
/*Il n'y a pas de contrainte sur T et l'expression n.compareTO(min)<0
est remplacée par c.compare(n, min)<0 :
*/
public static <T> T min(Collection<T> l, Comparator<T> c) {
  if (l.isEmpty()) throw new NoSuchElementException();
  Iterator<T> it = l.iterator();
  T min = it.next();
  while (it.hasNext()) {
    T n = it.next();
    if (c.compare(n, min)<0) min = n;
  }
  return min;
}
