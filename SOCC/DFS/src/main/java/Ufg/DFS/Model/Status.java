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
    private String situacao;
    

    public Status() {
        
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String aberto) {
        this.situacao = aberto;
    }
}
