package lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service.impl;

import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.dao.UserDAO;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.dto.UserDTO;
import lk.ijse.gdse66.Shoe_Shop_Management_SystemBackend.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final Mapping map;

    @Override
    public void save(UserDTO userDTO) throws Exception {
        map.toUserDTO(userDAO.save(map.toUser(userDTO)));
    }

    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                userDAO.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
