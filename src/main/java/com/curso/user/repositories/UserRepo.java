package com.curso.user.repositories;

import com.curso.user.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends CrudRepository<UserModel, UUID> {
}
