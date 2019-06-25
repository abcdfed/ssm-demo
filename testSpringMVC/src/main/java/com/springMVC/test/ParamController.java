package com.springMVC.test;

import com.springMVC.domain.Account;
import com.springMVC.domain.user;
import com.springMVC.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("Param")
@SessionAttributes(value = {"name", "age"}, types = {Integer.class})
public class ParamController {

    @RequestMapping("testParam")
    public String testParam(String userName){
        System.out.println("执行了 userName is "+userName);
        return "success";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);

        return "success";

    }

    @RequestMapping("ListMap")
    public String ListMap(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping("testTime")
    public String testTime(Date date){
        System.out.println(date);

        return "success";
    }


    @RequestMapping("testRequestParam")
    public String testRequestParam(@RequestParam("name") String name,
                                   @RequestParam(value = "age", required = false) String age){

        System.out.println(name);
        System.out.print("##");
        if (age != null) {
            System.out.print(age);
        }else{
            System.out.print("age is empty");
        }
        System.out.print("##");

        return "success";
    }


    @RequestMapping("testRequestBody")
    public String testRequestBody(@RequestBody(required = false)String body){
        System.out.println(body);

        return "success";
    }


    @RequestMapping("testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }


    @RequestMapping("testModelAttribute")
    public String testModelAttribute(user user){
        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }
//
//    @ModelAttribute
//    public user modelAttribute(){
//        System.out.println("modelAttribute执行了");
//        user user = new user();
//        user.setAge(3);
//        user.setSex("asdf");
//        return user;
//    }

    @RequestMapping("testSetSessionAttribute")
    public String testgetSessionAttribute(Model model){
        model.addAttribute("user", "hao");
        model.addAttribute("age", "asdf");
        model.addAttribute("birth", 12);
        return "success";
    }

    @RequestMapping("testGetSessionAttribute")
    public String testsetSessionAttribute(ModelMap model){
        System.out.println(model.get("user")+"   "+model.get("age")+"  "+model.get("birth "));
        return "success";
    }

    @RequestMapping("testdelSessionAttribute")
    public String testdelSessionAttribute(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "success";
    }


    @RequestMapping("testReturnString")
    public String testReturnString(Model model){
        user u = new user();
        u.setAge(12);
        u.setSex("asdf");
        model.addAttribute("user", u);
        return "success";
    }

    @RequestMapping("testReturnVoid")
    public void testReturnVoid(HttpServletRequest request, HttpServletResponse response)throws Exception{
        System.out.println("返回 void");
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
    }

    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        user u = new user();
        u.setAge(1223);
        u.setSex("没没");
        modelAndView.addObject("user", u);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("testForword")
    public String testForword2(){
        System.out.println("到了 testForword");
        return "forward:/WEB-INF/pages/success.jsp";
    }


    @RequestMapping("testAjax")
    public @ResponseBody user testAjax(@RequestBody user user){
        System.out.println(user);
        user.setSex("12");
        user.setAge(12);
        return user;
    }

    @RequestMapping("testException")
    public String testException() throws SysException {
        try {
            int i = 12 / 0;
        }catch(Exception e){
            e.printStackTrace();
            throw new SysException("抛出错误了，自己的错误");
        }
        return "success";
    }

    @RequestMapping("testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor到了");
        return "success";
    }
}
