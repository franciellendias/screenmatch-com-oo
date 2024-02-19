package br.com.franciellendias.screenmatch.modelos;

/*aqui br.com.franciellendias.screenmatch.modelos.Filme é uma classe, a abstração/estrutura de um objeto*/
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
