package me.bob.com.marcsearch.repository;

import me.bob.com.marcsearch.model.Marcenaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcenariaRepository extends JpaRepository<Marcenaria, Long> {
    List<Marcenaria> findByEnderecoBairro(String bairro);
}
