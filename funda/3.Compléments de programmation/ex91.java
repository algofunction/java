/*Instructions

Transformer la méthode statique decale qui s'applique à un jour j et à un nombre
n, et qui renvoie le j+n.
Par exemple, lundi+2 correspond à mercredi, et lundi-1 correspond à dimanche.
*/

// Solution
enum JourFR {
  LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;

  public boolean ouvre() {
    return this.compareTo(JourFR.SAMEDI) <0;
  }
  
  public JourFR decale(int n) {
    int num = (this.ordinal() +n) % 7;
    if (num < 0)
      num = 7 + num;
    return JourFR.values()[num];   
  }   
}
