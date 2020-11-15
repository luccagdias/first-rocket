package com.example.firstrocket.repositories;

import com.example.firstrocket.domain.Mentoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MentoriaRepository extends JpaRepository<Mentoria, Integer> {

    @Transactional(readOnly = true)
    Mentoria findByEmail(String email);
}
