package calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculadoraTest {

	@Test
	public void testCalculadora() {
		
		double resultado = Calculadora.suma(3, 2);
		int resultado2 = Calculadora.multiplicacion(4, 2);
		double resultado3 = Calculadora.division(10.2, 2.5);
		

		
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		
	}
	
	

}
