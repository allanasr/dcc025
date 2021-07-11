public class Professor extends Pessoa{

    private Curso contratado;
    private TipoEnsino tipoEnsino;

    public Curso getContratadoObj() {
        return contratado;
    }

    public Curso setContratado(Curso contratado) {
        return this.contratado = contratado;
    }

    public String getContratacao(){
        return this.contratado.getNomeCurso();
    }

    public String getTipoEnsino(){
        return this.tipoEnsino.getTipoEnsino();
    }
}
