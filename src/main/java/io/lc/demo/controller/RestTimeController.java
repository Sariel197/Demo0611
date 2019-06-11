package io.lc.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.lc.demo.dao.RestMapper;

import io.lc.demo.po.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping("/rest")
public class RestTimeController {
    @Autowired
    private RestMapper restMapper;

    @RequestMapping("/list")
    public PageInfo<Rest> search(@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,3);
        Page<Rest> page = restMapper.searchAll();
        PageInfo<Rest> restPageInfo = page.toPageInfo();
        return restPageInfo;
    }
    @RequestMapping("/insert")
    public void insert (@RequestParam(required = false) Rest rest){
        restMapper.insert(rest);
    }

    @RequestMapping("/update")
    public void update (@RequestParam(required = false) Rest rest){
        restMapper.updateByPrimaryKeySelective(rest);
    }

    @RequestMapping("/delete")
    public void delete (@RequestParam(required = false) Integer rid){
        restMapper.deleteByPrimaryKey(rid);
    }

    @RequestMapping("/serachOne")
    public void serachOne (@RequestParam(required = false) Integer rid){
        restMapper.selectByPrimaryKey(rid);
    }

}
