# Notes : 

petit test et appli du tuto http://gokan-ekinci.developpez.com/apprendre-corba-java/
(il reste a voir l'histoire du naming service)

## generation des IDL : 
idlj -fall xxx.idl génere 6 fichiers 
actuellement, il m'est impossible de générer les idl avec maven et idlj -> les fichiers en sortie ne sont pas les mêmes


* xxxPOA.java : Ce fichier contient une classe abstraite représentant le skeleton du serveur.
* _xxxStub.java : Ce fichier contient une classe représentant le stub du client.
* xxx.java : Ce fichier contient notre interface Java CalculationService. L'interface CalculationService hérite de CalculationServiceOperations, org.omg.CORBA.Object et org.omg.CORBA.portable.IDLEntity.
* xxxHelper.java : Ce fichier contient une classe abstraite permettant de faire du narrowing et de gérer le type org.omg.CORBA.Any.
* xxxHolder.java : Ce fichier contient une classe finale permettant de gérer les paramètres de méthode en mode out ou inout.
* xxxOperations.java : Cette interface contient les prototypes de méthode de CalculationService, dans notre cas, il contient juste la méthode.


pour lancer l'orbd sur le poste serveur
orbd -ORBInitialPort 1050 -ORBInitialHost localhost&

pour lancer le serveur, ajouter les parametres -ORBInitialPort 1050 -ORBInitialHost localhost
pour lancer le client, ajouter les parametres -ORBInitialPort 1050 -ORBInitialHost localhost 


 