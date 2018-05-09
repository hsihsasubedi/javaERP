package com.SpringDemo.repository;

import com.SpringDemo.model.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRipository extends JpaRepository<ImageData, Long> {
}
