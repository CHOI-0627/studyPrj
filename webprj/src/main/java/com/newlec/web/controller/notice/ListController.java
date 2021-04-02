package com.newlec.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlec.web.entity.Notice;
import com.newlec.web.service.NoticeService;


public class ListController implements Controller{
	
	@Autowired
	private NoticeService noticeService;
	//아래의 set 없어도됨  annotation사용
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	/* 아래의 코딩은 *.xml 에서 DI 하는 것 , 위에서  Annotation 으로 
	 * public void setNoticeService(NoticeService noticeService) {
	 * this.noticeService = noticeService; }
	 */

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		
		ModelAndView mv = new ModelAndView("notice.list");
		//mv.setViewName("/WEB-INF/view/notice/list.jsp");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		
		return mv;
	}

}
