public class Pessoa {

    private String nome;
    private Escolaridade nivelEscolaridade;
    private Cidade naturalidade;

    public Cidade getNaturalidadeObj() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNaturalidade()
    {
        return naturalidade.getNaturalidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return nivelEscolaridade;
    }

    public Escolaridade setEscolaridade(Escolaridade escolaridade) {
        return this.nivelEscolaridade = escolaridade;
    }

    public String getNivelEscolaridade(){
        return this.nivelEscolaridade.getEscolaridade();
    }
}
