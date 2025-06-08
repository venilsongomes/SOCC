package Ufg.DFS.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Ufg.DFS.Model.ManifestacaoIntencao;
import Ufg.DFS.Service.ManifestacaoIntecaoService;


@RestController
@RequestMapping("/manifestacao")
public class ManifestacaoIntencaoController{
    @Autowired
    private final ManifestacaoIntecaoService service;

    public ManifestacaoIntencaoController (ManifestacaoIntecaoService service){
        this.service = service;
    }

    @GetMapping
    public List<ManifestacaoIntencao> getIntencaos() {
        return service.getIntencaos();
    }

    @PostMapping
    public ManifestacaoIntencao postIntecoes(@RequestBody ManifestacaoIntencao manifestacao) {
        
        return service.saveIntecoes(manifestacao);
    }
}
    

