package Ufg.DFS.Model;

import java.util.Date;
import java.util.List;

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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)// indica herança de classe

public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String email;

    @OneToOne
    private AreaConhecimento areaConhecimento;
    @ManyToMany
    @JoinTable( name = "nucleo_conhecimento_docente", // Nome da tabela de junção
    joinColumns = @JoinColumn(name = "docente_id"), // Coluna que referencia Docente
    inverseJoinColumns = @JoinColumn(name = "nucleo_conhecimento_id") // Coluna que referencia NucleoConhecimento
    )
    private List <NucleoConhecimento> nucleoConhecimento;
    private String telefone;
    private Date ultimoAcesso;

    public Docente() {}

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
        
        public String getEmail(){
            return email;
        }
        
        public void setEmail(String email){
            this.email = email;
        }

         
        public String getTelefone(){
            return telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }
        public Date getUltimoAcesso(){
            return ultimoAcesso;
        }
        public void setUltimoAcesso(Date ultimoAcesso){
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
  


}
