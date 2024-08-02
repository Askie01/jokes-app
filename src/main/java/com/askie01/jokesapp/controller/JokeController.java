package com.askie01.jokesapp.controller;

import com.askie01.jokesapp.service.JokeService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Controller
@RequestMapping("/")
public class JokeController {

    private final JokeService jokeService;

    @GetMapping("showJoke")
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
