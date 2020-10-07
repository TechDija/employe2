
        public class Manager extends Employe {
            private static double revenuAnnuel;
            int joursVoyagés;
            int nombreClient;
            public final static int facteurGainClient = 500;
            public final static int facteurGainVoyage = 100;

            public Manager(String nom, double revenuMensuel, int joursVoyagés, int nombreClient, int tauxDoccupation) {
                super(nom, revenuMensuel, tauxDoccupation);
                this.joursVoyagés = joursVoyagés;
                this.nombreClient = nombreClient;
            }
            public Manager(String nom, double revenuMensuel, int joursVoyagés, int nombreClient) {
                this(nom, revenuMensuel, joursVoyagés, nombreClient, 100);
            }

            public String getType() {
                return ", c'est un manager.";
            }

            public double revenuAnnuel() {
                return super.revenuAnnuel() + joursVoyagés*facteurGainVoyage + nombreClient*facteurGainClient;
            }

            public String toString() {
                return super.toString() +
                        "A voyagé " + joursVoyagés + " jours et apporté "+
                        + nombreClient + " clients.\n";
            }

            // GETTERS AND SETTERS //
            public int getJoursVoyagés() {
                return joursVoyagés;
            }

            public void setJoursVoyagés(int joursVoyagés) {
                this.joursVoyagés = joursVoyagés;
            }

            public int getNombreClient() {
                return nombreClient;
            }

            public void setNombreClient(int nombreClient) {
                this.nombreClient = nombreClient;
            }
        }
