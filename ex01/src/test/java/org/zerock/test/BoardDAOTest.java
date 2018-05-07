package org.zerock.test;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	BoardVO board = new BoardVO();
	private static final Logger logger = LoggerFactory.getLogger(BoardDAO.class);
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("user00");
		dao.create(board);
	}
	/*
	//@Test
	public void testRead() throws Exception{
		logger.info(dao.read(1).toString());
	}
	/*
	
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글 입니다.");
		board.setContent("수정 테스트");
		dao.update(board);
	}
	
	
	public void testDelete() throws Exception{
		dao.delete(1);
	}
	*/
	
	/*
	@Test
	public void testListPage() throws Exception{
		int page = 3;
		List<BoardVO> list = dao.listPage(page);
		
		for(BoardVO boardVO : list){
			logger.info(boardVO.getBno() + " : " + boardVO.getTitle());
		}
	}
	*/
	@Test
	public void testListCriteria() throws Exception{
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(10);
		List<BoardVO> list = dao.listCriteria(cri);
		for (BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + " << : >> " + boardVO.getTitle());
		}
 	}
 	
}

