package Ufg.DFS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Status {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; // Id será gerado automaticamente pelo banco de dados
    private Boolean aberto;
    private Boolean Aceito;
    private Boolean rejeitado;

   // @OneToOne
    //private ManifestacaoIntencao manifestacaoIntencao;

    public Status() {
        this.aberto = true;
        this.Aceito = false;
        this.rejeitado = false;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Boolean getAceito() {
        return Aceito;
    }

    public void setAceito(Boolean aceito) {
        Aceito = aceito;
    }

    public Boolean getRejeitado() {
        return rejeitado;
    }

    public void setRejeitado(Boolean rejeitado) {
        this.rejeitado = rejeitado;
    }
}
