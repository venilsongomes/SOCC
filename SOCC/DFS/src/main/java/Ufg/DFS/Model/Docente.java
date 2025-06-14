package Ufg.DFS.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    private String email;

    @OneToOne(mappedBy = "docente")
    @JsonBackReference
    private ManifestacaoIntencao manifestacaoIntencao;

    @OneToOne
    private AreaConhecimento areaConhecimento;

    @ManyToMany
    @JoinTable(name = "nucleo_conhecimento_docente",
            joinColumns = @JoinColumn(name = "docente_id"),
            inverseJoinColumns = @JoinColumn(name = "nucleo_conhecimento_id")
            )
            @com.fasterxml.jackson.annotation.JsonManagedReference
            private List<NucleoConhecimento> nucleoConhecimento = new ArrayList<>();

    private String telefone;
    private Date ultimoAcesso;

    public Docente() { }

    public Docente(String nome, String email, String telefone, Date ultimoAcesso) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ultimoAcesso = ultimoAcesso;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Date getUltimoAcesso() { return ultimoAcesso; }
    public void setUltimoAcesso(Date ultimoAcesso) { this.ultimoAcesso = ultimoAcesso; }

    public ManifestacaoIntencao getManifestacaoIntencao() { return manifestacaoIntencao; }
    public void setManifestacaoIntencao(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }

    public AreaConhecimento getAreaConhecimento() { return areaConhecimento; }
    public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public List<NucleoConhecimento> getNucleoConhecimento() {
    return nucleoConhecimento;
}

    public void setNucleoConhecimento(List<NucleoConhecimento> nucleoConhecimento) {
        this.nucleoConhecimento = nucleoConhecimento;
    }
}

/*
package Ufg.DFS.Model;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // indica herança de classe

public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Docente() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String nome;
    private String email;

    @OneToOne(mappedBy = "docente")
    @JsonBackReference
    private ManifestacaoIntencao manifestacaoIntencao;

    public ManifestacaoIntencao getManifestacaoIntencao() {
        return manifestacaoIntencao;
    }

    public void setManifestacaoIntencao(ManifestacaoIntencao manifestacaoIntencao) {
        this.manifestacaoIntencao = manifestacaoIntencao;
    }

    @OneToOne
    private AreaConhecimento areaConhecimento;
    @ManyToMany
    @JoinTable(name = "nucleo_conhecimento_docente", // Nome da tabela de junção
            joinColumns = @JoinColumn(name = "docente_id"), // Coluna que referencia Docente
            inverseJoinColumns = @JoinColumn(name = "nucleo_conhecimento_id") // Coluna que referencia
                                                                              // NucleoConhecimento
    )
    private List<NucleoConhecimento> nucleoConhecimento;
    private String telefone;
    private Date ultimoAcesso;

    public Docente(String nome, String email, String telefone, Date ultimoAcesso) {

        this.nome = nome;
        this.email = email;

        this.telefone = telefone;
        this.ultimoAcesso = ultimoAcesso;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public NucleoConhecimento getNucleoConhecimento() {
        return (NucleoConhecimento) nucleoConhecimento;
    }

    public void setNucleoConhecimento(List<NucleoConhecimento> nucleoConhecimento) {
        this.nucleoConhecimento = nucleoConhecimento;
    }

    public AreaConhecimento getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

}*/
