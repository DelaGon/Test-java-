class Fraction{
    private int top;
    private int bottom;
    Fraction(int t,int b){
        this.top =t;
        this.bottom =b;

    }
    public int gettop(){ 
        return this.top;
    }
    public int getbottom(){ 
        return this.bottom;
    }
    public String toString(){
        return (this.top+"/"+this.bottom);
    }
    public Double toDouble(){
        return (double)this.top/(double)this.bottom;
    }
    public boolean equals(Fraction that){
        return ((this.top == that.top)&&(this.bottom == that.bottom));
    }
    private static int gcd(int a,int b){
        if (b == 0) {
            return Math.abs(a);
            }
        return gcd(b,a%b);
    }
    public void simplify(){ 
        int tt = gcd(top,bottom);
        this.top=top/tt;
        this.bottom=bottom/tt;
    } 
    public Fraction multiply(Fraction ii){
        int t = this.top*this.bottom+ii.top*ii.bottom;
		int b = this.bottom*ii.bottom;
		Fraction a = new Fraction (t,b);
		a.simplify();
		return a;

    }
	public static Fraction parse(String pp){
		String a = pp.charAt(0)+"";
		String b = pp.charAt(2)+"";
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		Fraction z = new Fraction(x,y);
			return z;
	
	}
	public Fraction add(Fraction ff){
		int t = (this.top*ff.bottom)+(this.bottom *ff.top);
	   int b =this.bottom *ff.bottom;
	   Fraction tb =new Fraction (t,b);
	   return tb;
	}
        
}
