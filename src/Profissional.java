public class Profissional {
    private String nome;
    private String contato;
    private String cpf;
    private String dataDeNascimento;

    public Profissional(String nome) {
        this.nome = nome;
    }

    public Profissional(String nome, String contato, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}
