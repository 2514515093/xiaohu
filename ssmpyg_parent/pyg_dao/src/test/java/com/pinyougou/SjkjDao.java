package com.pinyougou;

import com.pinyougou.mapper.TbAddressMapper;
import com.pinyougou.pojo.TbAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class SjkjDao {

    @Autowired
    private TbAddressMapper addressMapper;

    @Test
    public void aaa(){
        TbAddress tbAddress = addressMapper.selectByPrimaryKey(60l);
        System.out.println(tbAddress.getId());

    }
}
