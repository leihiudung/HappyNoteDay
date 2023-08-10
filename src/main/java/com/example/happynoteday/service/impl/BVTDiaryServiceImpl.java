package com.example.happynoteday.service.impl;

import com.example.happynoteday.entity.BVTDiaryEntity;
import com.example.happynoteday.mapper.BVTDiaryMapper;
import com.example.happynoteday.service.BVTDiaryService;
import com.example.happynoteday.vo.BVTAbbrDiaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BVTDiaryServiceImpl implements BVTDiaryService {

    @Autowired
    BVTDiaryMapper diaryMapper;

    @Override
    public void saveDiary(BVTDiaryEntity diary) {
        diaryMapper.saveDiary(diary);
    }

    @Override
    public BVTDiaryEntity getDiaryById(int id) {
        BVTDiaryEntity diary = diaryMapper.getDiaryById(id);
        return diary;
    }

    @Override
    public BVTAbbrDiaryVO getDiaryAbbrById(int id) {
        BVTAbbrDiaryVO abbrDiary = diaryMapper.getDiaryAbbrById(id);
        return abbrDiary;
    }

    @Override
    public List<BVTAbbrDiaryVO> getDiaryAbbr() {
        List<BVTAbbrDiaryVO> abbrDiaryList = diaryMapper.getDiaryAbbr();
        return abbrDiaryList;
    }
}
