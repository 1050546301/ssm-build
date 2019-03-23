package com.huawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huawei.model.Persion;
import com.huawei.service.IPersionService;

@Controller
@RequestMapping("/personController")
public class PersionController {
	@Autowired
    private IPersionService persionService;
    
    @RequestMapping("/showPerson")
    public String showPersons(Model model){
        List<Persion> persons = persionService.loadPersons();
        model.addAttribute("persons", persons);
        return "showperson";
    }
}
