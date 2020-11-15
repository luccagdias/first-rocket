package com.example.firstrocket.repositories;

import com.example.firstrocket.domain.Mentoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MentoriaRepository extends JpaRepository<Mentoria, Integer> {

}
