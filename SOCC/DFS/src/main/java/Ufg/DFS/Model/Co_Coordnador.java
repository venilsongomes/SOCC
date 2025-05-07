package Ufg.DFS.Model;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Co_Coordnador extends Docente {
    private String usuario;
    private String senha;

    public Co_Coordnador(String usuario, String nome, String email, String telefone, String senha, Date ultimoAcesso) {
        super(nome, email, telefone, ultimoAcesso);
        this.senha = senha;
        this.usuario = usuario;
    }

    public Co_Coordnador() {
        super();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
