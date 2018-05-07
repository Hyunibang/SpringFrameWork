package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.LibVO;
import org.zerock.persistence.LibDAO;

@Service
public class LibServiceImpl implements LibService {

	@Inject
	private LibDAO dao;
	LibVO lib = new LibVO();
	
	// 1. 좌석 생성
	@Override
	public void create(LibVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		Integer id = vo.getId();
		String name = vo.getName();
		Integer floor = vo.getFloor();
		String location = vo.getLocation();
		String starttime = vo.getStarttime();
		String endtime = vo.getEndtime();
		
		vo.setId(id);
		vo.setName(name);
		vo.setFloor(floor);
		vo.setLocation(location);
		vo.setStarttime(starttime);
		vo.setEndtime(endtime);
		dao.create(vo);
	}

	// 2. 좌석 보기
	@Override
	public LibVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	// 3. 좌석 전체 보기
	@Override
	public List<LibVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	// 4. 좌석 수정
	@Override
	public void update(LibVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(vo);
		
	}
	
	// 5. 좌석 삭제
	@Override
	public void delete(Integer bno) throws Exception {
		dao.delete(bno);
	}
	

}
