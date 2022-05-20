package com.sau.swe212_project3.Security;

import com.sau.swe212_project3.Model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        Optional<UserEntity> user = userRepo.findByUserName(username);
        user.orElseThrow(() ->new UsernameNotFoundException(username +" not found"));

        return user.map(MyUserDetails::new).get();
    }

}
