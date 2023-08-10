package com.example.happynoteday.mapper;

import com.example.happynoteday.entity.BVTDiaryEntity;
import com.example.happynoteday.vo.BVTAbbrDiaryVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BVTDiaryMapper {

    void saveDiary(BVTDiaryEntity diary);

    BVTDiaryEntity getDiaryById(int id);

    BVTAbbrDiaryVO getDiaryAbbrById(int id);
    List<BVTAbbrDiaryVO> getDiaryAbbr();

}
