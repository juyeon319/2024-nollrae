package kr.ac.nollrae.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.nollrae.board.service.NoticeService;
import kr.ac.nollrae.board.vo.NoticeVO;

@Controller
@RequestMapping("/guest")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("/noticeList")
	public String noticeList(NoticeVO vo, Model model, HttpServletRequest request) {
		List<NoticeVO> noticeList = service.selectNoticeList(vo);
		model.addAttribute("noticeList", noticeList);
		
		return "/board/notice/noticeSelectList";
	}
	
	@GetMapping("/noticeDetail/{ntcNo}")
	public String noticeDetail (
			@PathVariable String ntcNo
			, Model model
		) {
			NoticeVO notice = service.selectNotice(ntcNo);
			model.addAttribute("notice", notice);
			
			return "/board/notice/noticeSelect";
	}
}
