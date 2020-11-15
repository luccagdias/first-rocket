package com.example.firstrocket.resources;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoDTO;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.services.MentoradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/mentorado")
public class MentoradoResource {

    @Autowired
    MentoradoService service;

    @GetMapping
    public ResponseEntity<List<MentoradoDTO>> listarMendorados() {
        List<Mentorado> mentorados = service.findAll();

        List<MentoradoDTO> mentoradoDTOs = mentorados.stream().map(obj -> new MentoradoDTO(obj).collect(Collectors.toList()));

        return ResponseEntity.ok().body(mentoradoDTOs);
    }

    @PostMapping
    public ResponseEntity<String> cadastrarMentorado(@Valid @RequestBody MentoradoNewDTO mentoradoObj) {
        Mentorado mentorado = service.fromDTO(mentoradoObj);

        service.insert(mentorado);

        return new ResponseEntity<>("Mentorado inserido com sucesso!", HttpStatus.CREATED);
    }
}
