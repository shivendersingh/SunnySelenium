package JavaCLass;
/**
 * 
 * newobj.setA(70);
		System.out.println(newobj.getA());
		newobj.setName("sunny");
		System.out.println(newobj.getName());
 *
 */
public class NEWEncapasulation extends Encapsulation {

	public static void main(String[] args) {
		NEWEncapasulation newobj = new NEWEncapasulation();
		newobj.setA(100);
		System.out.println(newobj.getA()+90);
	}
}
