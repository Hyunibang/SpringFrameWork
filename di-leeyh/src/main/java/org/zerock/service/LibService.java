package org.zerock.service;

import java.util.List;

import org.zerock.domain.LibVO;

public interface LibService {
	// 1. 좌석 생성
	public void create(LibVO vo) throws Exception;
	// 2. 좌석 보기
	public LibVO read(Integer bno) throws Exception;
	// 3. 좌석 전체 보기
	public List<LibVO> listAll() throws Exception;
	// 4. 좌석 수정
	public void update(LibVO vo) throws Exception;
	// 5. 좌석 삭제 --> Int
	public void delete(Integer bno) throws Exception;
}
