package com.github.scompo.planner.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.github.scompo.planner.domain.User;

public interface UserRepository extends PagingAndSortingRepository<User, String>{

}
