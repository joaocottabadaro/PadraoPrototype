public class Pessoa implements Cloneable{
    public String nome;
     public double altura;
     public char sexo;
     public int idade;
     public String naturalidade;

    public Pessoa(String nome, double altura, char sexo, int idade, String naturalidade) {
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;
        this.idade = idade;
        this.naturalidade = naturalidade;
    }
    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoaClone = (Pessoa) super.clone();
        return pessoaClone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome=" + nome +
                ", Idade=" + idade +
                ", Sexo=" + sexo +
                ", Altura=" + altura +
                ", Naturalidade=" + naturalidade +
                "}";
    }
}
