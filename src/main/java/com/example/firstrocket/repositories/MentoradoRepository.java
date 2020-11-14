package com.example.firstrocket.repositories;

import com.example.firstrocket.domain.Mentorado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface MentoradoRepository extends JpaRepository<Mentorado, Integer> {

    @Transactional(readOnly = true)
    Mentorado findByEmail(String email);
}
