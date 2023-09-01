
public class ejercicio3 {
	public static void main(String[] args) {
		try {
			System.out.println("Inicializando la variable n1 con el valor máximo de enteros +1");
			int n1=Integer.MAX_VALUE+1;
			System.out.println("El número es = "+n1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
