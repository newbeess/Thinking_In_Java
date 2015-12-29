
import static com.elephant.util.Print.*;
import access.dessert.*;
public class ChocolateChip extends Cookie {
	public ChocolateChip(){
		print("ChocolateChip constructor!");
	}
	public void chomp(){
		//! bite();
	}
	public static void main(String[] args){
		ChocolateChip x=new ChocolateChip();
		x.chomp();
	}
}
