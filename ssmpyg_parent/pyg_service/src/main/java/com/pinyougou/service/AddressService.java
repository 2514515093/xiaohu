package com.pinyougou.service;

import com.pinyougou.pojo.TbAddress;

import java.util.List;

public interface AddressService {

    TbAddress findById(long id);

    void save(TbAddress address);

    void update(TbAddress address);

    void delete(Long id);

    List<TbAddress> findAll();
}
