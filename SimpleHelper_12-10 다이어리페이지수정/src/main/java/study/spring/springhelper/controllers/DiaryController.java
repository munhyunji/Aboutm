package study.spring.springhelper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import clojure.lang.Keyword;
import study.spring.springhelper.helper.RegexHelper;
import study.spring.springhelper.helper.WebHelper;
import study.spring.springhelper.model.Diary;
import study.spring.springhelper.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	WebHelper webHelper;

	@Autowired
	RegexHelper regexHelper;

	@Autowired
	DiaryService diaryService;
	
	@Value("#{servletContext.contextPath}")
	String contextPath;
	
	//목록 페이지
	@RequestMapping(value = "/diary/list.do", method = RequestMethod.GET)
	public ModelAndView list(Model model,
			@RequestParam(value="keyword", required=false) String keyword) {
	
		Diary input = new Diary();
		input.setTitle(keyword);
		
		List<Diary> output = null; // 조회결과가 저장될 객체;
		
		try {
			output = diaryService.getDiaryList(input);
			
		} catch (Exception e) {
			return webHelper.redirect(null, e.getLocalizedMessage());
		}
		
		//view처리
		model.addAttribute("keyword", keyword);
		model.addAttribute("output", output);
		
		return new ModelAndView("diary/list");
	}

	// 작성폼페이지
	@RequestMapping(value = "/diary/add.do", method = RequestMethod.GET)
	public ModelAndView add(Model model) {
		
		return new ModelAndView("diary/add");
	}

	// 작성페이지에대한 action페이지
	
	@RequestMapping(value = "/diary/add_ok.do", method = RequestMethod.POST)
	public ModelAndView add_ok(Model model,
			@RequestParam(value="title", defaultValue="") String title,
			@RequestParam(value="date", defaultValue="") String date,
			@RequestParam(value="writer", defaultValue="문현지") String writer,
			@RequestParam(value="content", defaultValue="") String content
			) {
		
		 /** 1) 사용자가 입력한 파라미터 유효성 검사 */
        // 일반 문자열 입력 컬럼 --> String으로 파라미터가 선언되어 있는 경우는 값이 입력되지 않으면 빈 문자열로 처리된다.
        if (!regexHelper.isValue(title))     { return webHelper.redirect(null, "글 제목을 입력하세요."); }
        if (!regexHelper.isValue(date))   { return webHelper.redirect(null, "글 작성 일자를를 입력하세요."); }
        if (!regexHelper.isValue(content))     { return webHelper.redirect(null, "글 내용을 입력하세요."); }
      
		
		Diary input = new Diary();
		input.setTitle(title);
		input.setDate(date);
		input.setWriter(writer);
		input.setContent(content);
		
		try {
			//데이터 저장
			diaryService.addDiary(input);
			
		} catch (Exception e) {
			return webHelper.redirect(null, e.getLocalizedMessage());
		}
		
		//결과확인을 위한 페이지 이동
		String redirectUrl = contextPath + "/diary/view.do?id="+ input.getId();
		return webHelper.redirect(redirectUrl, "저장되었습니다.");
	}
	
	@RequestMapping(value="/diary/view.do", method= RequestMethod.GET)
	public ModelAndView view(Model model,
		@RequestParam(value="id", defaultValue="1") int id ) {
	
		Diary input = new Diary();
		
		List<Diary> output =null; // 조회결과가 저장될 객체
		
		try {
			
			output = diaryService.getDiaryList(input);
			
		} catch (Exception e) {
	        		
		}
		
		model.addAttribute("output", output);
		
		return null;
		
	}
	
	// 수정페이지
	// 수정페이지에대한 action페이지
	// 삭제페이지 
}
