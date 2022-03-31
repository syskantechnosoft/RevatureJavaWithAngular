package com.springboot.thymeleaf.crud.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.thymeleaf.crud.domain.entities.UserInfo;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    List<UserInfo> findAllByActiveOrderByIdDesc(boolean active);

    Optional<UserInfo> findByIdAndActive(Integer id, boolean active);

}
