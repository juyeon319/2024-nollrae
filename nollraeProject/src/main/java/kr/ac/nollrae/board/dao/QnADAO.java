package kr.ac.nollrae.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.nollrae.board.vo.QnAReplyVO;
import kr.ac.nollrae.board.vo.QnAVO;

@Mapper
public interface QnADAO {
	
	//GUEST
	//게시물 목록 가져오기
	public List<QnAVO> selectQnAList(QnAVO vo) throws Exception; 
	
	//게시물 등록
	public void insertQnA(QnAVO vo) throws Exception;
	
	//게시물 수정
	public void updateQnA(QnAVO vo) throws Exception;
	
	//게시물 삭제
	public void deleteQnA(QnAVO vo) throws Exception;
	
//	===========================================================================
	
	//ADMIN
	//게시물 목록 가져오기
	public List<QnAVO> selectAdminQnAList(QnAVO vo) throws Exception;
	
	//게시물(문의+답변) 상세조회
	public QnAVO selectAdminQnA(String qnaNo) throws Exception;
	
	//답변 등록
	public void insertQnAReply(QnAReplyVO vo) throws Exception;
	
	//답변 등록시 답변여부 'Y'로 수정
	public void updateReplyAt(QnAVO vo) throws Exception;
	
	//답변 수정
	public void updateQnAReply(QnAReplyVO vo) throws Exception;
}
