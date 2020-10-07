
    public class Programmeur extends Employe {
        int projetAchevés;
        final public int facteurGainProjet = 200;

        public Programmeur(String nom, double revenuMensuel, int projetAchevés, int tauxDoccupation) {
            super(nom, revenuMensuel, tauxDoccupation);
            this.projetAchevés = projetAchevés;
        }
        public String getType() {
            return ", c'est un programmeur.";
        }

       public double revenuAnnuel() {
            return super.revenuAnnuel()+projetAchevés*facteurGainProjet;
        }

        public String toString() {
            return super.toString() +
                    "A mené à bien " + projetAchevés + " projets.\n";
        }


        // GETTERS & SETTERS

        public int getProjetAchevés() {
            return projetAchevés;
        }

        public void setProjetAchevés(int projetAchevés) {
            this.projetAchevés = projetAchevés;
        }
    }

