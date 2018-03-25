package com.time.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.time.entities.DRH;
import com.time.entities.Formateur;

public interface FormateurRrepository extends JpaRepository<Formateur, Integer> {

}
