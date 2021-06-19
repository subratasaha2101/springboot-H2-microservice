package com.example.springbooth2database.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2database.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
