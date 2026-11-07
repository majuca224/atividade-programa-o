public class Inscricao {
private Estudante estudante;
private Oportunidade oportunidade;
private String situacao = "pendente";

public Inscricao(Estudante estudante, Oportunidade oportunidade) {
    this.estudante = estudante;
    this.oportunidade = oportunidade;
}

public Estudante getEstudante() {
    return this.estudante;
}

public Oportunidade getOportunidade() {
    return this.oportunidade;
}

public String getSituacao() {
    return this.situacao;
}

public boolean classificar() {
    if (situacao.equals("classificado")) {
        return true;
    }

    if (!oportunidade.registrarClassificacao()) {
        return false;
    }

    situacao = "classificado";
    return true;
}

public void desclassificar() {
    if (situacao.equals("classificado")) {
        oportunidade.removerClassificacao();
    }

    situacao = "desclassificada";
}

@Override
public String toString() {
    return String.format("Estudante: %s, Oportunidade: %s, Situação: %s",
            estudante.getNome(),
            oportunidade.getTitulos(),
            situacao);
}


}
