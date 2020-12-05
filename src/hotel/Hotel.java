




package hotel;
import static hotel.Client.recherchecinclient;
import static hotel.Evénement.rechercheevenement;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Hotel
     
{  
    
    
    
      public static int longmaxC=100;
      public static int longmaxR=200;
      public static int longmaxEV=50;
      public static String Cins[]=new String[longmaxC];
      public static int rnumres[]=new int[longmaxR];
      public static int rnbrenuitees[]=new int [longmaxR];
      public static   List<Client> listClient = new ArrayList<>();
      public static List<Reservation> listReservation=new ArrayList<>();
      public static List<Evénement> listev=new ArrayList<>();
      public static int[] sallesocc=new int[7];
      public static String queldate[]=new String[longmaxEV];
      public static List<Chambres> listChambres=new ArrayList<>();
      
      
    
      
      
      
      
      
      public  static void remplirev(List<Evénement> listev,int [] tabe,String []tabev)
{Evénement jdid0=new Evénement("Marriage","28/07/2019",false,true,"pas de description",2);
listev.add(jdid0);tabe[0]=2;tabev[0]="28/07/2019";
Evénement jdid1=new Evénement("Info session","29/04/2019",false,true,"Did you create your office 365 account ? \n" +
"Do you want to know more about the Microsoft certification ?\n" +
"Do you have some unclear points in the Microsoft certification process ? \n" +
"join us Wednesday , 3rd of april 2019 to know more about the Microsoft certification steps .",1);
listev.add(jdid1);tabe[1]=1;tabev[1]="29/04/2019";
Evénement jdid2=new Evénement("Soirée","29/07/2019",false,true,"يتشرف الديسكو العربي بإعلان السهرة العاشرة بتونس نعدكم برحلة مليئة بغرائب و طرائف و عجائب و نوادر و احلى الموسيقة العربية، جهزوا نفسكم لتريپ العمر. تابعونا لحظة بلحظة وإستعدوا لروائع الديسكو 💃🕺🔥",2);
listev.add(jdid2);tabe[2]=2;tabev[2]="29/07/2019";}   
       
       
       
       
       
       
       public  static void remplirclient(List<Client> listc ,String[] sins)
{Client jdid0=new Client("09637601","Mouelhi","Ayoub","13/11/1999","54539884",1000,"28 rue arianna rades");
listc.add(jdid0);sins[0]="09637601";
Client jdid1=new Client("09635482","Laasidi","Yassine","13/06/1999","26290670",1001,"Inconnue");
listc.add(jdid1);sins[1]="09635482";
Client jdid2=new Client("09635245","Hamma","Ghrab","25/03/1988","26589348",1002,"Inconnue");
listc.add(jdid2);sins[2]="09635245";
Client jdid3=new Client("09584763","Hmed","Satour","03/03/1975","25963984",1003,"Inconnue");
listc.add(jdid3);sins[3]="09584763";
Client jdid4=new Client("09841233","Mouldi","Banney","03/06/1975","98634512",1004,"Inconnue");
listc.add(jdid4);sins[4]="09841233";
Client jdid5=new Client("09458721","Johnny","Sins","03/07/1976","23659842",1005,"Inconnue");
listc.add(jdid5);sins[5]="09458721";
}   
    public  static void remplirres(List<Reservation> res,int [] rnum,int[] rnbre)
 {Reservation jdid0=new Reservation(2,2,10,1000,"27/05/2019","09637601",4000.0);
res.add(jdid0);rnum[0]=1000; rnbre[0]=10;
Reservation jdid1=new Reservation(2,2,15,1001,"28/05/2019","09458721",6000.0);
res.add(jdid1);rnum[1]=1001; rnbre[1]=15;
Reservation jdid2=new Reservation(3,2,16,1002,"29/05/2018","09584763",9600.0);
res.add(jdid2);rnum[2]=1002; rnbre[2]=16;
Reservation jdid3=new Reservation(4,2,20,1003,"23/06/2018","09635482",16000.0);
res.add(jdid3);rnum[3]=1003; rnbre[3]=20;
Reservation jdid4=new Reservation(2,3,20,1004,"24/06/2017","09635245",8000.0);
res.add(jdid4);rnum[4]=1004; rnbre[4]=20;
Reservation jdid5=new Reservation(4,2,12,1005,"25/06/2017","09635245",9600.0);
res.add(jdid5);rnum[5]=1005; rnbre[5]=12;
Reservation jdid6=new Reservation(1,2,30,1006,"26/06/2020","09637601",4800.0);
res.add(jdid6);rnum[6]=1006; rnbre[6]=30;
    }   
 
    
    
    public static void remplirchambres(List<Chambres> ch)
  {  Chambres jdid0=new Chambres(1,1,"pret");
       ch.add(jdid0);
     Chambres jdid1=new Chambres(1,2,"pret");
       ch.add(jdid1);
     Chambres jdid2=new Chambres(2,1,"pret");
       ch.add(jdid2);
     Chambres jdid3=new Chambres(3,1,"pret");
       ch.add(jdid3);
      Chambres jdid4=new Chambres(1,3,"pret");
       ch.add(jdid4);      
   
    }
 public static void affichechambrepret(List<Chambres> c)
    { for (int i=0;i<c.size();i++)
       {System.out.println("Num de chambre: "+c.get(i).getNumC());
        System.out.println("Etagen n°:"+c.get(i).getEtage());
        System.out.println("Etat: "+c.get(i).getEtat());}
    }  
  

    
   public static void afficheclient(List<Client> listClient)
{  for (int i=0; i<listClient.size(); i++)
      {  System.out.println("Nom: "+listClient.get(i).getNom());
        System.out.println("Prenom: "+listClient.get(i).getprenom());
      }
}
    
   public static void affichereservations(List<Reservation> ListeReservation)
{  for (int i=0;i<ListeReservation.size();i++)
      {  System.out.println(ListeReservation.get(i).getdatereserv());
          System.out.println("par "+ListeReservation.get(i).getparqui());
          System.out.println("Numero de reservation: "+ListeReservation.get(i).getnumreserv());}
}
   
   
 
  public static boolean critere(String xk)
  { if (!xk.equals("NOM") && !xk.equals("PRENOM") && !xk.equals("CIN")  && !xk.equals("DATE DE NAISSANCE") && !xk.equals("TELEPHONE")  )
    {return false;
    }
      
   return true;}
  
      
    public  static void remplirkolchay()
    { remplirclient(listClient,Cins);
      remplirres(listReservation,rnumres,rnbrenuitees);
      remplirev(listev,sallesocc,queldate);
      remplirchambres(listChambres);
      affichemenu();
    }
    
    
      public static void affichmenuclient()
      {System.out.println("----------------------------------------------------------------");
                String choix; Scanner sc=new Scanner(System.in);    
                    System.out.println("Veuillez choisir un option");
                    System.out.println("1:Ajouter Un Client");
                    System.out.println("2:Rechercher un client");
                    System.out.println("3:Modification des informations d'un clients");
                    System.out.println("4:Retourner au menu principal");
                 do
                 {System.out.print("Choix:"); choix=sc.nextLine();
                   if ("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>3)))
                  {System.out.println("Veuilllez saisir un CHIFFRE compris entre 1 et 4");}
                 } while("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>4)));
                  
                  switch(choix)
                  { case "1":{Client.AjouterClient(Cins);afficheclient(listClient);affichemenu();break;}
                    case "2":{ System.out.println("Comment voulez vous chercher votre client ?");
                               String reponse;
                               do { System.out.println("Votre reponse: ");
                               reponse=sc.nextLine(); }
                               while((Reservation.estvide(reponse)) || !Reservation.alphabetique(reponse));
                               
                               
                               System.out.println("Ecrivez votre critére choisie:");
                               String crit=sc.nextLine();boolean test=false;
                              int i=0;
                              while (i<listClient.size() && test==false)
                              {  if (crit.equals(listClient.get(i).getNom()) || crit.equals(listClient.get(i).getprenom()) || crit.equals(listClient.get(i).getDateN())|| crit.equals(listClient.get(i).getcin())|| crit.equals(listClient.get(i).gettel()))
                                           {test=true;}
                              i++;
                              }
                              if (test==true)
                             {System.out.println("Le client existe !Voici ses informations");
                              System.out.println("Nom: "+listClient.get(i-1).getNom());
                              System.out.println("Prénom: "+listClient.get(i-1).getprenom());
                              System.out.println("Numéro de telephone: "+listClient.get(i-1).gettel());
                             }else {System.out.println("Le client n'existe pas :(");}
                    
                          affichemenu();break;}
                    case "3":{System.out.println("Entrer le numéro de cin de client");
               String cin;
                     do
                     {   System.out.print("Cin:");
                         cin=sc.nextLine();
                         if (recherchecinclient(Hotel.Cins,cin)==-1){System.out.println("Ce client n'existe pas!");}
                     }while(!Reservation.numeriquecin(cin) || recherchecinclient(Hotel.Cins,cin)==-1);
               int position=recherchecinclient(Hotel.Cins,cin);
                     if (recherchecinclient(Hotel.Cins,cin)!=-1)
                     {
                     System.out.println("Que voulez-vous modifier ?");
                     System.out.println("Nom?");
                         System.out.println("Prenom ?");
                          System.out.println("Date de naissance ?");
                           System.out.println("Cin ?");
                            System.out.println("Telephone ?");
        String rep1;
        String crit="";
                    do
                        
                    {  
                      System.out.print("Reponse:");
                      rep1=sc.nextLine();
                      }while(!Reservation.alphabetique(rep1) || !critere(rep1.toUpperCase()));
                    
                    
                    switch (rep1.toUpperCase())
                    { case "NOM":{System.out.println("Entrer le nouveau nom");
                    listClient.get(position).setNom(crit=sc.nextLine());
                    }break;
                    case "PRENOM":{System.out.println("Entrer le nouveau prénom");
                    listClient.get(position).setprénom(crit=sc.nextLine());}break;
                    
                    case "DATE DE NAISSANCE":{
                    String nouvelledate="";
                    do{System.out.println("Entrer la nouvelle date de naissance");
                    }while(!Reservation.testd(nouvelledate));
                    listClient.get(position).setDateN(nouvelledate);}break;
                    case "CIN":{System.out.println("Entrer la nouvelle numéro de carte d'idendité");
                    listClient.get(position).setcin(crit=sc.nextLine());}break;
                    case "TELEPHONE":System.out.println("Entrer le nouveau numéro de telephone");
                    listClient.get(position).settel(crit=sc.nextLine());}
                     }
                     System.out.println("Voici les nouveaux informations");
                              System.out.println("Nom: "+listClient.get(position).getNom());
                              System.out.println("Prénom: "+listClient.get(position).getprenom());
                              System.out.println("Numéro de telephone: "+listClient.get(position).gettel());
                              System.out.println("Numéro de CIN: "+listClient.get(position).getcin());
                              System.out.println("Date de naissance: "+listClient.get(position).getDateN());
                   affichemenu(); }break;
                    case "4":{ affichemenu(); break;}
      
      
      }
      }
      public static void affichemenureservation()
      {System.out.println("----------------------------------------------------------------");
                   System.out.println("Veuillez choisir un option");
                   System.out.println("1:Faire une reservation");
                   System.out.println("2:Modifier une reservation");
                   System.out.println("3:Consultation d'une reservation ");
                   System.out.println("4:Annuler une reservation ");
                   System.out.println("5:Retourner au menu principal");
         
         String choix; Scanner sc=new Scanner(System.in);    
          do
                 {System.out.print("Choix:"); choix=sc.nextLine();
                   if ("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)))
                  {System.out.println("Veuilllez saisir un CHIFFRE compris entre 1 et 5");}
                 } while("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)));
         switch (choix)
         {  case "1":{Reservation res=new Reservation(listClient);afficheclient(listClient);affichereservations(listReservation);affichemenu();break;}
            case "2":{System.out.println(" entrer le numéro de reservation à modifier?");
                               int reponse;
                               do { System.out.print("Votre reponse: ");
                               
                               reponse=sc.nextInt(); if (Reservation.rechercheres(rnumres,reponse)==-1){System.out.println("Ce reservation n'existe pas! veuillez retapez le numéro de reservation");} }
                               while((Reservation.estvide(String.valueOf(reponse))) || Reservation.rechercheres(rnumres,reponse)==-1);
                               
                             int position=Reservation.rechercheres(rnumres,reponse);
                             if (Reservation.rechercheres(rnumres,reponse)!=-1)
                     {
                     System.out.println("Que voulez-vous modifier ?");
                        System.out.println("1:Nombre de client concernés?");
                         System.out.println("2:Nombre de nuitées ?");
                          System.out.println("3:Date de reservation ?");
                           System.out.println("4:Nombre de chambre ? ?");
                    
        String rep1;
        String crit="";
        int critr;
                     do  
                     {  sc.nextLine();
                      System.out.print("Reponse:");
                      rep1=sc.nextLine();
                      }while(Reservation.estvide(String.valueOf(rep1)) || "0123456789".indexOf(rep1)==-1);
            
            
                    switch (rep1.toUpperCase())
                    { case "1":{System.out.println("Entrer le nouveau nombre de client concérnés");
                    listReservation.get(position).setclientconcernees(critr=sc.nextInt()); }break;
                    case "2":{System.out.println("Entrer le nouveau nombre de nuitées");
                    listReservation.get(position).setnbrnuitees(critr=sc.nextInt()); }break;
                    
                    case "3":{System.out.println("Entrer la nouvelle date de reservation");
                     listReservation.get(position).setdatereserv(Reservation.Saisirdatereserv()); }break;
                    case "4":{System.out.println("Entrer le nouveau nombres de chambres :");
                     listReservation.get(position).setnbrechambres(critr=sc.nextInt()); }break;
                     }
                     }
                     System.out.println("Voici les nouveaux informations");
                              System.out.println("Nombre de client concernés: "+ listReservation.get(position).getclientconcernees());
                              System.out.println("Nombre de nuitées: "+ listReservation.get(position).getnbrnuitees());
                              System.out.println("Date de reservation: "+ listReservation.get(position).getdatereserv());
                              System.out.println("Nombre de chambre: "+ listReservation.get(position).getnbrechambres());
                              System.out.println("Résérvé par : "+listReservation.get(position).getparqui());
           affichemenu(); }//atheya mtaa case 2 e sghira mtaa reservation
            break;  
             case "3":{ int reponse;
                      do { System.out.print("Numéro de la reservation: ");
                                reponse=sc.nextInt(); if (Reservation.rechercheres(rnumres,reponse)==-1){System.out.println("Ce reservation n'existe pas! veuillez retapez le numéro de reservation");} }
                               while((Reservation.estvide(String.valueOf(reponse))) || Reservation.rechercheres(rnumres,reponse)==-1);
            
                     if (Reservation.rechercheres(rnumres,reponse)!=-1)
          
                     {        int position=Reservation.rechercheres(rnumres,reponse);
                              System.out.println("Voici les  informations de cette reservation");
                              System.out.println("Nombre de client concernés: "+ listReservation.get(position).getclientconcernees());
                              System.out.println("Nombre de nuitées: "+ listReservation.get(position).getnbrnuitees());
                              System.out.println("Date de reservation: "+ listReservation.get(position).getdatereserv());
                              System.out.println("Nombre de chambre: "+ listReservation.get(position).getnbrechambres());}}affichemenu();break;
             case "4":{int reponse;
                      do { System.out.print("Numéro de la reservation: ");
                                reponse=sc.nextInt(); if (Reservation.rechercheres(rnumres,reponse)==-1){System.out.println("Ce reservation n'existe pas! veuillez retapez le numéro de reservation");} }
                               while((Reservation.estvide(String.valueOf(reponse))) || Reservation.rechercheres(rnumres,reponse)==-1);
                     
                             if (Reservation.rechercheres(rnumres,reponse)!=-1)
          
                     {        System.out.println("Liste des reservations avant annulation :");
                              System.out.println("------------------------------------------");
                               affichereservations(listReservation);
                              System.out.println("------------------------------------------");
                              int position=Reservation.rechercheres(rnumres,reponse);
                              listReservation.remove(position);
                              System.out.println("Reservation annulée avec succès!");affichereservations(listReservation); }
                     }affichemenu();break;
             case "5":affichemenu();
         
         }} 
    public static void affichemenuevenment()
     { String choix; Scanner sc=new Scanner(System.in); String rep="";
         System.out.println("----------------------------------------------------------------");
                   System.out.println("Veuillez choisir un option");
                   System.out.println("1:Ajouter un évenement");
                   System.out.println("2:Modifier un évenement");
                   System.out.println("3:Consultation d'un événement ");
                   System.out.println("4:Annuler un évenement ");
                   System.out.println("5:Retourner au menu principal");
                    do
                 {System.out.print("Choix:"); choix=sc.nextLine();
                   if ("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)))
                  {System.out.println("Veuilllez saisir un CHIFFRE compris entre 1 et 5");}
                 } while("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)));
        
         
                  switch (choix)
                  {  case "1":{Evénement.AjoutEvenement(listev);Evénement.afficheeven(listev);}affichemenu();break;
                     case "2":{ String datev; Scanner scint=new Scanner(System.in); int num;
         do { 
              do{System.out.println("Entrer la date de l'évenement");
         datev=sc.nextLine();}while (!Reservation.testd(datev) || Reservation.estvide(datev));
        do {System.out.println("Entrer le numéro de la salle ou l'événement aura lieu");      
           num=scint.nextInt();}while ("1234567".indexOf(String.valueOf(num))==-1);
     
      }while(rechercheevenement(sallesocc,queldate,num,datev)==-1);
             
                     int position=rechercheevenement(sallesocc,queldate,num,datev);
                  if (rechercheevenement(sallesocc,queldate,num,datev)!=-1)
                  { System.out.println("Que voulez-vous modifier ?");
                        System.out.println("1:Type d'évenement?");
                         System.out.println("2:Date d'évenement ?");
                          System.out.println("3:accessible au public ou non?");
                           System.out.println("4:Description ? ?");
                            System.out.println("5:Numéro de salle? ?");

         boolean ap=true;       
        String rep1;
        String crit="";
        String critr;
        String dateev="";
                     do  
                     {  sc.nextLine();
                      System.out.print("Reponse:");
                      rep1=sc.nextLine();
                      }while(Reservation.estvide(String.valueOf(rep1)) || "1234".indexOf(rep1)==-1);
            
            
                    switch (rep1.toUpperCase())
                    { case "1":{System.out.println("Entrer le nouveau type d'évenement");
                    listev.get(position).settypeev(critr=sc.nextLine()); }break;
                    case "2":{System.out.println("Entrer la nouvelle date de l'évenement");
                     do
                     {dateev=sc.nextLine();
                     if ((rechercheevenement(sallesocc,queldate,sallesocc[position],dateev)!=-1))
                     {System.out.println("La salle est occupé à cette date,retapez une autre date");}else { listev.get(position).setdateev(dateev=sc.nextLine());}
                     }while(rechercheevenement(sallesocc,queldate,sallesocc[position],dateev)!=-1);
                    
                    
                    }break;
                   
                    
                    case "3":{System.out.println("Accessible au public ou non?");
                       do
                 {System.out.print("Réponse:");
                     rep =sc.nextLine();
                 } while(!rep.toUpperCase().equals("OUI") || !rep.toUpperCase().equals("NON") || !Reservation.alphabetique(rep) || Reservation.estvide(rep));
                    if (rep.toUpperCase().equals("OUI")){listev.get(position).setaccpub(ap); break;} else{listev.get(position).setaccpub(!ap);}}break;
                
                    case "4":{System.out.println("Entrer la nouvellle description :");
                    listev.get(position).setdescription(critr=sc.nextLine()); }break;
                     
                    case "5":{System.out.println("Entrer la nouvelle numéro de salle");
                   do {System.out.println("Numéro:");      
                    num=scint.nextInt();if (rechercheevenement(sallesocc,queldate,num,queldate[position])!=-1) {System.out.println("La salle numéro "+num+"est occupée à la date "+datev+"Veuillez changer la salle");}
                   }while ("1234567".indexOf(String.valueOf(num))==-1 || rechercheevenement(sallesocc,queldate,num,queldate[position])!=-1);}break;
                  
                  }
                     System.out.println("Voici les nouveaux informations");
                              System.out.println("Type d'évenement "+ listev.get(position).gettypeev());
                              System.out.println("Date d'évenement: "+ listev.get(position).getdateev());
                              if (listev.get(position).getaccpub()==true)
                              {System.out.println("Acceible au public: oui");}else {System.out.println("Acceible au public: non");}
                              System.out.println("Description: "+ listev.get(position).getdescription());
                              System.out.println("Numéro de salle: "+listev.get(position).getnumsalle());

                  
                  }else{System.out.println("Ce evenement n'existe pas ! :( ");}
                  
                     
                     
                     
                     }affichemenu();break;//mtaa case 2 sghira mtaa switch mtaa evenement 
                  
                  case "3":{ String datev="";  int num;
        do{ 
            System.out.println("Entrer la date de l'évenement");
             datev=sc.nextLine();
           }while (!Reservation.testd(datev) || Reservation.estvide(datev));
        do {System.out.println("Entrer le numéro de la salle");      
           num=sc.nextInt();}while ("1234567".indexOf(String.valueOf(num))==-1);
      
     
                  int position=(rechercheevenement(sallesocc,queldate,num,datev));
                  if (position!=-1){
                     System.out.println("Voici les informations");
                              System.out.println("Type d'évenement "+ listev.get(position).gettypeev());
                              System.out.println("Date d'évenement: "+ listev.get(position).getdateev());
                              if (listev.get(position).getaccpub()==true)
                              {System.out.println("Accessible au public: oui");}else {System.out.println("Acceible au public: non");}
                              System.out.println("Description: "+ listev.get(position).getdescription());
                              System.out.println("Numéro de salle: "+listev.get(position).getnumsalle());}else{System.out.println("Ce évenement n'existe pas! ");}
                  
                  
                  }affichemenu();break;//mtaa case 3 mtaa evenement
                  
                  
                  
               case "4": {String datev="";  int num;
               do
         { 
        do{System.out.println("Entrer la date de l'évenement");
        datev=sc.nextLine();}while (!Reservation.testd(datev) || Reservation.estvide(datev));
        do {System.out.println("Entrer le numéro de la salle ou l'événement aura lieu");      
           num=sc.nextInt();}while ("1234567".indexOf(String.valueOf(num))==-1);
      if (rechercheevenement(sallesocc,queldate,num,datev)==-1) {System.out.println("Ce évenement n'existe pas! ");}
      }while(rechercheevenement(sallesocc,queldate,num,datev)==-1);
               if (rechercheevenement(sallesocc,queldate,num,datev)!=-1)
               {int position =rechercheevenement(sallesocc,queldate,num,datev);
                listev.remove(position);
                System.out.println("Evénement annulé avec succès");
                System.out.println();
                Evénement.afficheeven(listev);
               }

 
               }affichemenu();break;//mtaa case 4 mtaa evenement

                  
               case "5":affichemenu();break;    
                  }//atheya mtaa e switch mtaa l'evenement

         
         
         }
    public static void affichmenuchambres()
     { Scanner sc=new Scanner(System.in);  System.out.println("Y'en a "+Chambres.nbrechambrespret+" Chambres pretes");
                   System.out.println("Les autres sont indisponibles (occupés ou en cours de nettoyage)"); 
                   System.out.print("Voulez vous changer l'etat d'une chambre?:");String rep1="";
 
                   do
                     {   
                         rep1=sc.nextLine();}
                    while(Reservation.estvide(rep1)  || !Reservation.alphabetique(rep1) || (!rep1.toUpperCase().equals("OUI") && !rep1.toUpperCase().equals("NON")));
                         
                            if (rep1.toUpperCase().equals("OUI"))
                           { 
                               System.out.println("Entrer le numéro d'étage du chambre à changer");int nume=sc.nextInt(); System.out.println("got here");
                               System.out.println("Entrer le numéro de chambre à changer"); int numc=sc.nextInt();
                               if (Chambres.recherchechambres(listChambres,numc,nume)==-1)
                                { System.out.println("Cette chambres n'existe pas");}
                               else
                                   {  int position=Chambres.recherchechambres(listChambres,numc,nume);
                                            Scanner sc2=new Scanner(System.in);
                                            System.out.println("Entrer le nouveau etat de chambre:");
                                            String etat=sc2.nextLine();
                                            listChambres.get(position).setEtat(etat);
                                          System.out.println("Changé avec succes");
                                        affichechambrepret(listChambres);
                                     affichemenu();
                                   
                                   }
          
                           }else {affichemenu();}

             
    
    
     }
    
    public static void affichemenurecette()
    {System.out.println("----------------------------------------------------------------");
                   System.out.println("Veuillez choisir un option");
                   System.out.println("1:Recette d'un mois");
                   System.out.println("2:Recette d'un annee");
                   System.out.println("3:L'année la plus prospére");
                   System.out.println("4:Statistiques"); 
                   System.out.println("5:Retourner au menu principal");
                   
                   Scanner sc=new Scanner(System.in); String choix;
         
          do
                 {System.out.print("Choix:"); choix=sc.nextLine();
                   if ("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)))
                  {System.out.println("Veuilllez saisir un CHIFFRE compris entre 1 et 5");}
                 } while("0123456789".indexOf(choix)==-1 || ((Integer.parseInt(choix)<1) || (Integer.parseInt(choix)>5)));
                        String ann;
                      switch(choix)
                      { case "1":{ System.out.println("Donnez le mois");  String mois;  
                                  do
                                  { mois=sc.nextLine();}while(Reservation.estvide(mois)|| "0123456789".indexOf(mois.charAt(0))==-1 || "0123456789".indexOf(mois.charAt(1))==-1);
                      
                                 System.out.println("Donnez l'annee");
                                 do
                                  { ann=sc.nextLine();}while(Reservation.estvide(ann)|| "0123456789".indexOf(ann.charAt(0))==-1 || "0123456789".indexOf(ann.charAt(1))==-1 || "0123456789".indexOf(ann.charAt(2))==-1 || "0123456789".indexOf(ann.charAt(3))==-1);
                                System.out.println(Recette.calculreccetteparmoi(ann,mois));}affichemenu();break;
                      case "2":{System.out.println("Donnez l'annee");
                                 do
                                  { ann=sc.nextLine();}while(Reservation.estvide(ann)|| "0123456789".indexOf(ann.charAt(0))==-1 || "0123456789".indexOf(ann.charAt(1))==-1 || "0123456789".indexOf(ann.charAt(2))==-1 || "0123456789".indexOf(ann.charAt(3))==-1);
                                 System.out.println(Recette.calculrecetteparanne(ann));}affichemenu();break;
                      case "3": {System.out.println(Recette.maxAnne());}affichemenu();break;
                      case "4":Recette.Statistacs();System.out.println("Appyuez sur Entrée pour continuer");sc.nextLine();affichemenu();break;
                      case "5":affichemenu();break;
                      
                      }//atheya mtaa e swicth  mtaa les recettes
                                  
                      
      
                      
                      
                      
                      
                      
                      
                      
                      
                      
    
    
    
    }
      
     
     
        

    
    
     public static void affichemenu()
             {    Scanner sc=new Scanner(System.in);
         String rep="0"; String choix="";
         System.out.println("^^^^^^^^^^^^^^^^^Bienvenue dans notre Hotel! :)^^^^^^^^^^^^^^^^^");
         System.out.println("----------------------------------------------------------------");
         System.out.println("----------------------------------------------------------------");
         System.out.println("Veuillez choisir un option");
         System.out.println("----------------------------------------------------------------");
         System.out.println("1:Gestion des Clients");
         System.out.println("2:Gestion de reservations");
         System.out.println("3:Gestion d'évenements");
         System.out.println("4:Gestion de nettyoage");
         System.out.println("5:Gestion des recettes");
         System.out.println("----------------------------------------------------------------");
         System.out.println("----------------------------------------------------------------");

         do
         {System.out.print("Choix:");rep=sc.nextLine();
         if ("0123456789".indexOf(rep)==-1 || ((Integer.parseInt(rep)<0) || (Integer.parseInt(rep)>5)))
         {System.out.println("Veuilllez saisir un CHIFFRE compris entre 0 et 5");}
         }
         while("0123456789".indexOf(rep)==-1 || ((Integer.parseInt(rep)<0) || (Integer.parseInt(rep)>5)));
         
         
         
         
         switch(rep) 
         {  case "0":remplirkolchay();break;
            case "1":{affichmenuclient();  break; }
            case "2":{affichemenureservation();break;}          
            case "3":{affichemenuevenment();}break;
            case "4":{affichmenuchambres();}break;
            case "5":{affichemenurecette();}break;//atheya mttaa e recette
            
         
         }//atheya mtaa e switch lkbira

}//atheya mtaa l main meth
    
    
    
    
    public static void main(String[] args)
    {affichemenu();}

    }//hethy mtaa l class
                                        


                    

         
         
         
         
         
         
         
           
      
         
         
         
                  
      
       
    




//}}}}}

