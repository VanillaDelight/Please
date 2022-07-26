package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public int getTotal(Criteria cri) {
		return mapper.getTotal;
	}
	
}
