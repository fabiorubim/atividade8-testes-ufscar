import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import br.com.pessoa.Mutante1;
import br.com.pessoa.Mutante2;
import br.com.pessoa.Mutante3;
import br.com.pessoa.Original;
import br.com.pessoa.Pessoa;

public class PessoaTest {

	  @Test
	    public void matarMutante1() {
		  Pessoa p = new Pessoa("Fabio", 36);
		  Original o = mock(Original.class);
		  String respostaOriginal = o.definirFaixaEtaria(p);
		  
		  Mutante1 m1 = mock(Mutante1.class);
		  String respostaMutante1 = m1.definirFaixaEtaria(p);
		  
		  assertEquals(respostaOriginal, respostaMutante1);
			// Mutante equivalente
			// Este teste passa
	  }
	  
	  @Test
	    public void matarMutante2() {
		  Pessoa p = new Pessoa("João", 17);
		  Original o = mock(Original.class);
		  String respostaOriginal = o.definirFaixaEtaria(p);
		  
		  Mutante2 m2 = mock(Mutante2.class);
		  String respostaMutante2 = m2.definirFaixaEtaria(p);
		  
		  assertEquals(respostaOriginal, respostaMutante2);
			// Mutante equivalente
			// Este teste passa
	  }
	  
	  @Test
	    public void matarMutante3() {
		  Pessoa p = new Pessoa("Pedro", 59);
		  Original o = mock(Original.class);
		  String respostaOriginal = o.definirFaixaEtaria(p);
		  
		  Mutante3 m3 = mock(Mutante3.class);
		  String respostaMutante3 = m3.definirFaixaEtaria(p);
		  
		  assertEquals(respostaOriginal, respostaMutante3);
			// Mutante equivalente
			// Este teste passa
		  
	  }
	
}
