package Ufg.DFS.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ManifestacaoIntencao {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Integer id; // Id será gerado automaticamente pelo banco de dados
      
      @OneToOne
      private Docente docente;

      @OneToOne
      private NucleoConhecimento nucleoConhecimento;
      
      private Date dataManifestacaoIntencao;
      private Date dataIngresso;

      @OneToOne
      private Status status;

        public ManifestacaoIntencao(NucleoConhecimento nucleoConhecimento, Date dataManifestacaoIntencao, Date dataIngresso, Status status) {
            this.nucleoConhecimento = nucleoConhecimento;
            this.dataManifestacaoIntencao = dataManifestacaoIntencao;
            this.dataIngresso = dataIngresso;
            this.status = status;
            
        }
        public Date getDataManifestacaoIntencao() {
            return dataManifestacaoIntencao;
        }
        public void setDataManifestacaoIntencao(Date dataManifestacaoIntencao) {
            this.dataManifestacaoIntencao = dataManifestacaoIntencao;
        }
        public Date getDataIngresso() {
            return dataIngresso;
        }
        public void setDataIngresso(Date dataIngresso) {
            this.dataIngresso = dataIngresso;
        }
        public NucleoConhecimento getNucleoConhecimento() {
            return nucleoConhecimento;
        }
        public void setNucleoConhecimento(NucleoConhecimento nucleoConhecimento) {
            this.nucleoConhecimento = nucleoConhecimento;
        }
        public Status getStatus() {
            return status;
        }
        public void setStatus(Status status) {
            this.status = status;
        }

}
