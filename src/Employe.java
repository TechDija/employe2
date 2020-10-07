import java.awt.*;
import java.util.Scanner;

/*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        public abstract class Employe {
            final String nom;
            double revenuMensuel;
            int tauxDoccupation = 100;
            double montantPrime = 0;

            public Employe(String nom, double revenuMensuel, int tauxDoccupation) {
                this.nom = nom;
                this.revenuMensuel = revenuMensuel;
                if (this.tauxDoccupation < 10) {
                    tauxDoccupation = 10 ;
                }
                if (this.tauxDoccupation>100) {
                    tauxDoccupation = 100;
                }
                if (this.tauxDoccupation > 10 && this.tauxDoccupation < 101) {
                    this.tauxDoccupation = tauxDoccupation;
                }
                System.out.println("Nous avons un nouvel employé: " + nom + getType());
            }
            abstract String getType();

            public double revenuAnnuel() {
                return (12*revenuMensuel*tauxDoccupation/100) + montantPrime;
            }

            public String toString() {
                String toString = nom + " : \n"
                        +"Taux d'occupation : " + tauxDoccupation
                        + "%. Salaire annuel : " + String.format("%.2f", revenuAnnuel()) + " francs\n";

                String toStringPrime = nom + " : \n"
                        +"Taux d'occupation : " + tauxDoccupation
                        + "%. Salaire annuel : " + String.format("%.2f", revenuAnnuel()) + " francs"
                        + ", Prime : " + String.format("%.2f", montantPrime) + ".\n";
                if (montantPrime!=0) {
                    return toStringPrime;
                }
                else {
                    return toString;
                }
            }

            public void demandePrime() {
                boolean success = false;
                Scanner input;
                double prime;
                int i = 5;

                while (success == false && i!=0) {
                    i = i-1;

                    try {
                        System.out.println("Montant de la prime souhaitée par " + nom + " ?");
                        input = new Scanner(System.in);
                        prime = input.nextDouble();

                        if (prime > (2 * revenuAnnuel()) / 100) {
                            System.out.println("Trop cher!");
                        } else {
                            success = true;
                            montantPrime = prime;
                        }
                    } catch (Exception exc) {
                        System.out.println("Vous devez entrer un nombre!");
                    }
                }
            }

            // GETTERS & SETTERS //

            public String getNom() {
                return nom;
            }
            public double getRevenuMensuel() {
                return revenuMensuel;
            }
            public void setRevenuMensuel(double revenuMensuel) {
                this.revenuMensuel = revenuMensuel;
            }
            public int getTauxDoccupation() {
                return tauxDoccupation;
            }
            public void setTauxDoccupation(int tauxDoccupation) {
                this.tauxDoccupation = tauxDoccupation;
            }

        }
