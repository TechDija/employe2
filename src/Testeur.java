
        public class Testeur extends Employe {
            int erreurCorrigées;
            final public int facteurGainErreur = 10;

            public Testeur(String nom, double revenuMensuel, int erreurCorrigées, int tauxDoccupation) {
                super(nom, revenuMensuel, tauxDoccupation);
                this.erreurCorrigées = erreurCorrigées;
            }

            public String getType() {
                return ", c'est un testeur.";
            }

            public double revenuAnnuel() {
                return super.revenuAnnuel()+erreurCorrigées*facteurGainErreur;
            }

            public String toString() {
                return super.toString() +
                        "A corrigé " + erreurCorrigées + " erreurs.\n";
            }

            //GETTERS & SETTERS

            public int getErreurCorrigées() {
                return erreurCorrigées;
            }

            public void setErreurCorrigées(int erreurCorrigées) {
                this.erreurCorrigées = erreurCorrigées;
            }

        }
