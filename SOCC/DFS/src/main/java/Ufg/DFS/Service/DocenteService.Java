package Ufg.DFS.Service;

import Ufg.DFS.Model.Docente;
import Ufg.DFS.Repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Optional<Docente> getDocenteById(Integer id) {
        return docenteRepository.findById(id);
    }

    public Docente createDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public Docente updateDocente(Integer id, Docente docenteDetails) {
        return docenteRepository.findById(id).map(docente -> {
            docente.setNome(docenteDetails.getNome());
            docente.setEmail(docenteDetails.getEmail());
            docente.setTelefone(docenteDetails.getTelefone());
            docente.setUltimoAcesso(docenteDetails.getUltimoAcesso());
            docente.setAreaConhecimento(docenteDetails.getAreaConhecimento());
            docente.setNucleoConhecimento(docenteDetails.getNucleoConhecimento());
            return docenteRepository.save(docente);
        }).orElseThrow(() -> new RuntimeException("Docente não encontrado com id " + id));
    }

    public void deleteDocente(Integer id) {
        docenteRepository.deleteById(id);
    }
}