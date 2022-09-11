package net.idrok.bogcha1.controller;


import net.idrok.bogcha1.entity.User;
import net.idrok.bogcha1.security.JwtUtil;
import net.idrok.bogcha1.security.Token;
import net.idrok.bogcha1.security.UserMaxsus;
import net.idrok.bogcha1.service.UserService;
import net.idrok.bogcha1.service.dto.UserDTO;
import net.idrok.bogcha1.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/account")
@CrossOrigin(maxAge = 3600)
public class AccountController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/auth")
    public Token auth(@RequestBody UserMaxsus userMaxsus){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userMaxsus.getUsername(), userMaxsus.getPassword()));
        System.out.println();
        User u = userService.getByLogin(userMaxsus.getUsername()).get();
        String token = jwtUtil.generateToken(u.getLogin(), u.getRole().toString());
        return new Token(token);
    }

    @PostMapping("/register")
    public UserDTO register(@RequestBody User user){
        return new UserDTO(userService.create(user));
    }

    @PostMapping("/update")
    public ResponseEntity<UserDTO> updateAccount(@RequestBody User user){
        if(getCurrentuser().getId() == user.getId())
            return ResponseEntity.ok(new UserDTO(userService.update(user)));
        return  ResponseEntity.badRequest().build();
    }

    @GetMapping("/current")
    public UserDTO getCurrentuser(){
        return userService.getCurrentUser();
    }
}
