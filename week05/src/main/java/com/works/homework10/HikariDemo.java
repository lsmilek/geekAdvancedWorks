package com.works.homework10;

import com.works.homework10.mapper.TProviderTransMapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HikariDemo {
    @Autowired
    private TProviderTransMapMapper tProviderTransMapMapper;


    public void insert(){
        TProviderTransMap tProviderTransMap = new TProviderTransMap();
        tProviderTransMap.setMerorderno("987654");
        tProviderTransMap.setTrace("987654");
        tProviderTransMapMapper.insert(tProviderTransMap);
        System.out.println("insert sucess!");


    }

}
