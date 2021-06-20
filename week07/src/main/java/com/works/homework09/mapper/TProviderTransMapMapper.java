package com.works.homework09.mapper;

import com.works.homework09.entity.TProviderTransMap;
import org.springframework.stereotype.Repository;

@Repository
public interface TProviderTransMapMapper {
    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String merorderno);

    /**
     *
     * @mbg.generated
     */
    int insert(TProviderTransMap record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TProviderTransMap record);

    /**
     *
     * @mbg.generated
     */
    TProviderTransMap selectByPrimaryKey(String merorderno);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TProviderTransMap record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TProviderTransMap record);
}