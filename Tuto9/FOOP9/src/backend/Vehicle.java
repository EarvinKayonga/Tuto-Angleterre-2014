package backend;

import java.io.Serializable;

/**
*
* @author charly
*/
public class Vehicle implements Serializable {

   private String manufacturer, model, customer=null, vid, manufDate, sellDate=null;
   private boolean sold = false; // Do I really need it ?
   private char taxBand;
   private float cost;
   
   public Vehicle(String ma, String mo, String vin, String maDate, char t, float f) {
       manufacturer=ma;
       model=mo;
       vid=vin;
       manufDate=maDate;
       taxBand=t;
       cost=f;
   }
   
   public void buy(String cust, String date) {
       sold = true;
       sellDate = date;
       customer = cust;
   }
   
   public String getBand() {
       switch(taxBand) {
           case 'a':
           case 'A': 
               return "0-100";
           case 'b':
           case 'B':
               return "101-110";
           case 'c':
           case 'C':
               return "111-120";
           case 'd':
           case 'D':
               return "121-130";
           case 'e':
           case 'E':
               return "131-140";
           case 'f':
           case 'F':
               return "141-150";
           case 'g':
           case 'G':
               return "151-160";
           default:
               return "Invalid tax band value";
       }
   }

   /**
    * @return the manufacturer
    */
   public String getManufacturer() {
       return manufacturer;
   }

   /**
    * @param manufacturer the manufacturer to set
    */
   public void setManufacturer(String manufacturer) {
       this.manufacturer = manufacturer;
   }

   /**
    * @return the model
    */
   public String getModel() {
       return model;
   }

   /**
    * @param model the model to set
    */
   public void setModel(String model) {
       this.model = model;
   }

   /**
    * @return the customer
    */
   public String getCustomer() {
       return customer;
   }

   /**
    * @param customer the customer to set
    */
   public void setCustomer(String customer) {
       this.customer = customer;
   }

   /**
    * @return the vid
    */
   public String getVid() {
       return vid;
   }

   /**
    * @param vid the vid to set
    */
   public void setVid(String vid) {
       this.vid = vid;
   }

   /**
    * @return the manufDate
    */
   public String getManufDate() {
       return manufDate;
   }

   /**
    * @param manufDate the manufDate to set
    */
   public void setManufDate(String manufDate) {
       this.manufDate = manufDate;
   }

   /**
    * @return the sellDate
    */
   public String getSellDate() {
       return sellDate;
   }

   /**
    * @param sellDate the sellDate to set
    */
   public void setSellDate(String sellDate) {
       this.sellDate = sellDate;
   }

   /**
    * @return the sold
    */
   public boolean isSold() {
       return sold;
   }

   /**
    * @param sold the sold to set
    */
   public void setSold(boolean sold) {
       this.sold = sold;
   }

   /**
    * @return the taxBand
    */
   public char getTaxBand() {
       return taxBand;
   }

   /**
    * @param taxBand the taxBand to set
    */
   public void setTaxBand(char taxBand) {
       this.taxBand = taxBand;
   }

   /**
    * @return the cost
    */
   public float getCost() {
       return cost;
   }

   /**
    * @param cost the cost to set
    */
   public void setCost(float cost) {
       this.cost = cost;
   }
   
   @Override
   public String toString() {
       String res="";
       res+=manufacturer+" "+model+" "+cost+"£";
       if (this.isSold()) {
           res+="\nOwner: "+customer;
       }
       return res;
   }
   
   @Override
      public boolean equals(Object o) {
       if (o instanceof Vehicle) {
           return (((Vehicle) o).vid == null ? this.vid == null : ((Vehicle) o).vid.equals(this.vid));
       } else {
           return false;
       }
   }

   @Override
   public int hashCode() {
       int hash = 7;
       hash = 11 * hash + (this.vid != null ? this.vid.hashCode() : 0);
       return hash;
   }
   
}
