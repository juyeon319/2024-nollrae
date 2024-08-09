package kr.ac.nollrae.guest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.nollrae.guest.vo.Test;

@Mapper
public interface TestDAO {

	public List<Test> list(); 
}
