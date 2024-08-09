package kr.ac.nollrae.guest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.nollrae.guest.dao.TestDAO;
import kr.ac.nollrae.guest.vo.Test;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDAO dao;
	
	@Override
	public List<Test> list() {
		return dao.list();
	}
	
}
