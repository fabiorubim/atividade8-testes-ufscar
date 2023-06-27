import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import br.com.mathops.MathOps;
import br.com.mathops.Mutante1;
import br.com.mathops.Mutante2;
import br.com.mathops.Mutante3;
import br.com.mathops.OriginalMathOps;

public class MathOpsTest {

	@Test
	public void matarMutante1() {
		MathOps mo = mock(MathOps.class);
		OriginalMathOps omops = new OriginalMathOps(mo);
		int resultadoSomaFatoriais = omops.somaDeFatoriais(new int[2]);

		Mutante1 m1 = mock(Mutante1.class);
		int resultadoSomaFatoriaisMutante1 = m1.somaDeFatoriais(new int[2]);

		assertEquals(resultadoSomaFatoriais, resultadoSomaFatoriaisMutante1);
		// Mutante equivalente
		// Este teste passa
	}

	@Test
	public void matarMutante2() {
		MathOps mo = mock(MathOps.class);
		OriginalMathOps omops = new OriginalMathOps(mo);
		int resultadoSomaFatoriais = omops.somaDeFatoriais(new int[2]);

		Mutante2 m2 = mock(Mutante2.class);
		int resultadoSomaFatoriaisMutante2 = m2.somaDeFatoriais(new int[2]);

		assertEquals(resultadoSomaFatoriais, resultadoSomaFatoriaisMutante2);
		// Mutante equivalente
		// Este teste passa
	}

	@Test
	public void matarMutante3() {
		MathOps mo = mock(MathOps.class);
		OriginalMathOps omops = new OriginalMathOps(mo);
		int resultadoSomaFatoriais = omops.somaDeFatoriais(new int[2]);

		Mutante3 m3 = mock(Mutante3.class);
		int resultadoSomaFatoriaisMutante3 = m3.somaDeFatoriais(new int[2]);

		assertEquals(resultadoSomaFatoriais, resultadoSomaFatoriaisMutante3);
		// Mutante equivalente
		// Este teste passa
	}

}
