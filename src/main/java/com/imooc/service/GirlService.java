package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.respository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private  GirlService girlService;
    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("F");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("AB");
        girlB.setAge(19);
        girlRepository.save(girlB);

    }

    public void getAge(Integer id) throws Exception{
        Girl girl =girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age<16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public Girl findone(Integer id){
        return girlRepository.findOne(id);
    }

}
