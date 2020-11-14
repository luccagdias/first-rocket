package com.example.firstrocket.services;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.repositories.MentoradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentoradoService {

    @Autowired
    MentoradoRepository repo;

    public void insert(Mentorado mentorado) {
        repo.save(mentorado);
    }

    public List<Mentorado> findAll() {
        return repo.findAll();
    }

    public Mentorado fromDTO(MentoradoNewDTO objDto) {
        return new Mentorado(null, objDto.getNomeCompleto(), objDto.getEmail(), objDto.getCpf());
    }
}
