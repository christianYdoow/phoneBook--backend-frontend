package com.EPhoneBookMo.phoneBook.repository;

import com.EPhoneBookMo.phoneBook.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< UserEntity,Long> {

}
