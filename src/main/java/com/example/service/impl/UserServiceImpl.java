package com.example.service.impl;

import com.example.entity.Student;
import com.example.entity.Test;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.util.PoiUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }

    @Override
    public List<Student> selectAll() {
        List<Map> maps = userMapper.selectAll();
        List<Student> students=new ArrayList<>();
        for (Map map : maps) {
            Student student=new Student();
            Map<String,Class> fields= fsEntity(student.getClass());
            Set set = fields.keySet();
            set.forEach(s->{
                String method="set"+s.toString().substring(0, 1).toUpperCase() + s.toString().substring(1);
                setValue(student,student.getClass(),method,map.get(s),fields.get(s));
            });
            students.add(student);
        }
        return students;
    }

    @Override
    public void downExcel(HttpServletResponse response) throws Exception{
        String[] columnNames=new String[]{"aa","bb","cc","dd"};//实体类对应列字段
        String[] keyList=new String[]{"aaa","bbb","ccc","ddd"};//excel对用列字段
        List objList=new ArrayList();
        Test test=new Test();
        test.setAa("111");
        test.setBb("222");
        test.setCc("333");
        test.setDd("444");
        Collections.addAll(objList,test,test,test);
        String path="E:\\java练习\\springbootTest\\springBoot_Mybatis-master\\Springboot_Mybatis\\src\\main\\resources\\ninemax";
        String fileName="aaa.xlsx";
        //OutputStream out = response.getOutputStream();
        PoiUtil.downLoadExcel(columnNames,keyList,objList,path,fileName,response);
    }




    public Map fsEntity(Class<? extends Object> aClass){
        Field[] declaredFields = aClass.getDeclaredFields();
        Map mapClass=new HashMap();
        mapClass.put("String",String.class);
        mapClass.put("Integer",Integer.class);
        mapClass.put("Double",Double.class);
        Map map=new HashMap();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);//暴力反射
            String[] split = declaredField.getType().toString().split("\\.");
            String s = split[split.length - 1];
            map.put(declaredField.getName(),mapClass.get(s));
        }
        return map;
    }

    public void setValue(Student student,Class<? extends Object> aclass,String method,Object value,Class lex){
        try {
            Method declaredMethod = aclass.getDeclaredMethod(method,lex);
            declaredMethod.invoke(student,value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
