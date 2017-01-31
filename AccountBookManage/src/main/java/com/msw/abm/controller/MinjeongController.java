package com.msw.abm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MinjeongController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 내정보 화면
	 * @return
	 */
	@RequestMapping("deposit/depositList.do")
	public ModelAndView myInfo() {
		ModelAndView mv = new ModelAndView("deposit/depositList");
		mv.addObject("active_menu", "deposit");

		return mv;
	}
	
	@RequestMapping("deposit/depositDetail.do")
	public ModelAndView myInfo1() {
		ModelAndView mv = new ModelAndView("deposit/depositDetail");
		mv.addObject("active_menu", "deposit");

		return mv;
	}
	
	@RequestMapping("deposit/depositInput.do")
	public ModelAndView myInfo2() {
		ModelAndView mv = new ModelAndView("deposit/depositInput");
		mv.addObject("active_menu", "deposit");

		return mv;
	}
	
	@RequestMapping("withdraw/withdawMannageList.do")
	public ModelAndView myInfo3() {
		ModelAndView mv = new ModelAndView("withdraw/withdawMannageList");
		mv.addObject("active_menu", "withdraw");

		return mv;
	}
	
	@RequestMapping("withdraw/withdrawApplyList.do")
	public ModelAndView myInfo4() {
		ModelAndView mv = new ModelAndView("withdraw/withdrawApplyList");
		mv.addObject("active_menu", "withdraw");

		return mv;
	}
	
	@RequestMapping("withdraw/withdrawApplyDetail.do")
	public ModelAndView myInfo5() {
		ModelAndView mv = new ModelAndView("withdraw/withdrawApplyDetail");
		mv.addObject("active_menu", "withdraw");

		return mv;
	}
	
	
	
}
