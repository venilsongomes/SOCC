package Ufg.DFS.Controller;

import Ufg.DFS.Model.Docente;
import Ufg.DFS.Service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping
    public ResponseEntity<List<Docente>> listarTodosDocentes() {
        return ResponseEntity.ok(docenteService.getAllDocentes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> buscarDocentePorId(@PathVariable Integer id) {
        return docenteService.getDocenteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Docente> criarDocente(@RequestBody Docente docente) {
        Docente novoDocente = docenteService.createDocente(docente);
        return ResponseEntity.ok(novoDocente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> atualizarDocente(@PathVariable Integer id, @RequestBody Docente docenteDetails) {
        try {
            Docente atualizado = docenteService.updateDocente(id, docenteDetails);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDocente(@PathVariable Integer id) {
        docenteService.deleteDocente(id);
        return ResponseEntity.noContent().build();
    }
}



/*package Ufg.DFS.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    @GetMapping
    public void listarTodosDocentes() {}

    @GetMapping("/{id}")
    public void buscarDocentePorId(@PathVariable Integer id) {}

    @PostMapping
    public void criarDocente() {}

    @PutMapping("/{id}")
    public void atualizarDocente(@PathVariable Integer id) {}

    @DeleteMapping("/{id}")
    public void deletarDocente(@PathVariable Integer id) {}
}
*/
