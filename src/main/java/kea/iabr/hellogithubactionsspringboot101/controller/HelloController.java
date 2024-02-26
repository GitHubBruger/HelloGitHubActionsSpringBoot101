package kea.iabr.hellogithubactionsspringboot101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "hello")
public class HelloController {

    @RequestMapping("")
    public String index() {
        return "greeting";
    }

}
