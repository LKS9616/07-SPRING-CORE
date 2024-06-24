package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void associationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> employeeList = mapper.associationTest();

        for(EmployeeAndDeptDTO employee : employeeList) {
            System.out.println(employee);
        }
        sqlSession.close();
    }

    public void collectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> departmentList = mapper.collectionTest();

        for(DeptAndEmployeeDTO department : departmentList) {
            System.out.println(department);
        }

        sqlSession.close();
    }
}
