package com.example.happynoteday.service;

import com.example.happynoteday.entity.BVTLoginLogEneity;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface BVTLoginService {

    List<BVTLoginLogEneity> getLoginLogListByDate(String startDate, String endDate);

    @Async
    void saveLoginLog(BVTLoginLogEneity log);

    void deleteLoginLogById(Long id);
}
