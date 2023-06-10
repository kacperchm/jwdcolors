package com.kacperchm.jwdcolors.dao;

import com.kacperchm.jwdcolors.model.SelectedColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedColorDao extends JpaRepository<SelectedColor, Integer> {
    SelectedColor findFirstByColor(String color);
}
