package com.rico.ser.controller;

import com.rico.ser.VO.ResultVO;
//import com.rico.ser.dataobject.Userinfo;
import com.rico.ser.utils.ResultVOUtil;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.revwalk.RevCommit;
import org.springframework.web.bind.annotation.*;

import java.io.File;


@RestController
@RequestMapping("/job")
public class JobController {


    @GetMapping("/test")
    public ResultVO detail (){


        gitClone("https://github.com/zhangtao25/rui-web-test", new File("C:\\Users\\zhangtao25\\Desktop\\workspace"));
        return ResultVOUtil.success("sssss");
    }


    public static void gitClone(String remoteUrl, File repoDir) {
        try {
            Git git = Git.cloneRepository()
                    .setURI(remoteUrl)
                    .setDirectory(repoDir)
                    .call();

            System.out.printf("%s", "Cloning from " + remoteUrl + " to " + git.getRepository());
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }
}
