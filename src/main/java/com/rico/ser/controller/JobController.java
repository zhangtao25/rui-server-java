package com.rico.ser.controller;

import com.rico.ser.VO.ResultVO;
//import com.rico.ser.dataobject.Userinfo;
import com.rico.ser.test.CommandInfo;
import com.rico.ser.utils.ResultVOUtil;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.revwalk.RevCommit;
import org.springframework.web.bind.annotation.*;

import java.io.File;


@RestController
@RequestMapping("/job")
public class JobController {
    @PostMapping("login")
    public ResultVO login(@RequestBody CommandInfo commandInfo){
        System.out.println(commandInfo.getPwd());
        return  ResultVOUtil.success("sss");
    }
}
