package com.round.cycle.fun.controller;

import com.round.cycle.fun.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wutong
 **/
@SuppressWarnings("unused")
@RestController
@Slf4j
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    Result welcome() {
        return Result.buildSuccessResult("欢迎");
    }




}
