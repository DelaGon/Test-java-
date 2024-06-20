class Shape{
	private String color = "undefined";
	Shape(String color){
		this.color = color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
 	public double getArea(){
 		return 0;
 	}
 	public String toString(){
 		return "This Shape is "+this.color;
 	}
}