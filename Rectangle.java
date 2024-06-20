import javax.sound.midi.VoiceStatus;

class Rectangle extends Shape{
    private int width =0;
    private int height = 0;
    double PI  = Math.PI;
    Rectangle(String color,int width,int height){
        super(color);
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return "This Rectangle is "+getColor();
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return (this.width * this.height );
    }
    public void setWidth(int width){
         this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
   
}