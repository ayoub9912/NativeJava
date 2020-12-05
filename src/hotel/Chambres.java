
package hotel;
import static hotel.Hotel.listClient;
import static hotel.Reservation.estvide;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Chambres {
protected    int NumC,etage;
protected  String etat;
static public   int nbrechambres=20;
static private int nbrechambresocc=15;


    static  int nbrechambrespret=5;


     public static int recherchechambres(List<Chambres> ch,int numc,int nume)
     {   int i =0;
        while (i<ch.size())
               {if (ch.get(i).getNumC()==numc  && ch.get(i).getEtage()==nume) 
                 {  return i;  }
               }

     return -1;}


     
     
     
    public Chambres (int NumC,int etage,String etat)
    {  
       this.NumC=NumC;
       this.etage=etage;
       this.etat=etat;
    }
        
      
      public int getNumC()
     {
          return NumC;
     }
      public int getEtage()
     {
          return etage;
     }
      public String getEtat()
      { 
          return etat;
      }
      public int getnbrechambres()
      {return this.nbrechambres;
      }
       public int getnbrechambresocc()
      {return this.nbrechambresocc;
      }
       public int getnbrechambrespre()
       { return this.nbrechambrespret;
       }
 
     
      
    
     
  
      public  void setNumC(int sNumC)
      {
         NumC=sNumC;
      }
      public void setEtage(int sEtage)
      {
          etage=sEtage;
      }
      public   void setEtat(String sEtat)
      {
          etat=sEtat;
      }
       public void setnbrechambres(int nbre)
      {
         this.nbrechambres=nbre;
      }

        public void setnbrechambresocc(int nbre)
      {
          this.nbrechambresocc=nbre;
      }


    
}
