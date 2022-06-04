package com.lk.demo.Repo;

import com.lk.demo.models.Teachers;
import org.springframework.data.repository.CrudRepository;

public interface TeachersRepository extends CrudRepository<Teachers, Long> {

}
