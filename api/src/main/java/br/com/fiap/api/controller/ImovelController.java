package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ImovelDao;
import br.com.fiap.api.dto.ImovelRequestDto;
import br.com.fiap.api.dto.ImovelResponseDto;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
import br.com.fiap.api.model.Imovel;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("imoveis")
public class ImovelController {

    private ImovelDao dao;

    private ModelMapper modelMapper;

    public ImovelController(ImovelDao dao, ModelMapper modelMapper){
        this.dao = dao;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<ImovelResponseDto> cadastrar(@RequestBody ImovelRequestDto imovelRequestDto,
                                                       UriComponentsBuilder builder) throws SQLException {
        Imovel imovel = modelMapper.map(imovelRequestDto, Imovel.class);
        dao.cadastrar(imovel);

        URI uri = builder.path("/imoveis/{id}")
                .buildAndExpand(imovel.getCodigo()).toUri();

        return ResponseEntity.created(uri).body(modelMapper.map(imovel, ImovelResponseDto.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImovelResponseDto> buscar(@PathVariable int id) throws EntidadeNaoEncontradaException, SQLException {
        Imovel imovel = dao.pesquisarPorId(id);

        return ResponseEntity.ok(modelMapper.map(imovel, ImovelResponseDto.class));
    }

    @GetMapping
    public List<ImovelResponseDto> listar() throws SQLException {
        return dao.listar().stream()
                .map(i -> modelMapper.map(i, ImovelResponseDto.class))
                .toList();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable int id, @RequestBody ImovelResponseDto imovelResponseDto) throws EntidadeNaoEncontradaException, SQLException {
        Imovel imovel = modelMapper.map(imovelResponseDto, Imovel.class);

        imovel.setCodigo(id);
        dao.atualizar(imovel);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) throws SQLException {
        dao.deletar(id);

        return ResponseEntity.noContent().build();
    }
}