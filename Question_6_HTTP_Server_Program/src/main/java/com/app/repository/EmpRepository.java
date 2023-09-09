package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, String>{

	@Query("SELECT t FROM Emp t WHERE t.name LIKE %:value%")
	List<Emp> findByNameContaining(@Param("value") String value);

}
