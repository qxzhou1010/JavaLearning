package z.qx.oo1125;
import java.util.Random;;

enum Season{
	A,B,C,D
}
public class TestEnum {
	public static void main(String[] args) {
		for(Season k:Season.values()) {
			System.out.println(k);
		}
	}

}
