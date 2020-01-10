package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sp.entity.Temperature;

public interface DataRepository extends JpaRepository<Temperature, String> {

}
