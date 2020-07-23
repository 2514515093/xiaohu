package com.pinyougou.service.impl;

import com.pinyougou.mapper.TbAddressMapper;
import com.pinyougou.pojo.TbAddress;
import com.pinyougou.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private TbAddressMapper addressMapper;
    @Override
    public TbAddress findById(long id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public void save(TbAddress address) {
        addressMapper.insert(address);
    }

    @Override
    public void update(TbAddress address) {
        addressMapper.updateByPrimaryKey(address);
    }

    @Override
    public void delete(Long id) {
        addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TbAddress> findAll() {
       return addressMapper.selectByExample(null);

    }
}
