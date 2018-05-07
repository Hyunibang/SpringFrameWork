package org.zerock.leeyh;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.LibVO;
import org.zerock.persistence.LibDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class LibDAOTest{

	@Inject
	private LibDAO dao;
	LibVO lib = new LibVO();
	
	// 1. 좌석 생성
	@Test
	public void create(LibVO vo) throws Exception {
		// TODO Auto-generated method stub
		Integer id = vo.getId();
		String name = vo.getName();
		Integer floor = vo.getFloor();
		String location = vo.getLocation();
		String start_time = vo.getStarttime();
		String end_time = vo.getEndtime();
		vo.setId(id);
		vo.setName(name);
		vo.setFloor(floor);
		vo.setLocation(location);
		vo.setStarttime(start_time);
		vo.setEndtime(end_time);
		dao.create(vo);
	}
/*
	// 2. 좌석 보기
	@Test
	public LibVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	// 3. 좌석 전체 보기
	@Test
	public List<LibVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	// 4. 좌석 수정
	@Test
	public void update(LibVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(vo);
		
	}
	
*/
}
