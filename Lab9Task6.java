import java.util.Scanner;
public class Lab9Task6 
{

    public static void main(String[] args)
    {

        Hotel top = new Hotel("Topland Hotel", "Muang", "Phitsanulok", 1250);

        System.out.println(top.toString());
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many nights do you want? ");
        int nights = sc.nextInt();
        System.out.println("Price for " + nights + " nights is " + top.calculatePrice(nights) + " baht per room");
        System.out.println();

        System.out.print("How many rooms do you want? ");
        int rooms = sc.nextInt();
        System.out.println("Total price for " + rooms + " rooms for " + nights + " nights is " + top.calculatePrice(nights, rooms) + " baht");
    }

}                                           class Place{
    private String name;
    private String address;
    private String province;
    Place(String name,String address,String province){
      this.name = name;
      this.address = address;
      this.province = province;
    }
    public String getName(){
      return name;
    }
    public String getAddress(){
      return address;
    }
    public String getProvince(){
      return province;
    }
    public String toString(){
      return name+", "+address+", "+province;
    }
    public boolean equals(Place object){
      if(object.getName()==this.name && object.getAddress()==this.address && object.getProvince()==this.province){
        return true;
      }return false;
    }
}                                         class Restaurant extends Place{
    private String foodType;

    Restaurant(String name,String address,String province,String foodType){
      super(name,address,province);
      this.foodType = foodType;
    }
    public String getFoodType(){
      return foodType;
    }
    public boolean isThaiFood(){
      if(getFoodType().equals("Thai")){
        return true;
      }return false;
    }
    public boolean hasSameFoodType(Restaurant x){
      if(x.getFoodType()==this.foodType){
        return true;
      }return false;
    }
}                                      class Attraction extends Place{
  private String AttractionType;
  private int TicketPrice;

  Attraction(String name,String address,String province,String AttractionType,int TicketPrice){
    super(name,address,province);
    this.AttractionType = AttractionType;
    this.TicketPrice = TicketPrice;
  }
  public String getAttractionType(){
    return AttractionType;
  }
  public int getEntryTicketPrice(){
    return TicketPrice;
  }
  public boolean isFreeEntry(){
    if(TicketPrice==0){
      return true;
    }return false;
  }
}

class Hotel extends Place{
        private int money;
        Hotel(String name,String address,String province,int money){
          super(name,address,province);
          this.money = money;
        }
        public int calculatePrice(int nights){
          return nights*money;
        }
        public int calculatePrice(int nights,int rooms){
          return nights*rooms*money;
        }
      }