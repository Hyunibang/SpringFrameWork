package org.zerock.leeyh;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.LibVO;
import org.zerock.service.LibService;

// 해당 컨트롤러를 빈으로 등록함
@Controller
public class LibController {
	
	// LibServiceImpl 생성 
	@Autowired
	LibService libService;
	private static final Logger logger = LoggerFactory.getLogger(LibController.class);

	// 좌석 생성
	@RequestMapping(value="create.go", method=RequestMethod.POST)
	public String create(LibVO vo) throws Exception {
		libService.create(vo);
		return "redirect:list.go";
	}

	// 좌석 생성 Display
	@RequestMapping(value="write.go", method=RequestMethod.GET)
	public String write() {
		return "create";
	}
	
	// Library Main View
	@RequestMapping(value="Library.go")
	public String Library() throws Exception{
		return "Library";
	}
	 
	// 좌석 수정 Display
	@RequestMapping(value="view.go")
	public String view() {
		return "update";
	}
	
	// 좌석 수정
	@RequestMapping(value="update.go", method=RequestMethod.POST)
	public String update(LibVO vo) throws Exception {
		libService.update(vo);
		return "redirect:list.go";
	}
	
	// 좌석 삭제
	@RequestMapping(value="delete.go")
	public String delete(@RequestParam Integer bno) throws Exception {
		libService.delete(bno);
		return "redirect:list.go";
	}
	
	// 좌석 전체 list 출력
	@RequestMapping(value="list.go", method = RequestMethod.GET)
	   public void listAll(Model model) throws Exception{
	      logger.info("show all list...................");
	      
	      model.addAttribute("list", libService.listAll());
	   }
}
