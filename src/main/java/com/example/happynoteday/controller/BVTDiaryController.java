package com.example.happynoteday.controller;

import com.example.happynoteday.entity.BVTDiaryEntity;
import com.example.happynoteday.service.BVTDiaryService;

import com.example.happynoteday.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diary")
public class BVTDiaryController {

    @Autowired
    BVTDiaryService diaryService;

    @PostMapping("/insertdiary")
    public Result saveDiary(@RequestBody BVTDiaryEntity diary) {
        diaryService.saveDiary(diary);
        return Result.ok("Insert Successful");
    }
    @PostMapping("/insertdiary2")
    public Result saveDiary(@RequestBody String diary) {
        int i =0;
        //diaryService.saveDiary(diary);
        return Result.ok("Insert Successful");
    }

}
