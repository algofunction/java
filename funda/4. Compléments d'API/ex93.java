/*Instructions

Modifier la fonction min afin qu'elle puisse s'appliquer à n'importe
quelle collection de Integer.

Illustration :
Collection<Integer> l = /* ... */ ; // [3,8,7,-1,5,8] 
min(l) // -1 
  **/

// Solution
public static Integer min(Collection<Integer> l) {
  if (l.isEmpty()) throw new NoSuchElementException(); // liste vide
  Iterator<Integer> it = l.iterator(); // création d'un itérateur
  Integer min = it.next(); // premier élément de la liste
  while (it.hasNext()) { // parcours du reste de la liste
    Integer n = it.next();
    if (n<min) min = n; // mise à jour de min
  }
  return min;
}
