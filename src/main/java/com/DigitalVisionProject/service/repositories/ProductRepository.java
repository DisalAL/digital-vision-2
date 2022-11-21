package com.DigitalVisionProject.service.repositories;

import com.DigitalVisionProject.service.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product,Long> {


}
