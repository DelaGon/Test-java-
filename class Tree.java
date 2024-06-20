class Tree{
      private int height = 10;
      public int getHeight() {
        return this.height;
    }
}

publicclass TestTree{
     public static void main(String[] args){
         Tree t = new Tree();
         System.out.println(t.getHeight());
    }
}