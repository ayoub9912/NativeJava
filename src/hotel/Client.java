/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import static hotel.Hotel.listClient;
import static hotel.Reservation.estvide;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Client {
  
   private  String adresse,cin,nom,prenom,DateN,tel;
   public static int Numreserv=1006;
   public static int nbreclient = 6;
   static JOptionPane jop1, jop2, jop3;

   
 
         
     public static int recherchenomclient( Client[] tabc,int x)
    {  int monindice;
        for (int i=0 ; i< nbreclient ; i++)
        {    
            if (x==tabc[i].getnumereserv())
        { ;
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }
    public static int recherchecinclient(String[] tabc,String x)
    {  int monindice;
        for (int i=0 ; i< nbreclient ; i++)
        {    
            if (x.equals(tabc[i]))
        { 
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }
   
          
    public Client(String cin,String nom,String prenom,String DateN,String tel,int numreserv,String adresse)
    { this.cin=cin;
      this.nom=nom;
      this.prenom=prenom;
      this.DateN=DateN;
      this.tel=tel;
      this.Numreserv=numreserv;
      this.adresse=adresse;}
   public static void AjouterClient(String[] Cins)
   {Scanner sc=new Scanner(System.in);
       String ccin;
       do 
        {System.out.println("Entrer le Cin:");
         ccin=sc.nextLine();}
         while (Reservation.numeriquecin(ccin)==false);
String rep="degla";
  if (recherchecinclient(Hotel.Cins,ccin)!=-1){System.out.println("ce client existe déja!");
  System.out.println("Voulez-vous mettre à jour vos informations ?");
    do
    {System.out.print("Votre Reponse:");
    rep=sc.nextLine();
    rep=rep.toUpperCase();
    if (rep.charAt(0)!='O'&&  rep.charAt(0)!='N') {System.out.print("il faut repondre avec 'O' ou 'N' ");}
    }while((rep.charAt(0))!='O'&&  rep.charAt(0)!='N');}
  
    if ((rep.charAt(0)=='O') || (recherchecinclient(Hotel.Cins,ccin)==-1))
  {String cmeth="";
        String cdate;
          String meth;

            String cprenom,cnom;
        do
        {   System.out.print("Entrer votre nom:");
            cnom=sc.nextLine();}
        while(estvide(cnom)  || !Reservation.alphabetique(cnom));  
        do
        {   System.out.print("Votre prenom:");
            cprenom=sc.nextLine();}
        while((estvide(cprenom))||( !Reservation.alphabetique(cprenom)));       
        System.out.println();
        System.out.println("Comment pouvons nous vous contactez ?");
        System.out.println("Tapez 1 si par téléphone:");
        System.out.println("Tapez 2 si par email:");
        do 
        { meth = sc.nextLine();
        if ((meth.charAt(0)!='1') && (meth.charAt(0)!='2')) 
        {System.out.println("Vous devez entrer un CHIFFRE entre 1 et 2");}
        }while (((meth.charAt(0)!='1') && (meth.charAt(0)!='2')) ||(meth.length()==0));
        
        switch(meth)
        {   
        case "1":do { 
        System.out.println("Votre numéro de teléphone:");
        cmeth=sc.nextLine();
        }while ((Reservation.numerique(cmeth)==false)|| (Reservation.estvide(cmeth)));
        break;
        
        case "2":do 
        {System.out.println("Votre adresse E-mail:");
        cmeth=sc.nextLine();}
        while ((Reservation.testemail(cmeth)==false)||(Reservation.estvide(cmeth)));
        break; 
        }
        System.out.println();
        System.out.println("Votre Adresse(ce champ n'est pas obligatoire :):");
        String cadr=sc.nextLine();
        System.out.println();
        do
        {System.out.println("Votre Date de naissance:");
        cdate=sc.nextLine();
        }while((Reservation.testd(cdate)==false));
        Client C=new Client(ccin,cnom,cprenom,cdate,cmeth,Numreserv,cadr);
        if (rep.charAt(0)=='O')
        {Hotel.listClient.add(recherchecinclient(Hotel.Cins,ccin),C);}
        else{ Hotel.listClient.add(C);}
        Hotel.Cins[Client.getnbreclient()]=ccin;
        Client.setnbreclient(Client.getnbreclient()+1); 
        System.out.println("C'est bon ! Clien Ajouté/Modifié");}
    else{System.out.print("Pas de modification :)");}
   
}
   

  //*************   ACCESSEURS *************
    
  public String getNom()  {  
    return nom;
  }

  public String getprenom()
  {
    return prenom;
  }
  public String getcin()
  {
    return cin;
  }
  public String gettel()
  {
    return tel;
  }
  public String getDateN()
  {
    return DateN;
  }

    public static int getnumereserv()
  {
    return Numreserv;
  }
  public static int getnbreclient()  {  
    return nbreclient;
  }
  //*************   MUTATEURS   *************

  public void setNom(String pnom)
  {
    nom = pnom;
  }

  public void setprénom(String pprenom)
  {
    prenom = pprenom;
  }

  public void setcin(String pcin)
  {
    cin = pcin;
  }
    public void setDateN(String pDateN)
  {
    DateN= pDateN;
  }
    public void settel(String ptel)
  {
    tel = ptel;
  }
      public static void setnbreclient(int pnbreclient)
  {
    nbreclient = pnbreclient;
  }
      
}

    
    

