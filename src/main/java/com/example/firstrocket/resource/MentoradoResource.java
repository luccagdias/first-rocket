package com.example.firstrocket.resource;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.service.MentoradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/mentorado")
public class MentoradoResource {

    @Autowired
    MentoradoService service;

    @PostMapping
    public ResponseEntity<String> cadastrarMentorado(@Valid @RequestBody MentoradoNewDTO mentoradoObj) {
        Mentorado mentorado = service.fromDTO(mentoradoObj);

        service.insert(mentorado);

        return new ResponseEntity<>("Mentorado inserido com sucesso!", HttpStatus.CREATED);
    }
}
