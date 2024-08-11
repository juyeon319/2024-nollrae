package kr.ac.nollrae.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.nollrae.board.vo.QnAVO;

@Mapper
public interface QnADAO {
	
	//리스트 조회
	public List<QnAVO> selectQnAList(QnAVO vo); 
	
}
