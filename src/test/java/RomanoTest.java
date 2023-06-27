import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import br.com.romano.Mutante1;
import br.com.romano.Mutante2;
import br.com.romano.Mutante3;
import br.com.romano.Original;

public class RomanoTest {

	@Test
	public void matarMutante1() {
		Original o = new Original();
		String respostaOriginal = o.coverterParaRomano(10);

		Mutante1 m1 = mock(Mutante1.class);
		String respostaMutante1 = m1.coverterParaRomano(10);

		assertEquals(respostaOriginal, respostaMutante1);
		// Mutante morto
		// Este teste falha
	}

	@Test
	public void matarMutante2() {
		Original o = new Original();
		String respostaOriginal = o.coverterParaRomano(10);

		Mutante2 m2 = mock(Mutante2.class);
		String respostaMutante2 = m2.coverterParaRomano(10);

		assertEquals(respostaOriginal, respostaMutante2);
		// Mutante morto
		// Este teste falha
	}

	@Test
	public void matarMutante3() {
		Original o = new Original();
		String respostaOriginal = o.coverterParaRomano(10);

		Mutante3 m3 = mock(Mutante3.class);
		String respostaMutante3 = m3.coverterParaRomano(10);

		assertEquals(respostaOriginal, respostaMutante3);
		// Mutante morto
		// Este teste falha
	}
}
