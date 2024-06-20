public class Shop
{
  private Product[] menu;
  private Order[] orders;
  private int nextOrderIndex;

  public Shop(Product[] menu) 
  {
    this.menu = menu;
    this.orders = new Order[1000];
    nextOrderIndex = 0;
  }
   public Product[] getMenu(){
    return this.menu;
  }  
  public void placeOrder(int menuItemId, int table)
  {
   	Product product = menu[menuItemId];
        orders[nextOrderIndex] = new Order(table, product);
        nextOrderIndex++;
  }
  public void completeOrder(int n){
    orders[n].setComplete(true);
  }
  public void printOrders(){
    for (int i = 0;i<nextOrderIndex ;i++ ) {
      System.out.println("#"+i+" "+orders[i].toString());
    }
  }

   
}