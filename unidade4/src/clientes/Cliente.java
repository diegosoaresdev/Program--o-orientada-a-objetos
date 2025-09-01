package clientes;

public class Cliente {
    private String nome;
    private String biotipo;

    public Cliente(String nome, String biotipo) {
        this.nome = nome;
        this.biotipo = biotipo;
    }

    public String getNome() {
        return nome;
    }

    public String getBiotipo() {
        return biotipo;
    }
}