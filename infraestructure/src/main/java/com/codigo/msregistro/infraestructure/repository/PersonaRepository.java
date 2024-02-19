package com.codigo.msregistro.infraestructure.repository;

import com.codigo.msregistro.infraestructure.entity.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    PersonaEntity findByNumDocu(String dni);
    List<PersonaEntity> findAllByEstado(Integer estado);
}
