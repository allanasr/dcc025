public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Escolaridade escolaridade1 = new Escolaridade();
        Escolaridade escolaridade2 = new Escolaridade();
        Curso curso1 = new Curso();
        Escola escola1 = new Escola();
        Estado estado1 = new Estado();
        Cidade cidade1 = new Cidade();
        TipoEnsino tipoEnsino1 = new TipoEnsino();
        escolaridade1.setEscolaridade("Ensino Superior");
        escolaridade2.setEscolaridade("Ensino Medio");


        // Exercicios:
        //a
        escolaridade1.setEscolaridade("Doutorado");
        professor1.setEscolaridade(escolaridade1);
        System.out.println(professor1.getEscolaridade());
        //b
        curso1.setCoordenacao(professor1);
        System.out.println(curso1.getCoordenadorObj().getEscolaridade());
        //c
        escola1.setDirecao(professor2);
        professor2.setEscolaridade(escolaridade2);
        System.out.println(professor2.getEscolaridade());
        //d
        estado1.setNome("MG");
        aluno1.getNaturalidadeObj().setEstado(estado1);
        System.out.println(aluno1.getNaturalidadeObj().getEstadoNome());
        //e
        cidade1.setNaturalidade("JF");
        professor1.setNaturalidade(cidade1);
        System.out.println(professor1.getNaturalidade());
        //f
        escola1.getCidadeObj().setEstado(estado1);
        curso1.setEscola(escola1);
        System.out.println(aluno1.getCursandoObj().getEscolaObj().getCidadeObj().getEstadoNome());
        //g
        tipoEnsino1.setTipoEnsino("Superior");
        professor1.getContratadoObj().setTipoensinocurso(tipoEnsino1);
        System.out.println(professor1.getContratadoObj().getTipoEnsinoCurso());
        //h
        aluno1.setCursando(curso1);
        System.out.println(aluno1.getCursandoObj().getCoordenadorCurso());
        //i
        professor1.getContratadoObj().getEscolaObj().setDirecao(professor2);
        System.out.println(professor1.getContratadoObj().getEscolaObj().getDirecao());
        //j
        professor1.getContratadoObj().setCoordenacao(professor2);
        System.out.println(professor1.getContratadoObj().getCoordenadorCurso());






    }
}
