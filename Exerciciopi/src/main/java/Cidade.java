public class Cidade {

    private String naturalidade;
    private Estado estado;

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Estado getEstadoObj() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstadoNome(){
        return estado.getNome();
    }
}
