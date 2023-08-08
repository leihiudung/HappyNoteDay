package com.example.happynoteday.mapper;


import com.example.happynoteday.entity.BVTUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BVTUserMapper {

    BVTUserEntity findByUsername(String username);

    BVTUserEntity findById(Long id);

    int updateUserByUsername(String username, BVTUserEntity user);
}
