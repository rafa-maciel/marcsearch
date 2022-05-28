package me.bob.com.marcsearch.controller;

import lombok.AllArgsConstructor;
import me.bob.com.marcsearch.model.Marcenaria;
import me.bob.com.marcsearch.repository.MarcenariaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/marcenaria")
public class MarcenariaController {
    private final MarcenariaRepository repository;

    @PostMapping
    public ResponseEntity<Marcenaria> create(@RequestBody Marcenaria marcenaria) {
        Marcenaria marcenariaDB = repository.save(marcenaria);
        return ResponseEntity.ok(marcenariaDB);
    }

    @GetMapping
    public ResponseEntity<List<Marcenaria>> findAllByBairro(@RequestParam String bairro) {
        List<Marcenaria> marcenariaList = repository.findByEnderecoBairro(bairro);
        return ResponseEntity.ok(marcenariaList);
    }

}
