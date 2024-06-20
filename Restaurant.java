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