package com.esprit.Dependency.tpDependencyInjection.Entities;


import javax.persistence.*;

@Entity
@Table
public class matiere
{
    @Id //specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;



}
