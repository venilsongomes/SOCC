package Ufg.DFS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class NucleoConhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; // Id será gerado automaticamente pelo banco de dados

    @OneToOne
    private ManifestacaoIntencao manifestacaoIntencao;

    private List<Docente> docentes; // Lista de docentes que fazem parte do núcleo de conhecimento

    public NucleoConhecimento() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NucleoConhecimento(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }

    public ManifestacaoIntencao getManifestacaoIntencao() {
        return manifestacaoIntencao;
    }

    public void setManifestacaoIntencao(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }
}
