package com.example.happynoteday.mapper;

import com.example.happynoteday.entity.BVTLoginLogEneity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BVTLoginLogMapper {

    List<BVTLoginLogEneity> getLoginLogListByDate(String startDate, String endDate);

    int saveLoginLog(BVTLoginLogEneity log);

    int deleteLoginLogById(Long id);

}
