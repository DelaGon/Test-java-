public class DataInt
{
	private int sum;
	private int count;
	public DataInt(){
	    sum =0;
	    count =0;
	    
	}public void add(int n){
	    sum+=n;
	    count++;
	}public int getSum(){
	    return sum;
	}public double getAverage(){
	    return (double)sum/count;
	}
	 

}
