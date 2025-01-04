package com.leo.services;

import com.leo.dao.DaoFactory;
import com.leo.dao.DepartmentDao;
import com.leo.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
