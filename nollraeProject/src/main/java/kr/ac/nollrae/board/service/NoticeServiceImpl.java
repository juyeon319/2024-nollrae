package kr.ac.nollrae.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.nollrae.board.dao.NoticeDAO;
import kr.ac.nollrae.board.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeDAO dao;

	@Override
	public List<NoticeVO> selectNoticeList(NoticeVO vo) {
		return dao.selectNoticeList(vo);
	}

	@Override
	public NoticeVO selectNotice(String ntcNo) {
		NoticeVO vo = dao.selectNotice(ntcNo);
		dao.incrementNoticeCnt(ntcNo);
		
		return vo;
	}
	
}
