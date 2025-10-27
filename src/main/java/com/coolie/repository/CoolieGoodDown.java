package com.coolie.repository;

import com.coolie.model.Coolie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoolieGoodDown extends JpaRepository<Coolie, Long> {
}
