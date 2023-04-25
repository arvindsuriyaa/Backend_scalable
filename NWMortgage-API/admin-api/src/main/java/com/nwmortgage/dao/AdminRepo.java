package com.nwmortgage.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nwmortgage.model.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>{

}
