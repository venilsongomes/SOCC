package Ufg.DFS.Controller;
import Ufg.DFS.Model.Docente;
import Ufg.DFS.Service.DocentesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

   
    private final DocentesService docenteService;

    public DocenteController(DocentesService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping
    public List <Docente> listarTodosDocentes() {
        return docenteService.getAllDocentes();
    }

    @PostMapping
    public Docente PostDocente(@RequestBody Docente docente){
        return docenteService.createDocente(docente);
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
