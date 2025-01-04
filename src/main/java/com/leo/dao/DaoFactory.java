package com.leo.dao;


import com.leo.dao.impl.DepartmentDaoJDBC;
import com.leo.dao.impl.SellerDaoJDBC;
import com.leo.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
