package com.esprit.Dependency.tpDependencyInjection.dao;

import com.esprit.Dependency.tpDependencyInjection.Entities.matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IToDoDao //hethi classe li bech t'implimenteha repo
{
	public List<String> getCoursesList();
}
