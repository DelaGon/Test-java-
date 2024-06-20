import java.util.ArrayList;
import java.util.List;
 
public class FindMiddle {
	
 public static void main(String[] args) {
	
	 List<String> list = new ArrayList<String>();
	 
	 for(int i=0; i<=50; i++){
	 list.add(String.valueOf(i));
	 }
	 
	 int middle = list.size()/2;
	 
	 String middleValue = list.get(middle);
 
	 System.out.println(middleValue);
	 
   }
}