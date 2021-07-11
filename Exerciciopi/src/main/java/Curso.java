public class Curso {

    private String nomeCurso;
    private TipoEnsino tipoEnsinoCurso;
    private Professor coordenador;
    private Escola escola;

    public Escola getEscolaObj() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getEscola()
    {
        return escola.getNomeEscola();
    }

    public Professor getCoordenadorObj() {
        return coordenador;
    }

    public Professor setCoordenacao(Professor coordenacao) {
        return this.coordenador = coordenacao;
    }

    public String getCoordenadorCurso()
    {
        return coordenador.getNome();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public TipoEnsino getTipoCursoObj() {
        return tipoEnsinoCurso;
    }

    public void setTipoensinocurso(TipoEnsino tipoensinocurso) {
         this.tipoEnsinoCurso = tipoensinocurso;
    }

    public String getTipoEnsinoCurso(){
        return this.tipoEnsinoCurso.getTipoEnsino();
    }


}
