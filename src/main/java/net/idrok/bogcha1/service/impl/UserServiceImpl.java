package net.idrok.bogcha1.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import net.idrok.bogcha1.entity.Role;
import net.idrok.bogcha1.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.User;
import net.idrok.bogcha1.repository.UserRepository;
import net.idrok.bogcha1.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;

    @Override
    public Page<User> getAll(String key, Pageable pageable) {
        // TODO Auto-generated method stub
        return userRepository.findAll(pageable);
    }

    @Override
    public User getById(Long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).get();
    }

    @Override
    public User create(User entity) {
        // TODO Auto-generated method stub
        if(entity.getId() == null){
            entity.setRole(Role.USER);
            entity.setRegVaqt(LocalDateTime.now());
            entity.setOxirgiTashrif(LocalDateTime.now());
            entity.setAktiv(true);
            entity.setParol(encoder.encode(entity.getParol()));
            return userRepository.save(entity);
        }
        throw new RuntimeException("id null bo'lsihi shart");
    }

    @Override
    public User update(User entity) {
        // TODO Auto-generated method stub
        return userRepository.save(entity);
    }

    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub
        userRepository.delete(entity);
        
    }

    @Override
    public void deleteById(Long dataId) {
        // TODO Auto-generated method stub
        userRepository.deleteById(dataId);
        
    }

    @Override
    public Optional<User> getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public UserDTO getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal().getClass() + "something");
        if(auth.getPrincipal() instanceof UserDetails){
            UserDetails userDetails = (UserDetails) auth.getPrincipal();
            User u = userRepository.findByLogin(userDetails.getUsername()).orElseThrow(()->  new RuntimeException("not found"));
            return new UserDTO(u);
        }
        throw new RuntimeException("not found");
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }
}
