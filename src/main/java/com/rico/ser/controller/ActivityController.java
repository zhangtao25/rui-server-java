package com.rico.ser.controller;

import com.rico.ser.VO.ResultVO;
import com.rico.ser.service.ActivityService;
import com.rico.ser.test.CommandInfo;
import com.rico.ser.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping("/test")
    public ResultVO test(){

        return  ResultVOUtil.success(activityService.findAll());
    }
}
