package com.lk.demo.Repo;

import com.lk.demo.models.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
