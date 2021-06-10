package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GuessDiceRollController {
    private int randomDiceRoll = (int) (Math.random() * (6 - 1 + 1)) + 1;

    @GetMapping("/roll-dice")
    public String guessDiceRoll() {
        randomDiceRoll = (int) (Math.random() * (6 - 1 + 1)) + 1;
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String userGuess(@PathVariable int n, Model model) {
        model.addAttribute("n", n);
        model.addAttribute("randomNum", randomDiceRoll);
        String outcome;

        if (n == randomDiceRoll) {
            outcome = "You won!";
        } else {
            outcome = "You lost!";
        }
        model.addAttribute("outcome", outcome);
        return "roll-dice";
    }
}
