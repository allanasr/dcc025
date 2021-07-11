public class Aluno extends Pessoa{

    private Curso cursando;

    public Curso getCursandoObj() {
        return cursando;
    }

    public String getCursando() {
        return cursando.getNomeCurso();
    }

    public void setCursando(Curso cursando) {
        this.cursando = cursando;
    }

}
