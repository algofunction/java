/*
Instructions :

La fonction suivante renvoie la plus petite valeur d'une liste d'entiers fournie en paramètre.
Elle provoque une exception si la liste est vide :
public static Integer min(ArrayList<Integer> l) {
 if (l.isEmpty()) throw new NoSuchElementException(); // liste vide
 Integer min = l.get(0); // premier élément de la liste
 for (int i = 1; i < l.size(); i++) // parcours du reste de la liste
  if (l.get(i) < min)
   min = l.get(i); // màj de min
 return min;
}


Le code de la fonction ne comporte rien de spécifique à Arraylist.
Tous les accès au paramètre 1 sont définis par l'interface List(isEmpty, get et size).
Donc, il suffit de déclarer le paramètre 1 avec le type List.*/

// Solution
public static Integer min(List<Integer> l) {
 /* code inchangé... */
}

