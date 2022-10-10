package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {

    @GetMapping("/")
    public ModelAndView getLekce() {
        ModelAndView result = new ModelAndView("/lekce/index");
        return result;
    }
}
