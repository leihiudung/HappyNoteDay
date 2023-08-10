package com.example.happynoteday.service.impl;

import com.example.happynoteday.entity.BVTLoginLogEneity;
import com.example.happynoteday.mapper.BVTLoginLogMapper;
import com.example.happynoteday.mapper.BVTUserMapper;
import com.example.happynoteday.service.BVTLoginService;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BVTLoginServiceImpl implements BVTLoginService {

//    @Autowired
    BVTLoginLogMapper loginLogMapper;

    @Override
    public List<BVTLoginLogEneity> getLoginLogListByDate(String startDate, String endDate) {
       // return loginLogMapper.getLoginLogListByDate(startDate, endDate);
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveLoginLog(BVTLoginLogEneity log) {
//        String ipSource = IpAddressUtils.getCityInfo(log.getIp());
//        UserAgentDTO userAgentDTO = userAgentUtils.parseOsAndBrowser(log.getUserAgent());
//        log.setIpSource(ipSource);
//        log.setOs(userAgentDTO.getOs());
//        log.setBrowser(userAgentDTO.getBrowser());
//        if (loginLogMapper.saveLoginLog(log) != 1) {
//            throw new PersistenceException("日志添加失败");
//        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteLoginLogById(Long id) {
        if (loginLogMapper.deleteLoginLogById(id) != 1) {
            throw new PersistenceException("删除日志失败");
        }
    }
}
