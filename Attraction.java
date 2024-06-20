class Attraction extends Place{
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