package com.example.firstrocket.resources;

import com.example.firstrocket.domain.Mentor;
import com.example.firstrocket.dto.MentorNewDTO;
import com.example.firstrocket.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/mentores")
public class MentorResource {

    @Autowired
    MentorService service;

    @GetMapping
    public ResponseEntity<List<Mentor>> listarMentores() {
        List<Mentor> mentores = service.findAll();

        return ResponseEntity.ok().body(mentores);
    }

    @PostMapping
    public ResponseEntity<String> cadastrarMentor(@Valid @RequestBody MentorNewDTO mentorObj) {
        Mentor mentor = service.fromDTO(mentorObj);

        service.insert(mentor);

        return new ResponseEntity<>("Mentor inserido com sucesso!", HttpStatus.CREATED);
    }
}
