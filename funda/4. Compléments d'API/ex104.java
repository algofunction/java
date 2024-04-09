/*Instructions

Adapter la fonction dico afin qu'elle regroupe les mots fournis par taille et non plus
par initiale. Illustration : 
Collection<String> c = /*...*/;
dico(c)
*/
  
// Solution
/*L'adaptation est de remplacer le type Character par Integer et de remplacer le calcul de l'initiale
(char initiale = mot.charAt(0)) par le calcul de la longueur du mot (int nbl = mot.length()).
*/ 
public static Map<Integer, Set<String>> dico(Collection<String>mots){
  Map<Integer, Set<String>> dico = new HashMap<>();
  for (String mot : mots) {
    int nbl = mot.length();
    Set<String> entree = dico.get(nbl);
    if (entree == null) {
      entree = new HashSet<>();
      dico.put(nbl, entree);    
    }
    entree.add(mot);
  }
  return dico;
}
