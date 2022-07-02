package net.idrok.bogcha1.service.dto;

import net.idrok.bogcha1.entity.Role;
import net.idrok.bogcha1.entity.User;

import java.time.LocalDateTime;

public class UserDTO {

    private Long id;
    private String ism;
    private String familiya;
    private String login;
    private Role role;
    private LocalDateTime regVaqt;

    public UserDTO(){}
    public UserDTO(User user){
        this.id = user.getId();
        this.ism = user.getIsm();
        this.familiya = user.getFamiliya();
        this.login = user.getLogin();
        this.regVaqt = user.getRegVaqt();
        this.role = user.getRole();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getRegVaqt() {
        return regVaqt;
    }

    public void setRegVaqt(LocalDateTime regVaqt) {
        this.regVaqt = regVaqt;
    }
}
