package kr.ac.nollrae.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.nollrae.board.vo.NoticeVO;

@Mapper
public interface NoticeDAO {

	public List<NoticeVO> selectNoticeList(NoticeVO vo);
	
	public NoticeVO selectNotice(String ntcNo);
	
	public int incrementNoticeCnt(String ntcNo);
}
