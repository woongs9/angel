package com.toilet.urgent.controller;
import com.toilet.urgent.entity.Toilet;
import com.toilet.urgent.service.ToiletService;
import com.toilet.urgent.service.ToiletServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.tags.Param;

import java.lang.reflect.Array;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class MainController {
    private final ToiletService toiletService;
    @GetMapping({"/main"})
    public String main(Toilet toilet, Model model,  @RequestParam(required = false) String lat,
                       @RequestParam(required = false) String lon){
        List<Toilet> toiletList = toiletService.listToilet(toilet);
        System.out.println(lon);
        System.out.println(lat);
        System.out.println("---");
        model.addAttribute("list", toiletList);
        return "main";
    }

    @GetMapping({"/test"})
    public String test(Toilet toilet, Model model){
        List<Toilet> toiletList = toiletService.listToilet(toilet);
        model.addAttribute("list", toiletList);
        return "test";
    }
}
