public class Servico {
    private String tipo;
    private String descricao;

    public Servico(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
