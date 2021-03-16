package com.southwind.drinkshop.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.southwind.drinkshop.entity.User1;
import com.southwind.drinkshop.service.CartService;
import com.southwind.drinkshop.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yihong
 * @since 2021-03-10
 */
@Controller
@RequestMapping("/user")
public class User1Controller {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private CartService cartService;

    @PostMapping("/register")
    public String register(User1 user, Model model){
        boolean result = false;
        try {
//            if(user.getGenderCode() == 1){
//                user.setGender(GenderEnum.MAN);
//            }
//            if(user.getGenderCode() == 0){
//                user.setGender(GenderEnum.WOMAN);
//            }
            result = user1Service.save(user);
        } catch (Exception e) {
            model.addAttribute("error",user.getLoginName()+"已存在！请重新输入！");
            return "register";
        }
        if(result) return "login";
        return "register";

    }


    /**
     * 登录
     *
     * @param loginName
     * @param password
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String login(String loginName, String password, HttpSession session) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("login_name", loginName);
        wrapper.eq("password", password);
        User1 user1 = user1Service.getOne(wrapper);
        if (user1 == null) {
            return "login";
        } else {
            session.setAttribute("user", user1);
//            return "redirect:/productCategory/list";
            return "redirect:/productCategory/list";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @GetMapping("/userInfo")
    public ModelAndView userInfo(HttpSession session){
        User1 user = (User1) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userInfo");
        modelAndView.addObject("cartList",cartService.findAllCartVOByUserId(user.getId()));
        return modelAndView;
    }
}


