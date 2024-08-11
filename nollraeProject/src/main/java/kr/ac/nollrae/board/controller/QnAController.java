package kr.ac.nollrae.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.nollrae.board.service.QnAService;
import kr.ac.nollrae.board.vo.QnAVO;

@Controller
@RequestMapping("/guest")
public class QnAController {

	@Autowired
	private QnAService service;
	

	@GetMapping("qnaList")
	public String qnaList(QnAVO vo, Model model, HttpServletRequest request) throws Exception {
		List<QnAVO> qnaList = service.selectQnAList(vo);
		model.addAttribute("qnaList", qnaList);
		
		return "board/qna/qnaSelectList";
	}
}
