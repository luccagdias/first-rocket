package com.example.firstrocket.resources;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.services.MentoradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/mentorado")
public class MentoradoResource {

    @Autowired
    MentoradoService service;

    @GetMapping
    public ResponseEntity<List<Mentorado>> listarMendorados() {
        List<Mentorado> mentorados = service.findAll();

        return ResponseEntity.ok().body(mentorados);
    }

    @PostMapping
    public ResponseEntity<String> cadastrarMentorado(@Valid @RequestBody MentoradoNewDTO mentoradoObj) {
        Mentorado mentorado = service.fromDTO(mentoradoObj);

        mentorado = service.insert(mentorado);

        return new ResponseEntity<>("Mentorado inserido com sucesso!", HttpStatus.CREATED);
    }
}
