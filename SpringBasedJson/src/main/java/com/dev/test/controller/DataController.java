package com.dev.test.controller;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.test.repository.DataRepository;
import com.dev.test.vo.DataVO;

@Controller
@Slf4j
public class DataController {
	@Autowired
	private DataRepository dataRepository;

	@RequestMapping("/test2")
	@ResponseBody
	public String test() {
		return "test";
	}

	@RequestMapping("/test222")
	@ResponseBody
	public DataVO test2(@RequestParam(required = false) String test) {
		log.info("Here");
		System.out.println("come in");

		return dataRepository.test(test);
	}
}
