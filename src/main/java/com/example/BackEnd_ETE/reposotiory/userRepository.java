package com.example.BackEnd_ETE.reposotiory;
import com.example.BackEnd_ETE.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepository extends JpaRepository<User,String> {

}