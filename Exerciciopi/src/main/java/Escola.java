public class Escola {

    private String nomeEscola;
    private Professor direcao;
    private Cidade cidade;

    public Cidade getCidadeObj() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCidade()
    {
        return cidade.getNaturalidade();
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Professor getDirecaoObj() {
        return direcao;
    }

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public String getDirecao()
    {
        return "Diretor(a)" + direcao.getNome();
    }
}
