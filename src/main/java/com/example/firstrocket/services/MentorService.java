package com.example.firstrocket.services;

import com.example.firstrocket.domain.Mentor;
import com.example.firstrocket.dto.MentorNewDTO;
import com.example.firstrocket.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class MentorService {

    @Autowired
    MentorRepository repo;

    @Transactional
    public void insert(Mentor mentor) {
        repo.save(mentor);
    }

    public List<Mentor> findAll() {
        return repo.findAll();
    }

    public Mentor fromDTO(MentorNewDTO objDto) {
        return new Mentor(null, objDto.getNomeCompleto(), objDto.getSobre(), objDto.getEmail(), objDto.getCpf(), objDto.getHorarios());
    }
}
