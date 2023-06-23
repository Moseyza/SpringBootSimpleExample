package com.example.injection.dao;

import com.example.injection.models.RepositoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DatabaseCrudRepository extends CrudRepository<RepositoryModel, Integer> {
    //@Query("SELECT r.* FROM repository r WHERE r.name =: name")
    public RepositoryModel findByName(@Param("name") String name);

    public RepositoryModel findByRepositoryid(Integer repositoryid);

}
