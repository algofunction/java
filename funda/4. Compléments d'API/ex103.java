/*Instructions
Définir la fonction dico s'appliquant à une collection de chaînes de caractères et renvoyant en résultat
un tableau associant tous les mots fournis (valeurs) à leurs initiales (clés).

Illustration :
Collection<String> c = /* ... */;
dico(c)
*/

// Solution
static Map<Character, Set<String>> dico(Collection<String> mots) {
  Map<Character, Set<String>> dico = new HashMap<>();
  for (String mot : mots) {
    char initiale = mot.charAt(0);
    Set<String> entree = dico.get(initiale);
    if (entree == null) {
      entree = new HashSet<>();
      dico.put(initiale, entree);
    }
    entree.add(mot);
  }
  return dico;
}
