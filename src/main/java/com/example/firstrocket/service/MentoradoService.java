package com.example.firstrocket.service;

import com.example.firstrocket.domain.Mentorado;
import com.example.firstrocket.dto.MentoradoNewDTO;
import com.example.firstrocket.repository.MentoradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentoradoService {

    @Autowired
    MentoradoRepository repo;

    public void insert(Mentorado mentorado) {
        repo.save(mentorado);
    }

    public Mentorado fromDTO(MentoradoNewDTO objDto) {
        return new Mentorado(null, objDto.getNomeCompleto(), objDto.getEmail(), objDto.getCpf());
    }
}
