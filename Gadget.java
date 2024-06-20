class Gadget {
   private String name;
   private double price;
   private double netPrice;
   Gadget(String name,double price,double netPrice){
       this.name = name;
       this.price = price;
       this.netPrice=price;
   } 
   public String getName(){
       return this.name;
   }
   public double getPrice(){
       return this.price;
   }
   public double getNetPrice(){
       return this.netPrice;
   }
   public void discount(double percent){
       this.netPrice =this.price - (this.price*percent/100);
   }
}
