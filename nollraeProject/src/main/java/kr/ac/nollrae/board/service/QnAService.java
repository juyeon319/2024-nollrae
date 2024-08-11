package kr.ac.nollrae.board.service;

import java.util.List;

import kr.ac.nollrae.board.vo.QnAVO;

public interface QnAService {

	//리스트 조회
	public List<QnAVO> selectQnAList(QnAVO vo); 
}
