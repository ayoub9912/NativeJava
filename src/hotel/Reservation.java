

package hotel;

import java.util.Date;
import java.util.*;
import java.lang.Object;

public class Reservation {

    private  int clientconcer=1;
    private   int nbrchambres=1;
    private   int nmbrenuitees=0;
    public   int numreserv=1005;  
    private  String datereserv="";
    private  static int nbrereservation = 7;
    private String parqui="";
   private double tarif;
       
    public static int rechercheres(int [] numreserv,int x)
  {  int monindice;
        for (int i=0 ; i< nbrereservation ; i++)
        {    
            if (x==numreserv[i])
        { ;
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }
  
    
    public Reservation(int pclientconcer,int pnbrechambres,int nmbrenuitess,int pnumreserv,String pdatereserv,String parqui,double tarif)
    {clientconcer= pclientconcer;
     nbrchambres= pnbrechambres;
     this.nmbrenuitees=nmbrenuitess;
     numreserv=pnumreserv;
     datereserv=pdatereserv;
     this.parqui=parqui;
     this.tarif=tarif;
    }
   
    
    public final double calcultarif(List<Reservation> res,String cin,int nmbrenuitees,int[] rnbrenuitee)
      { int i=Client.recherchecinclient(Hotel.Cins,cin);double totaloriginal=nmbrenuitees*200; double total=0;
       if (i==-1){System.out.println("Vous n'avez pas fait des reservations au paravant :(, pas de remise");
       return (totaloriginal);}
   else {String année=res.get(i).getdatereserv().substring(6,10);
       String an=année; int nbrean = 1;  int nbrenuit=0;
        int k;
           for ( k=i; k<res.size() ;k++)   
           {  
              if (res.get(k).getparqui().equals(cin))
                          {   nbrenuit+=rnbrenuitee[k];  
                              année=res.get(k).getdatereserv().substring(6,10);
                                if (!année.equals(an))
                                     { nbrean++; an=année;}
                          }
              
       
           }   
       
       
       int nbrenuitparan=nbrenuit/nbrean;
              if (nbrenuitparan>=30)
              {total=totaloriginal-(totaloriginal*0.3);System.out.println("Vous aurez un remise de 30%!:)Le prix sans remise:"+totaloriginal);return total;}
              else if (nbrenuitparan>=20 && nbrenuitparan<30)
              {total=totaloriginal-(totaloriginal*0.2);System.out.println("Vous aurez un remise de 20%!:)Le prix sans remise:"+totaloriginal);return total;}
    } 
    
  return totaloriginal; 
     }
      
    
    
    
    
    
    public Reservation(List<Client> listc)       
    {    
           int ch; double tariftotal=0.0;
        System.out.println("Bienvenue,Combien de personnes sont concérnés par cette reservation ?");
        Scanner sc=new Scanner(System.in);
        int nb=sc.nextInt();
        clientconcer=nb;
        
        System.out.println("Et combien de chambres voulez vous réserver?");
        
          do
          {ch=sc.nextInt();
              if (ch>Chambres.nbrechambrespret)
              {System.out.println("On a pas assez de chambres pret :( , Voici la liste des chambres pretes");Hotel.affichechambrepret(Hotel.listChambres);}
          }while(ch>Chambres.nbrechambrespret);
        nbrchambres=ch;
        System.out.println("Finalement ,combien de nuitées voulez-vous restez?");
        int nui=sc.nextInt();
        nmbrenuitees=nui;
         String meth;
        datereserv=Saisirdatereserv();
        Chambres.nbrechambrespret--;
        for (int k=0;k<ch;k++)
        {Hotel.listChambres.remove(k);}
        Hotel.affichechambrepret(Hotel.listChambres);
        for (int i=1;i<=nb;i++)
        { if (i==1) {System.out.println("SVP Entrer les informations du client pour faire une reservation");}
            else
            
        {System.out.println("SVP Entrer les informations du "+i+"éme client pour faire une reservation");}
        String ccin;
        sc.nextLine();
        do
        {System.out.println("Entrer le Cin:");
         ccin=sc.nextLine();}
         while (numeriquecin(ccin)==false);


        
      
           if (Client.recherchecinclient(Hotel.Cins,ccin)==-1)
        { 
          String cmeth="";
        String cdate;
 
            String cprenom,cnom;
        do
        {   System.out.print("Entrer votre nom:");
            cnom=sc.nextLine();}
        while(estvide(cnom)|| !alphabetique(cnom));  
        do
        {   System.out.print("Votre prenom:");
            cprenom=sc.nextLine();}
        while((estvide(cprenom))||!(alphabetique(cprenom)));       
        System.out.println();
        System.out.println("Comment voulez vous faire une reservation ?");
        System.out.println("Tapez 1 si par téléphone:");
        System.out.println("Tapez 2 si par email:");
        do 
        { meth=sc.nextLine();
        if ((meth.charAt(0)!='1') && (meth.charAt(0)!='2')) 
        {System.out.println("Vous devez entrer un CHIFFRE entre 1 et 2");}
        }while (((meth.charAt(0)!='1') && (meth.charAt(0)!='2')) ||(meth.length()==0));
        
        switch(meth)
        {   
        case "1":do { 
        System.out.println("Votre numéro de teléphone:");
        cmeth=sc.nextLine();
        }while ((numerique(cmeth)==false)|| (estvide(cmeth)));
        break;
        
        case "2":do 
        {System.out.println("Votre adresse E-mail:");
        cmeth=sc.nextLine();}
        while ((testemail(cmeth)==false)||(estvide(cmeth)==false));
        break; 
        }
        System.out.println();
        System.out.println("Votre Adresse(ce champ n'est pas obligatoire :):");
        String cadr=sc.nextLine();
        System.out.println();
        do
        {System.out.println("Votre Date de naissance:");
        cdate=sc.nextLine();
        }while((testd(cdate)==false));
        numreserv++;
        Hotel.rnumres[nbrereservation]=numreserv;
        Client C=new Client(ccin,cnom,cprenom,cdate,cmeth,numreserv,cadr);
        Hotel.listClient.add(C); 
        Hotel.Cins[Client.getnbreclient()]=ccin;
        this.parqui=ccin;
        tariftotal=tariftotal+calcultarif(Hotel.listReservation,ccin,nmbrenuitees,Hotel.rnbrenuitees); 
        Client.setnbreclient(Client.getnbreclient()+1); 
      
       }else
           {System.out.println("Vous êtes déja dans notre liste de clients ! :),nous avons besoin que de vos informations de reservation");}
        System.out.println("Votre numéro de reservartion est:"+numreserv);
        System.out.println("Le tarif à payer pour ce client est "+calcultarif(Hotel.listReservation,ccin,nmbrenuitees,Hotel.rnbrenuitees)+" DT");}  this.tarif=tariftotal;  
   }
    public static  int comparerdate(String d1,String d2)
    {        int month1,month2;int day1,day2;
    int year1=Integer.parseInt(d1.substring(6,10));
    if (d1.charAt(3)=='0')
    { month1=Integer.parseInt(d1.substring(4,5));}
    else { month1=Integer.parseInt(d1.substring(3,5));}
     if (d1.charAt(0)=='0')
     { day1=Integer.parseInt(d1.substring(1,2));}
     else {  day1=Integer.parseInt(d1.substring(0,2));}
     
     int year2=Integer.parseInt(d2.substring(6,10));
       if (d2.charAt(3)=='0')
         { month2=Integer.parseInt(d2.substring(4,5));}
    else { month2=Integer.parseInt(d2.substring(3,5));}
      if (d2.charAt(0)=='0')
     { day2=Integer.parseInt(d2.substring(1,2));}
     else {  day2=Integer.parseInt(d2.substring(0,2));}
    if (year2>year1)
    {return -1;}
    else if (month2>month1)
    {return -1;}
    else if (day2>day1)
    {return -1;}
    else return 1;
    }
    
    public static String  Saisirdatereserv()
    { Scanner sc=new Scanner(System.in);
      String dat="05/01/2019";
       String degla="";
     boolean harba;
     do 
        {harba=true;
        System.out.println("Saisissez date de reservation:");
        degla=sc.nextLine();
        if (degla.length()!=10) 
        {System.out.println("La format de la date est incorrect");
        harba=false;}
        else if ((degla.charAt(2)!='/') || (degla.charAt(5)!='/'))
        {System.out.println("il faut mettre des '/'");
        harba=false;        
        }
        else if (comparerdate(degla,dat)==-1)
        {System.out.println("La date saisie ne peut pas etre inférieur à la date d'aujourd'hui");
        harba=false;
        }}
     
        while (harba==false);
      return degla;
       }
     static boolean testd (String date)
     {int day; int month;
        if (date.length()!=10) 
        {System.out.println("La format de la date est incorrect");
        return false;}
        else if ((date.charAt(2)!='/') || (date.charAt(5)!='/'))
        {System.out.println("il faut mettre des '/'");
        return false;        
        }
         if (date.charAt(3)=='0')
    {  month=Integer.parseInt(date.substring(4,5));}
    else {  month=Integer.parseInt(date.substring(3,5));}
         if (date.charAt(0)=='0')
     { day=Integer.parseInt(date.substring(1,2));}
     else {  day=Integer.parseInt(date.substring(0,2));}
        if (month==1 || month==3 || month==7 || month==8 || month==10 || month==12 )    
        { if (day>31)
           {
           System.out.println("Date invalide , ce mois a 31 jour");return false;
           }
        }
        if (month==4 || month==6 || month==9 || month==11)
        {if (day>30)
          {
          System.out.println("Date invalide , ce mois a 30 jours");
          }
        }
        if (month==2)
        {int year=Integer.parseInt(date.substring(6,10));
          if (year%4==0)
            { if (day>29){
                       System.out.println("Date invalide , ce mois a 29 jours");return false;
                        }
            }else{if (day>28) {System.out.println("Date invalide , ce mois a 28 jours");return false;}}
     
        }
     return true; }
     
     
    static boolean testemail(String email)
    {  if (!(email.contains(".")) ||!(email.contains("@"))&&!(email.contains("com"))&&!(email.contains("fr")) && !(email.contains("tn")))
    {System.out.println("le format de l'email est incorrect,saisissez de nouveau :)");
      return false;     
    }
    return true;}
   
    
    
    
    static boolean numerique(String tel)
    {   if (tel.length()!=8) 
       {System.out.println("if faut entrer un numéro de telephone correcte");return false;}

       else if (tel.charAt(0)=='0')
        {System.out.println("if faut entrer un numéro de telephone correcte");return false;}
    else{   int i=1;
        while (i<tel.length())
      {if ((tel.charAt(i)!='0') && (tel.charAt(i)!='1') && (tel.charAt(i)!='2') && (tel.charAt(i)!='3') && (tel.charAt(i)!='4') && (tel.charAt(i)!='5') && (tel.charAt(i)!='6') && (tel.charAt(i)!='7') && (tel.charAt(i)!='8') &&(tel.charAt(i)!='9'))
      {System.out.println("if faut entrer un numéro de telephone correcte");return false;}
      i++;}
        return true;
    }}

    static boolean numeriquecin(String tel)
    {   if (tel.length()!=8) 
       {System.out.println("if faut entrer un numéro de cin correcte");return false;}

       else if (tel.charAt(0)!='0')
        {System.out.println("if faut entrer un numéro de cin correcte");return false;}
    else{   int i=1;
        while (i<tel.length())
      {if ((tel.charAt(i)!='0') && (tel.charAt(i)!='1') && (tel.charAt(i)!='2') && (tel.charAt(i)!='3') && (tel.charAt(i)!='4') && (tel.charAt(i)!='5') && (tel.charAt(i)!='6') && (tel.charAt(i)!='7') && (tel.charAt(i)!='8') &&(tel.charAt(i)!='9'))
      {System.out.println("if faut entrer un numéro de cin correcte");return false;}
      i++;}
        return true;
    }}    
    static boolean estvide(String chaine)
    {if (chaine.length()==0)
      {System.out.println("ce champ ne peut pas etre vide! :)");
     return true;}
    return false;}
    
    
    static boolean alphabetique(String chaine)
     {  int i=0; String alphabet=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
                 
     String chaineu=chaine.toUpperCase();
       while (i<chaineu.length()) 
       {if (alphabet.indexOf(chaineu.charAt(i))==-1)
       {System.out.println("Ce champ ne  doit pas contenir des chiffres ou des symboles,saisissez de nouveau SVP");
      return false;}
       i++;}
    return true;}

//*************   ACCESSEURS *************
    
  public int getclientconcernees()  
  {  
  return clientconcer;
  }

  public int getnbrechambres()
  {
    return nbrchambres;
  }
  public int getnbrnuitees()
  {
    return nmbrenuitees;
  }
  public int getnumreserv()
  {
    return numreserv;
  }
  public  String getdatereserv()
  {
    return datereserv;
  }
  public  int getnbrereservation()
  {  return nbrereservation;
  }
 
  
  public String getparqui()
  {    return parqui;
  }
  public double gettarif()
  {return this.tarif;}
  //*************   MUTATEURS   *************

  
  public void setparqui ( String parqui)
  { 
      this.parqui=parqui;
  }
  
  
  public void setclientconcernees(int pclientconcernees)
  {
    clientconcer = pclientconcernees;
  }


  public void setnbrechambres(int pnbrechambres)
  {
    nbrchambres=pnbrechambres;
  }


  public void setnbrnuitees(int pnbrenuitees)
  {
    nmbrenuitees=pnbrenuitees;
  }
    public void setnumreserv(int pnumreserv)
  {
    numreserv= pnumreserv;
  }
    public void setdatereserv(String pdatereserv)
  {
    datereserv=pdatereserv;
  }
    public  void setnbrereservation(int pnbrereservation)
  {  nbrereservation=pnbrereservation;
  }
}
     