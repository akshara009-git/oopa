package inheritance;

class Zooo{
	String	eat="eats food";
	public void eat() {
		System.out.println("Eats :"+eat);
	}
}
class Lion extends Zooo{
	@Override 
	public void eat(){
		System.out.println("eats other animals");}
	public void roar() {
        System.out.println("Lion roars loudly!");
    }
}
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Lion lion=new Lion();
       lion.eat();
       lion.roar();
	}

}
