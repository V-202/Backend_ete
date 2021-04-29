package com.example.BackEnd_ETE.service;

import com.example.BackEnd_ETE.model.User;
import com.example.BackEnd_ETE.reposotiory.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    public userRepository userRepository;

    public boolean adduser(User user)
    {

        if(this.userRepository.existsById(user.getEmail())){
            return false;
        }
        else{
            try {
                this.userRepository.save(user);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
        }

    }
    public List<User> getallusers()
    {
        return (List<User>) this.userRepository.findAll();
    }

    public void deleteuser(String email)
    {
        this.userRepository.deleteById(email);
    }

    public void update(User user)
    {



        if(this.userRepository.existsById(user.getEmail())){
            try {
                this.userRepository.save(user);
            }
            catch (Exception e)
            {
                return;
            }
        }

    }
}
