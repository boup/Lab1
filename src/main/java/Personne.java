
import java.io .*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

    public class Personne implements java.io.Externalizable
    {
        private String nom ;
        private String prenom ;
        private String city;
        public Personne (String nom, String prenom, String city) {
            this.nom = nom;
            this.city = city;
            this.prenom = prenom;
        }
        public String getNom2 () { return nom; }
        public void setNom2 (String nom) { this.nom = nom; }
        public String getTaille2 () { return city; }
        public void setTaille2 (int taille) { this.city = city; }
        public String getPrenom2 () { return prenom; }
        public void setPrenom2 (String prenom) { this.prenom = prenom; }
        @Override
        public void readExternal(ObjectInput e) throws IOException, ClassNotFoundException {
            // TODO Auto-generated method stub
            try { System.out.println("starting reading...");
                System.out.println (e.readObject ( ) );
                System.out.println (e.readObject ( ));
                System.out.println (e.readInt ( ) );
            }
            catch (Exception enn) { System.out.println ("Erreur reading...");
                enn.printStackTrace ( );
            }

        }
        @Override
        public void writeExternal(ObjectOutput e) throws IOException {
            // TODO Auto-generated method stub
            try
            { System.out.println(" starting writing...");
                e.writeObject ( this.getNom2( ) );
                e.writeObject (this.getPrenom2( ) );
                e.writeObject ( this.getTaille2( ) );
                e.flush() ;
                e.close() ;
                System.out.println("finishing writing !!!"); }
            catch (Exception enn) { System.out.println ("Erreur reading...");
                enn.printStackTrace ( );
            }
        } //fin de la methode writeExternal
    }



