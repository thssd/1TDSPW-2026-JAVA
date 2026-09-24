package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ImovelDao;
import br.com.fiap.api.model.Imovel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    private ImovelDao imovelDao;

    public ImovelController(ImovelDao imovelDao) {
        this.imovelDao = imovelDao;
    }

    @PostMapping
    public ResponseEntity<Imovel> cadastrar(@RequestBody Imovel imovel,
                                            UriComponentsBuilder uriComponentsBuilder) throws SQLException {
        imovelDao.cadastrar(imovel);

        URI uri = uriComponentsBuilder.path("/imoveis/{id}")
                .buildAndExpand(imovel.getCodigo())
                .toUri();

        return ResponseEntity.created(uri).body(imovel);
    }

    @GetMapping
    public List<Imovel> listar() {
        return imovelDao.listar();
    }
}
