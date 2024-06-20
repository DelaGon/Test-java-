class Circle extends Shape{
    private double radius = 0;
    double PI  = Math.PI;
        Circle(String color,int radius){
            super(color);
            this.radius =radius;
        }
        public double getRadius(){
            return this.radius;
        }
        public void setRadius(int radius){
            this.radius =radius;
        }
        public String toString(){
            return "This Circle is "+this.getColor();
        }
        public double getArea(){
            return (this.radius * this.radius * PI);
        }

}