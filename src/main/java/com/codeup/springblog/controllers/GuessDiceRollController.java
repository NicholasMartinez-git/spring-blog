package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GuessDiceRollController {

    @GetMapping("/roll-dice")
    public String guessDiceRoll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String userGuess(@PathVariable int n, Model model) {
        int randomDiceRoll = (int) (Math.random() * (6 - 1 + 1)) + 1;
        String outcome;
        model.addAttribute("n", n);
        model.addAttribute("randomNum", randomDiceRoll);

        if (n == randomDiceRoll) {
            outcome = "You won!";
        } else {
            outcome = "You lost!";
        }
        model.addAttribute("outcome", outcome);
        return "roll-dice";
    }
}
