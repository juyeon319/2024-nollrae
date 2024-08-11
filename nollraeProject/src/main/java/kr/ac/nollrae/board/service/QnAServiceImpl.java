package kr.ac.nollrae.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.nollrae.board.dao.QnADAO;
import kr.ac.nollrae.board.vo.QnAVO;

@Service
public class QnAServiceImpl implements QnAService{

	@Autowired
	QnADAO dao;

	@Override
	public List<QnAVO> selectQnAList(QnAVO vo) {
		return dao.selectQnAList(vo);
	}
	
	
	
	
}
