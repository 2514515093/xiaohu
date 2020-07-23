package com.pinyougou.web;

import com.pinyougou.pojo.TbAddress;
import com.pinyougou.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/findById")
    public TbAddress findById(Integer id){
        return addressService.findById(id);

    }
    @RequestMapping("/findAll")
    public List<TbAddress> findAll(){
        return addressService.findAll();

    }
}
