package com.example.service;

import com.example.entity.Student;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */

public interface UserService {

    User Sel(int id);

    List<Student> selectAll();

    void downExcel(HttpServletResponse response) throws Exception;
}
