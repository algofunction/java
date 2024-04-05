/*Instructions

La fonction suivante affiche sur la sortie standard les éléments d'un objet de type ArrayList<Integer> fourni en paramètre :*/

public static void affiche(ArrayList<Integer> l) {
  for (int i=0; i<l.size(); i++)
   System.out.println(l.get(i));
}

/*Modifier la fonction afin qu'elle puisse s'appliquer à n'importe quelle collection d'éléments quelconques.
*/
// Solution
// Fonction renvoyant un élément de l (l est non vide) :
public static <T> T extract(Collection<T> l) {
  return l.iterator().next(); // résultat de type T
}

// Fonction renvoyant un entier de l (l est non vide) :
public static <T extends Number> int extract(Collection<T> l) {
  return l.iterator().next().intValue(); // méthode de Number
}

// Au final, on retient les 4 variantes suivantes :
public static <T> void affiche(Collection<T> l) {
  for (Iterator<T> it = l.iterator(); it.hasNext(); )
    System.out.println(it.next());
}

public static <T> void affiche(Collection<T> l) {
  for (T t : l) System.out.println(t);
}

public static void affiche(Collection<?> l) {
  for (Iterator<?> it = l.iterator(); it.hasNext(); )
    System.out.println(it.next());
}

public static void affiche(Collection<?> l) {
  for (Object o : l) System.out.println(o);
}
