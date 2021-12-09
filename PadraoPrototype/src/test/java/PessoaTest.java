
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class PessoaTest {
        @Test
        public void testClone() throws CloneNotSupportedException {
            Pessoa pessoa = new Pessoa("Paulo", 1.84,'M', 50, "Brasileiro");

            Pessoa pessoaClone = pessoa.clone();
            pessoaClone.setNome("Cristiano");
            pessoaClone.setIdade(60);
            pessoaClone.setAltura(1.96);
            pessoaClone.setNaturalidade("Americano");
            pessoaClone.setSexo('M');


            assertEquals("Pessoa{Nome=Paulo, Idade=50, Sexo=M, Altura=1.84, Naturalidade=Brasileiro}", pessoa.toString());
            assertEquals("Pessoa{Nome=Cristiano, Idade=60, Sexo=M, Altura=1.96, Naturalidade=Americano}", pessoaClone.toString());
        }



}
