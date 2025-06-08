package Ufg.DFS.Model;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity
public class NucleoConhecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "nucleoConhecimento")
    @JsonIgnore
    private List <ManifestacaoIntencao> manifestacaoIntencao;
     
    @ManyToMany(mappedBy = "nucleoConhecimento")
    @com.fasterxml.jackson.annotation.JsonBackReference
        private List<Docente> docentes = new ArrayList<>() ;



    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public NucleoConhecimento() {
        super();
    }

    public NucleoConhecimento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ManifestacaoIntencao> getManifestacaoIntencao() {
        return manifestacaoIntencao;
    }

    public void setManifestacaoIntencao(List <ManifestacaoIntencao> manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }
}
