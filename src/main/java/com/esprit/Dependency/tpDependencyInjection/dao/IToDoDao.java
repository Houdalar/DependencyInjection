package com.esprit.Dependency.tpDependencyInjection.dao;

import com.esprit.Dependency.tpDependencyInjection.Entities.matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IToDoDao  extends JpaRepository<matiere,Long> {
	public List<String> getCoursesList();
}
