public class Lab9Task4
{

    public static void main(String[] args)
    {

        Restaurant r1 = new Restaurant("Plearn", "99/9 Thapho, Muang", "Phitsanulok", "Thai");
        Restaurant r2 = new Restaurant("Coffee Space", "99/9 Thapho, Muang", "Phitsanulok", "Coffee");

        if (r1.isThaiFood())
        {
            System.out.println(r1.getName() + " is Thai food.");
        }

        if (r2.isThaiFood())
        {
            System.out.println(r2.getName() + " is Thai food.");
        }

        if (r1.hasSameFoodType(r2))
        {
            System.out.println(r1.getName() + " and " + r2.getName() + " are the same food type.");
        }
        else
        {
            System.out.println(r1.getName() + " and " + r2.getName() + " are NOT the same food type.");
        }
    }

}

class Place{
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
}

class Restaurant extends Place{
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
}