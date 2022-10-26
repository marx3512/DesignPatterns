public class Aluno {
    private String nome;
    private String caideraMatriculada;

    public Aluno(String nome, String caideraMatriculada) {
        this.nome = nome;
        this.caideraMatriculada = caideraMatriculada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaideraMatriculada() {
        return caideraMatriculada;
    }

    public void setCaideraMatriculada(String caideraMatriculada) {
        this.caideraMatriculada = caideraMatriculada;
    }

    
}