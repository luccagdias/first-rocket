package com.example.firstrocket.repositories;

import com.example.firstrocket.domain.Mentorado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentoradoRepository extends JpaRepository<Mentorado, Integer> {
}
