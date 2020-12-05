
package hotel;
import static hotel.Hotel.listClient;
import static hotel.Reservation.estvide;
import java.util.List;
import java.util.Scanner;

public class Evénement 
{ public static int nbresalle=7;
  public int nbresalleoccup=2;
  private static int nbreevenements=3;
  private String typeevenement,dateevenement;
  private boolean premierefois,accessiblepub;
  private String description;
  private int numsalle;
 
public Evénement(String typevenement,String dateevenement,boolean premierefois,boolean accssiblepub,String descirption ,int numsalle)
{
 this.accessiblepub=accssiblepub;
 this.description=descirption;
 this.typeevenement=typevenement;
 this.premierefois=premierefois;
 this.numsalle=numsalle;
 this.dateevenement=dateevenement;

}

 
public static int recherchesalleocc(int []tabs,int x)
    {  int monindice;
        for (int i=0 ; i< tabs.length ; i++)
        {    
            if (x==tabs[i])
        { 
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }

public static void afficheeven(List<Evénement> listev)
{  for (int i=0; i<listev.size(); i++)
      {  System.out.println("Type d'evenement :"+listev.get(i).gettypeev());
         System.out.println("à la date:"+listev.get(i).getdateev()+" ET AURA LIEU A LA SALLE NUMERO "+listev.get(i).getnumsalle());
        System.out.println("Description:"+listev.get(i).getdescription());
       System.out.println("*------------------------------------------------------------------*");
      System.out.println("*------------------------------------------------------------------*");}
}
public static int recherchetype(List<Evénement> listev,String type)
    {  int monindice;
        for (int i=0 ; i< listev.size() ; i++)
        {    
            if ( type.equals(listev.get(i).gettypeev()))
        { 
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }

public static int rechercheevenement(int [] numsalle,String[] dateev,int nums,String datev)
    {  int monindice;
        for (int i=0 ; i< nbreevenements; i++)
        {    
            if (dateev[i].equals(datev) && numsalle[i]==nums)
        { 
         monindice=i;
         return monindice;
        }   
  
        }
        return -1;
    }

public static void AjoutEvenement(List<Evénement> listev)
{Scanner sc=new Scanner(System.in);
Scanner scint=new Scanner(System.in);
   String rep; String type;  boolean ap,pf; int num;String datev;
      do
      { 
        do{System.out.println("Entrer la date de l'évenement");
        datev=sc.nextLine();}while (!Reservation.testd(datev) || Reservation.estvide(datev));
        do {System.out.println("Entrer le numéro de la salle ou l'événement aura lieu");      
           num=scint.nextInt();}while ("1234567".indexOf(String.valueOf(num))==-1);
        
      if (rechercheevenement(Hotel.sallesocc,Hotel.queldate,num,datev)!=-1) {System.out.println("La salle numéro "+num+" est occupée à la date "+datev+",Veuillez changer la date ou la salle");}
      }while(rechercheevenement(Hotel.sallesocc,Hotel.queldate,num,datev)!=-1);
      
      if (rechercheevenement(Hotel.sallesocc,Hotel.queldate,num,datev)==-1)
      { System.out.println("Nous avons besoin des informations sur l'évenement ");
        System.out.println("Quel est le type d'évenement ?");
        do
        {System.out.print("Type:");
        type =sc.nextLine();
        }while(!Reservation.alphabetique(type) || Reservation.estvide(type));
     
        if (recherchetype(listev,type)==-1)
        { pf=true;}else { pf = false;}

      
      System.out.println("Est-il accessible au public ?");
        do
        {System.out.print("Réponse:");
         rep =sc.nextLine();
        }
        while(!rep.toUpperCase().equals("OUI") && !rep.toUpperCase().equals("NON") || !Reservation.alphabetique(rep) || Reservation.estvide(rep));
        if (rep.toUpperCase().equals("OUI"))
        { ap=true;}  else { ap=true;}
      String desc="pas de description :( ";
      System.out.println("Donnez une description de l'événement? (ce champ n'est pas obligatoire)");
      do
        {System.out.print("Description:");
         desc =sc.nextLine();
        }
        while(!Reservation.alphabetique(desc));
 
      
      Evénement ev=new Evénement(type,datev,pf,ap,desc,num);
      listev.add(ev);
      
      Hotel.sallesocc[nbreevenements]=num;
      Hotel.queldate[nbreevenements]=datev;
      nbreevenements++;
      }//mtaa l if l evenement ynajem yetaamal          
      
      
      
      
      
      
      
      

}//mtaa ajoutevenment






  public int getnbresalle()  
  {  
    return nbresalle;
  }

  public int getnbresalleoccup()
  {
    return nbresalleoccup;
  }
  
  
  public String gettypeev()
  {
    return typeevenement;
  }
  
  
  public String getdateev()
  {
    return dateevenement;
  }
  
  
  public boolean getaccpub()
  {
    return accessiblepub;
  }

    public String getdescription()
  {
    return description;
  }
    
    
  public  int getnumsalle()  {  
    return numsalle;
  }
  
  
   public  boolean  getpremfois()  {  
    return premierefois;
  }
  //*************   MUTATEURS   *************


  
  public void setnbresalle(int nbresalle)  
  {  
    this.nbresalle=nbresalle;
  }

  public void  setnbresalleoccup(int nbreocc)
  {
    this.nbresalleoccup=nbreocc;
  }
  
  
  public void settypeev(String type)
  {
    this.typeevenement=type;
  }
  
  
  public void setdateev(String date)
  {
    this.dateevenement=date;
  }
  
  
  public void setaccpub(boolean acc)
  {
   this.accessiblepub=acc;
  }

    public void setdescription(String desc)
  {
  this.description=desc;
  }
    
    
  public  void  setnumsalle(int numsal)  {  
    this.numsalle=numsal;
  }
  
  
   public  void  setpremfois(boolean pf)  {  
    this.premierefois=pf;
  }




}//hethi mtaa l class



