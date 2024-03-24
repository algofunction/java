/*Instructions :

Adapter la méthode main à cette nouvelle version de saisieIntervalle.
*/

// Solution
public static void main(String[] args) throws IOException {
  int x = -2, y = 18;
  try {
    int v = saisieIntervalle(x, y);
    System.out.println(x + "_<=_" + v + "_<=_" + y);
  }
  catch (HorsIntervalleException e) {
    System.out.println("Valeur_hors_intervalle");
  }
  catch (NumberFormatException e) {
    System.out.println("Erreur_de_saisie");  
  }
}
