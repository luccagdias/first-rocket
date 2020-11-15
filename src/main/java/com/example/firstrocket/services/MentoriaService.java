package com.example.firstrocket.services;

import com.example.firstrocket.domain.Mentor;
import com.example.firstrocket.domain.Mentoria;
import com.example.firstrocket.dto.MentoriaDTO;
import com.example.firstrocket.repositories.MentoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class MentoriaService {

    @Autowired
    MentoriaRepository repo;

    @Transactional
    public void insert(Mentoria mentoria) {
        repo.save(mentoria);
    }

    public List<Mentoria> findAll() {
        return repo.findAll();
    }

    public Mentoria fromDTO(MentoriaDTO objDto) {
        return new Mentoria(null, objDto.getIdMentor(), objDto.getIdMentorado(), objDto.getDataEHora(), objDto.getLink());
    }
}
