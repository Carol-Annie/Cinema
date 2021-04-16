package Filme;

public class Filme {
    
      private String nomeFilme;
    private String duracao;
    private String secao;
    private String genero;
    private int numeroIngresso;
    private String dispo;
    
    public String getNome() {
        return nomeFilme;
    }
    
    public String getDuracao() {
        return duracao;
    }
    
    public String getSecao() {
        return secao;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public int getNumwroIg() {
        return numeroIngresso;
    }
    
    public String getDispo() {
        return dispo;
    }
   
    public void dadosFilmes(String nomeFilme,String duracao,String genero,String secao,String numeroIngresso,String dispo) {
        this.nomeFilme = nomeFilme;
        this.duracao = duracao;
        this.genero = genero;
        this.secao = secao;
        this.numeroIngresso = Integer.parseInt(numeroIngresso);
        this.dispo = dispo;
    }
    
}
