package com.zhg.javakc.modules.test.controller;


import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Mr.Wang
 * @Date 2019/09/27
 * @Version 1.0
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("queryTest")
    public ModelAndView queryTest(TestEntity testEntity, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView("test/list");
        // 查询数据库 先调用service
        modelAndView.addObject("page",testService.queryTest(new Page<>(request,response),testEntity));
        return modelAndView;
    }

    @RequestMapping("create")
    public String create (TestEntity testEntity){
        //设置主键ID UUID生成 32位
        testEntity.setTestId(CommonUtil.uuid());
        //调用逻辑层save方法写入数据
        testService.save(testEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("view")
    public String view(String ids, ModelMap map){
        //调用service中的get方法取得对应ID的信息
        map.put("testEntity",testService.get(ids));
        return "test/update";
    }

    @RequestMapping("update")
    public String update(TestEntity testEntity){
        testService.update(testEntity);
        return "redirect:queryTest.do";
    }

    @RequestMapping("delete")
    public String delete(String [] ids){
        testService.delete(ids);
        return "redirect:queryTest.do";
    }
}
