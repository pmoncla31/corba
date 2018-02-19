package HelloApp;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;


/**
 * Classe pour lancer le programme du client
 * @author Gokan EKINCI
 */
public class Client {
    public static void main(String args[]){
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);

            // Récupérer la référence du service de nommage
            org.omg.CORBA.Object nsRef = orb.resolve_initial_references("NameService");
            NamingContextExt nce = NamingContextExtHelper.narrow(nsRef);

            // Générer un objet proxy
            String serviceName = "Hello";
            Hello serviceHello = HelloHelper.narrow(nce.resolve_str(serviceName));

            System.out.println("Réponse du serveur : " + serviceHello.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
