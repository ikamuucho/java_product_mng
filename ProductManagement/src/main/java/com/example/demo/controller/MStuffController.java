package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.MStaffModel;
import com.example.demo.service.MStuffService;

@Controller
public class MStuffController {
	@Autowired
	MStuffService mStuffService;
	@RequestMapping("/index")
	public String getStuff(Model model) {
        model.addAttribute("title", "SQL Serverから取得したデータ");

        List<MStaffModel> stuffDataList = mStuffService.findMStuff();
        model.addAttribute("stuffDataList", stuffDataList);
        return "index";
		
	}
}
