package net.idrok.bogcha1.service;

import net.idrok.bogcha1.entity.User;
import net.idrok.bogcha1.service.dto.UserDTO;

import java.util.Optional;

public interface UserService extends CommonService<User> {
    Optional<User> getByLogin(String login);

    UserDTO getCurrentUser();
}
