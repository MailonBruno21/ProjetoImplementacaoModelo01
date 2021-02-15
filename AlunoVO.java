package vo;

public class AlunoVO {
    private int matricula;
    private String nomeMae;
    private String nomePai;
    private String nome;
    private EnumSexo sexo;
    private EnderecoVO endereco;

    public AlunoVO() {
        this.matricula = 0;
        this.nomeMae = "";
        this.nomePai = "";
        this.nome = "";
        this.sexo = EnumSexo.FEMININO;
        this.endereco = new EnderecoVO();
    }

    public AlunoVO(int matricula, String nome, EnumSexo sexo) {
        this();
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public EnderecoVO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoVO endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "AlunoVO{" + "matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", endereco=" + endereco + '}';
    }
    
    
    
}
