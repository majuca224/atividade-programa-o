public class Oportunidade {
    // Atributos
    private String    titulos;
    private int       vagas         = 1;
    private int       classificados = 0;
    private boolean   aberta        = true;
    private Professor responsavel;

    // Construtor
    public Oportunidade(String titulos, int vagas, Professor responsavel) {
        this.titulos     = titulos;
        this.vagas       = (vagas >= 1) ? vagas : 1;
        this.responsavel = responsavel;
    }

    // Getters
    public String getTitulos() {
        return this.titulos;
    }

    public int getVagas() {
        return this.vagas;
    }

    public int getClassificados() {
        return this.classificados;
    }

    public boolean getAberta() {
        return this.aberta;
    }

    public Professor getResponsavel() {
        return this.responsavel;
    }

    // Métodos
    public void encerrar() {
        //pass
    }

    public void inscrever(estudante) {
        //pass
    }

    public void registrarClassificacao() {
        //pass
    }

    @Override
    public String toString() {
        return null;
    }
}
