package kr.ac.nollrae.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.nollrae.board.dao.QnADAO;
import kr.ac.nollrae.board.vo.QnAReplyVO;
import kr.ac.nollrae.board.vo.QnAVO;

@Service
public class QnAServiceImpl implements QnAService{

	@Autowired
	QnADAO dao;

	//GUEST
	//게시물 목록 가져오기
	@Override
	public List<QnAVO> selectQnAList(QnAVO vo) throws Exception {
		return dao.selectQnAList(vo);
	}

	//게시물 등록
	@Override
	public void insertQnA(QnAVO vo) throws Exception {
		dao.insertQnA(vo);
	}

	//게시물 수정
	@Override
	public void updateQnA(QnAVO vo) throws Exception {
		dao.updateQnA(vo);
	}

	//게시물 삭제
	@Override
	public void deleteQnA(QnAVO vo) throws Exception {
		dao.deleteQnA(vo);
	}

//	===========================================================================
	
	//ADMIN
	//게시물 목록 가져오기
	@Override
	public List<QnAVO> selectAdminQnAList(QnAVO vo) throws Exception {
		return dao.selectAdminQnAList(vo);
	}

	//게시물(문의+답변) 상세조회
	@Override
	public QnAVO selectAdminQnA(String qnaNo) throws Exception {
		return dao.selectAdminQnA(qnaNo);
	}

	//답변 등록
	@Override
	public void insertQnAReply(QnAReplyVO vo) throws Exception {
		dao.insertQnAReply(vo);
	}

	//답변 등록시 답변여부 'Y'로 수정
	@Override
	public void updateReplyAt(QnAVO vo) throws Exception {
		dao.updateReplyAt(vo);
	}

	//답변 수정
	@Override
	public void updateQnAReply(QnAReplyVO vo) throws Exception {
		dao.updateQnAReply(vo);
	}
}
