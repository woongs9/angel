package com.toilet.urgent.controller;
import com.toilet.urgent.entity.Toilet;
import com.toilet.urgent.service.ToiletServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class MainController {
    @GetMapping({"/main"})
    public String main(Toilet toilet){

        return "main";
    }
}
