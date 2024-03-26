/*Instructions
Créer la méthode statique decale s'appliquant à un jour j et à un nombre
n, et qui renvoie le jour j+n.
Par exemple, lundi+2 correspond à un mercredi, et lundi-1 correspond à un dimanche.
*/

/*Solution
Il faut calculer le numéro ordinal du jour à atteindre puis utiliser ce numéro
pour l'extraire du tableau des valeurs énumérées :
*/
public static JourFR decale(JourFR, int n) {
  int num = (j.ordinal() + n) % 7; // num est dans [-6 ; 6]
  if (num < 0)  // cas num dans [-6 ; -1]
    num = 7 + num;  // num est dans [1 ; 6]
  // ici num est dans [0 ; 6]
  return JourFR.values()[num];
}
