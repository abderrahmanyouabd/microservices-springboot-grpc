package com.a1st.authservice.service;

import com.a1st.authservice.model.User;
import com.a1st.authservice.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  
  public Optional<User> findByEmail(String email) {
    return userRepository.findByEmail(email);
  }
}
