package com.service;

import com.model.Role;

public interface IRoleService extends ICrudService<Role>{


    Role findByName(String roleUser);

}
