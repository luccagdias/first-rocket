package com.example.firstrocket.repositories;

import com.example.firstrocket.domain.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MentorRepository extends JpaRepository<Mentor, Integer> {

    @Transactional(readOnly = true)
    Mentor findByEmail(String email);
}
