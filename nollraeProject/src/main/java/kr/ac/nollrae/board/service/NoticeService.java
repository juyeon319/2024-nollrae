package kr.ac.nollrae.board.service;

import java.util.List;

import kr.ac.nollrae.board.vo.NoticeVO;

public interface NoticeService {

	public List<NoticeVO> selectNoticeList(NoticeVO vo);
	
	public NoticeVO selectNotice(String ntcNo);
	
}
