class Inscricao {
    private Estudante estudante;
    private Oportunidade oportunidade;
    private String situacao = "pendente";

    public Inscricao(Estudante estudante, Oportunidade oportunidade){
        
        this.estudante = estudante;
        this.oportunidade = oportunidade;
    }
        
    public Estudante getEstudante(){
        
        return this.estudante;
    }

    public Oportunidade getOportunidade(){
        
        return this.oportunidade;
    }

    public String getSituacao(){
        
        return this.situacao;
    }

    public void classificar(){
        
        this.situacao = "classificada";
    }

    public void desclassificar(){
       
        this.situacao = "desclassificada";
    }
    
}
