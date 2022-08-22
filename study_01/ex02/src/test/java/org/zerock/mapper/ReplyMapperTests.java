package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper mapper;
	
	private Long[] bnoArr = {825L, 826L, 827L, 828L, 829L};
	
	@Test
	public void testMapper() {
		log.info("mapper ========== " + mapper);
	}
	
	@Test
	public void testCreate() {
		for (int i = 0; i < 5; i++) {
			ReplyVO vo = new ReplyVO();
			vo.setBno(834L);
			vo.setReply("하이요0" + i+1);
			vo.setReplyer("홍길동0" + i+1);
			mapper.insert(vo);
		}
	}
	
	@Test
	public void testRead() {
		mapper.read(10L);
	}
	
	@Test
	public void testDelete() {
		mapper.delete(2L);
	}
	
	@Test
	public void testUpdate() {
		ReplyVO vo = new ReplyVO();
		vo.setReply("수정됬나요?");
		vo.setRno(3L);
		mapper.update(vo);
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 10L);
		log.info(replies);
	}
	@Test
	public void testList2() {
		Criteria cri = new Criteria(2, 5);
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 833L);
		replies.forEach(reply -> log.info(reply));
	}
	@Test
	public void testCount() {
		log.info(mapper.getCountByBno(833L));
	}
}
