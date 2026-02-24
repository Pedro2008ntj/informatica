package com.example.informatica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example .informatica.model.Pessoa;

public interface pessoarepository extends JpaRepository<Pessoa, Long> {
}
