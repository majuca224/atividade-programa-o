
public class Oportunidade {
    
    private String titulos;
    private int vagas;
    private int classificados = 0;
    private boolean aberta = true;
    private Professor responsavel;

    
    public Oportunidade(String titulos, int vagas, Professor responsavel) {
        this.titulos = titulos;
        this.vagas = (vagas >= 1) ? vagas : 1;
        this.responsavel = responsavel;
    }


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

    public void encerrar() {
        aberta = false;
    }

    public Inscricao inscrever(Estudante estudante) {
        if (!aberta) {
            return null;
        }
        return new Inscricao(estudante, this);
    }

    public boolean registrarClassificacao() {
        if (classificados >= vagas) {
            return false;
        }
        classificados++;
        return true;
    }

    public void removerClassificacao() {
        if (classificados > 0) {
            classificados--;
        }
    }

    @Override
    public String toString() {
        String nomeResponsavel = responsavel == null
                ? "não informado"
                : responsavel.getNome();

        return "Oportunidade: " + titulos
                + ", Vagas: " + vagas
                + ", Classificados: " + classificados
                + ", Aberta: " + aberta
                + ", Responsável: " + nomeResponsavel;
    }
}

