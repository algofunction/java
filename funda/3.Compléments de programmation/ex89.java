/*Instructions

Créer la méthode statique ouvre qui s'applique à un jour et indique s'il est ouvré ou non.
Un jour est ouvré si il est de la semaine hors week-end.
*/

// Solution test d'égalité
public static boolean ouvre() {
  return j != JourFR.SAMEDI && j != JourFR.DIMANCHE; 
}

// Solution avec comparaison
public static boolean ouvre(JourFR j) {
  return j.compareTo(JourFR.SAMEDI) <0;
}
