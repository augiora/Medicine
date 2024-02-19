package indiaMedicineData;

import java.util.ArrayList;

public class Tester{

   public static void main(String[] args){
   }
   
   public double getPriceInOtherCurrency(MedicineDatabase database, String currencytype, String nameofmed){
      double euroexchange= 0.011;
      double poundexchange=0.0096;
      double yenexchange=1.81;
      double dollarexchange=0.012;
      double yuanexchange=0.087;
      ArrayList<indiaMedicine> medicineList= database.getName();
      for (int i=0; i< medicineList.size(); i++){
         if((medicinelist.get(i)).equals(nameofmed)){
             if(currencytype.equals("euro")){
               return ((database.getPriceinrupee())*(euroexchange));
            }
             else if(currencytype.equals("pound")){
               return ((database.getPriceinrupee())*(poundexchange));
               }
            
            else if(currencytype.equals("yen")){
               return ((database.getPriceinrupee())*(yenexchange));
            }
            else if(currencytype.equals("dollar")){
               return ((database.getPriceinrupee())*(dollarexchange));
            }
            else if(currencytype.equals("yuan")){
               return ((database.getPriceinrupee())*(yuanexchange));
          }
      
      }
   
   
   }



      public string ismymeddiscontinued(MedicineDatabase database, String nameofmed){
      ArrayList<indiaMedicine> medicineList= database.getName();
      for(int i=0;i<medicineList.size();i++){
          if((medicinelist.get(i)).equals(nameofmed){
            boolean notavailable=medicine.get(i).getDiscontinued();
            if (notavailable.equals(true)){
               return "Your medicine is not available"
        
              }
           else{
            return "Your medicine is available";
           }
         }
        
      }  
   }
   
   
      public int composition(MedicineDatabase database, String nameofchem){
         ArrayList<indiaMedicine> medicineList= database.getComposition();
         int count=0;
         for (String chemnames: medicineList){
            if (chemnames.equals(medicineList[0]) || (chemnames.equals(medicineList[0]))){
               count++;
            
            }
         
         
         }
         return count;
         

   }


     





         public int mannamefinder(MedicineDatabase database, String nameofmanufacturer){
         ArrayList<indiaMedicine> medicineList= database.getManufacturerName();
         int count=0;
         for (String manunames: medicineList){
            if (nameofmanufacturer.equals(manunames)){
               count++;
            
            }
         
         
         }
         return count;
         

   }
   
   
   
   public int (MedicineDatabase database, String type){
         ArrayList<indiaMedicine> medicineList= database.getComposition();
         count=0;
         
           for (String chemnames: medicineList){
            if (chemnames.equals(medicineList)){
               count++;
            
            }
         
         
         }
         return count;

        

   }
   
   
   
   
   
   
   
   
   

}