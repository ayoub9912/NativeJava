
package hotel;

import java.util.List;


public class Recette {
    
     public  static double calcultarifrecette(List<Reservation> res,String cin,int nmbrenuitees,int[] rnbrenuitee)
      { int i=Client.recherchecinclient(Hotel.Cins,cin);double totaloriginal=nmbrenuitees*200; double total=0;

    {String année=res.get(i).getdatereserv().substring(6,10);
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
              {total=totaloriginal-(totaloriginal*0.3);return total;}
              else if (nbrenuitparan>=20 && nbrenuitparan<30)
              {total=totaloriginal-(totaloriginal*0.2);return total;}
    } 

  return totaloriginal; 
     }
     
     public final static double calculrecetteparanne(String annee)
    {int i;
  double prix=0;
   for(i=0;i<Hotel.listReservation.size();i++)
        {String anneetest=Hotel.listReservation.get(i).getdatereserv().substring(6);
        if(anneetest.equals(annee))
            {
            prix=prix+Hotel.listReservation.get(i).gettarif();
            }
       
        }
    System.out.println("le revenue pour cette année "+annee+" est "+prix+" DT");  

     return prix;}
     
     
    public final static double calculreccetteparmoi(String annee,String mois)
    {    String moistest ="";
   double prix=0;
   for(int i=0;i<Hotel.listReservation.size();i++)
        {
            
    
        moistest=Hotel.listReservation.get(i).getdatereserv().substring(3,5);
           
         String anneetest=Hotel.listReservation.get(i).getdatereserv().substring(6);
         if(moistest.equals(mois))
            {
           if (anneetest.equals(annee)) 
                            {
               prix=prix+Hotel.listReservation.get(i).gettarif();
                            }
            }
        }
   System.out.println("le revenue pour le "+moistest+" eme mois de l'année "+annee+" est "+prix+" DT");    
  return prix; }
    
    
     public final static  String maxAnne()
     {String annetest=Hotel.listReservation.get(0).getdatereserv().substring(6);//2019
      double maxrevenue=0.0; String année="";
      double prix=0.0;
      int i=0;
      while(i<Hotel.listReservation.size())
      {int k=i;
         while (k<Hotel.listReservation.size())
         {if (Hotel.listReservation.get(k).getdatereserv().substring(6).equals(annetest))
         {prix=prix+Hotel.listReservation.get(k).gettarif();System.out.print("hsebt");}
         k++;
         
         
         }if (prix>maxrevenue)
          {maxrevenue=prix; année=Hotel.listReservation.get(k-1).getdatereserv().substring(6);}
           i=k;annetest=Hotel.listReservation.get(i).getdatereserv().substring(6);
      
      }
      System.out.println("L'année la plus prospére est:"+année+" avec un revenue de "+maxrevenue);
     
     return année;}
    
    public final static void Statistacs()
    {  int i=0;
              while (i<Hotel.listReservation.size())
              
            {int k=i+1;  String anneetest=Hotel.listReservation.get(i).getdatereserv().substring(6);
                       int compteur=1;
              while (k<Hotel.listReservation.size() && Hotel.listReservation.get(k).getdatereserv().substring(6).equals(anneetest) )
              
                {     
                   compteur++;
                   k++; 
                }
              
                System.out.println("Dans l'année "+anneetest+" On a eu "+compteur+" Reservation(s)");
            i=k;}
               

    }

}
