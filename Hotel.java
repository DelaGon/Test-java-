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