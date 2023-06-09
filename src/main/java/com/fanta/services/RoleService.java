package com.fanta.services;

import com.fanta.dao.RoleDao;
import com.fanta.entity.RoleEntity;
import com.fanta.factory.RoleDaoFactory;

import java.util.List;

public final class RoleService {
    private static RoleService roleService = new RoleService();
    public static final RoleDao roleDao = RoleDaoFactory.createRoleDao();

    private RoleService(){}

    public static RoleService getInstance() {
        return roleService;
    }

    public void addNewRole(RoleEntity roleEntity) {
        roleDao.getInstance().saveNewEntity(roleEntity);
    }

    public void updateRoleById(int id, RoleEntity roleEntity){
        roleDao.getInstance().updateEntityById(id, roleEntity);
    }

    public void deleteRoleById(int id){
        roleDao.getInstance().deleteEntity(id);
    }

    public RoleEntity getRoleById(int id){
        return roleDao.getInstance().findById(id);
    }

    public List<RoleEntity> getAllRoles(){
        return roleDao.getInstance().findAll();
    }
}
