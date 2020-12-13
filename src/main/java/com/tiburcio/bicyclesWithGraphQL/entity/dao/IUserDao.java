package com.tiburcio.bicyclesWithGraphQL.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.bicyclesWithGraphQL.entity.models.UserDao;

public interface IUserDao extends CrudRepository<UserDao, Long> {
	UserDao findByUsername(String username);
}
