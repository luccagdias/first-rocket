package com.example.firstrocket.resources;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.domain.Mentoria;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.dto.MentoriaDTO;
import com.example.firstrocket.services.MentoradoService;
import com.example.firstrocket.services.MentoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/mentorias")
public class MentoriaResource {

    @Autowired
    MentoriaService service;

    @GetMapping
    public ResponseEntity<List<Mentoria>> listarMendorias() {
        List<Mentoria> mentorias = service.findAll();

        return ResponseEntity.ok().body(mentorias);
    }

    @PostMapping
    public ResponseEntity<String> cadastrarMentorias(@Valid @RequestBody MentoriaDTO mentoriaObj) {
        Mentoria mentoria = service.fromDTO(mentoriaObj);

        service.insert(mentoria);

        return new ResponseEntity<>("Mentoria inserida com sucesso!", HttpStatus.CREATED);
    }
}
