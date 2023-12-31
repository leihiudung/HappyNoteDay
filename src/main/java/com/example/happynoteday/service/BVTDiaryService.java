package com.example.happynoteday.service;

import com.example.happynoteday.entity.BVTDiaryEntity;
import com.example.happynoteday.vo.BVTAbbrDiaryVO;

import java.util.List;

public interface BVTDiaryService {

    void saveDiary(BVTDiaryEntity diary);

    BVTDiaryEntity getDiaryById(int id);

    BVTAbbrDiaryVO getDiaryAbbrById(int id);
    List<BVTAbbrDiaryVO> getDiaryAbbr();


}
