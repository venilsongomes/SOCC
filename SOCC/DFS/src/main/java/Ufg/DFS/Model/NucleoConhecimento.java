package Ufg.DFS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity

public class NucleoConhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; // Id será gerado automaticamente pelo banco de dados

    @OneToOne
    private ManifestacaoIntencao manifestacaoIntencao;

    public NucleoConhecimento() {
        super();
    }

    public NucleoConhecimento(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ManifestacaoIntencao getManifestacaoIntencao() {
        return manifestacaoIntencao;
    }

    public void setManifestacaoIntencao(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }
    
  
    
}
