package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuessDiceRollController {
    @GetMapping("/roll-dice")
    public String guessDiceRoll() {
        return "roll-dice";
    }
}