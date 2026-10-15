package br.com.fiap.api.controller;

import br.com.fiap.api.dao.ImovelDao;
import br.com.fiap.api.dao.TipoImovelDao;
import br.com.fiap.api.dto.ImovelResponseDto;
import br.com.fiap.api.dto.TipoImovelRequestDto;
import br.com.fiap.api.dto.TipoImovelResponseDto;
import br.com.fiap.api.model.Imovel;
import br.com.fiap.api.model.TipoImovel;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/tipo-imovel")
public class TipoImovelController {

    private TipoImovelDao dao;

    private ImovelDao imovelDao;

    private ModelMapper modelMapper;

    public TipoImovelController(TipoImovelDao dao, ImovelDao imovelDao, ModelMapper modelMapper) {
        this.dao = dao;
        this.imovelDao = imovelDao;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<TipoImovelResponseDto> cadastrar(@RequestBody TipoImovelRequestDto tipoImovelRequestDto,
                                                           UriComponentsBuilder builder) throws SQLException {
        TipoImovel tipoImovel = modelMapper.map(tipoImovelRequestDto, TipoImovel.class);
        dao.cadastrar(tipoImovel);
        URI uri = builder.path("/tipo-imovel/{id}").buildAndExpand(tipoImovelRequestDto.getCodigo()).toUri();

        return ResponseEntity.created(uri).body(modelMapper.map(tipoImovelRequestDto, TipoImovelResponseDto.class));
    }

    @GetMapping("/{id}")
    public List<TipoImovelResponseDto> buscarPorTipo(@PathVariable int id) throws SQLException {
        return imovelDao.buscarPorTipo(id).stream()
                .map(t -> modelMapper.map(t, TipoImovelResponseDto.class))
                .toList();
    }

    @GetMapping
    public List<TipoImovelResponseDto> listar() throws SQLException {
        return dao.listar().stream()
                .map(t -> modelMapper.map(t, TipoImovelResponseDto.class))
                .toList();
    }
}
