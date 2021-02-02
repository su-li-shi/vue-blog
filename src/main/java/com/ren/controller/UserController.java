package com.ren.controller;


import com.ren.common.lang.Result;
import com.ren.entity.User;
import com.ren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ren
 * @since 2021-01-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.success(user);
    }

}
