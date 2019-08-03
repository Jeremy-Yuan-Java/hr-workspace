package com.hrbc.business;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.Majors;
import com.hrbc.business.domain.MajorsExample;
import com.hrbc.business.mapper.MajorsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan({"com.hrbc.business.mapper"})
public class BusinessApplicationTests {
    @Autowired
    private MajorsMapper mapper;

    @Test
    public void contextLoads() {


    }

}
