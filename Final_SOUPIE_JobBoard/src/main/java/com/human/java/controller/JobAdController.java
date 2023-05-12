package com.human.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.java.domain.JobAdVO;
import com.human.java.service.JobAdService;

@Controller
@RequestMapping("/JobAd")
public class JobAdController {
	
//	//call vo
//	JobAdVO vo = new JobAdVO();
//	
//	@Autowired
//	private JobAdService jobAdService;
	
	//단순 이동일 경우 -> mapping을 하나로 합치기 -> 로직 없이 단순히 화면 변경을 담당하는 mapping method
	@RequestMapping("/{url}.do")
	public String viewPage(@PathVariable String url) {
		System.out.println("## Move to: "+url+" ##");
		return "/JobAd/"+url;
	}
	
	//구직공고 입력 (insert)
	//단순 이동 -> 페이지 전환 기능만 존재하기 때문에 url mapping을 통해 진행될 수 있도록 함. -> 굳이 매핑하지 않아도 됨
	
	//공고 리스트 -> job main page
	
	//

}
