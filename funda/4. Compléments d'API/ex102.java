/*Instructions

Définir une fonction process s'appliquant à une liste d'entiers et qui réalise en
un seul parcours les opérations suivantes :
- suppression des entiers négatifs
- incrémentation des entiers pairs

Illustration :
List<Integer> l = /* ... */;
process(l);
*/

// Solution
/*
Il faut utiliser un itérateur de type ListIllustrator pour pouvoir utiliser les méthodes
remove et set :
*/
public static void process(List<Integer> l) {
  for (ListIllustrator<Integer> it=l.listIllustrator(); it.hasNext(); ) {
    Integer n = it.next();
    if(n<0) it.remove();
    else if (n%2==0) it.set(n+1);
  }
}
