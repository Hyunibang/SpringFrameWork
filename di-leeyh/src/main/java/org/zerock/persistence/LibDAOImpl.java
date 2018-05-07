package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.LibVO;


@Repository
public class LibDAOImpl implements LibDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.zerock.mapper.LibMapper";

	// 1. 좌석 생성
	@Override
	public void create(LibVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create", vo);
	}
	
	// 2. 좌석 보기
	@Override
	public LibVO read(Integer bno) throws Exception {
		return session.selectOne(namespace+".read", bno);
	}
	
	// 3. 좌석 전체 보기
	@Override
	public List<LibVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
	// 4. 좌석 수정
		@Override
		public void update(LibVO vo) throws Exception {
			session.delete(namespace+".update", vo);
		}
		
	// 5. 좌석 삭제
		@Override
		public void delete(Integer bno) throws Exception {
			session.delete(namespace+".delete", bno);
		}
}