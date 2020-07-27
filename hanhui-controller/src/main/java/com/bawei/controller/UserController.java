package com.bawei.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.bean.Meeting;
import com.bawei.bean.Type;
import com.bawei.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("meeting_list")
	public String selAll(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		int pageSize=2;
		PageHelper.startPage(pageNum, pageSize);
		List<Meeting> list = userService.selAll();
		PageInfo<Meeting> info = new PageInfo<Meeting>(list);
		model.addAttribute("list", info);
		return "meeting_list";
	}
	
	@RequestMapping("addMeeting")
	public String add(Meeting meeting){
		try {
			userService.addMeeting(meeting);
			return "redirect:meeting_list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "add";
		}
	}
	
	@RequestMapping("selM")
	public String selM(Integer mid,Model model){
		Meeting meeting = userService.selM(mid);
		model.addAttribute("meet", meeting);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(Meeting meeting,Model model) {
		try {
			userService.update(meeting);
			return "redirect:meeting_list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "update";
		}
	}
	
	@RequestMapping("selType")
	@ResponseBody
	public List<Type> selType(){
		List<Type> list = userService.selType();
		return list;
	}

}
