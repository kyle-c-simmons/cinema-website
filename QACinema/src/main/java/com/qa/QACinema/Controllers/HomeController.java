package com.qa.QACinema.Controllers;

import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.QACinema.Entities.GeneralMessage;
import com.qa.QACinema.Entities.IntroductionMessage;
import com.qa.QACinema.Entities.MovieMessage;
import com.qa.QACinema.Entities.Screen;
import com.qa.QACinema.Repositories.GeneralMessageRepository;
import com.qa.QACinema.Repositories.MovieMessageRepository;
import com.qa.QACinema.Repositories.ScreenRepository;
import com.qa.QACinema.Service.GeneralMessageService;
import com.qa.QACinema.Service.IntroductionMessageService;
import com.qa.QACinema.Service.MovieMessageService;
import com.qa.QACinema.Service.ScreenService;

@RestController
public class HomeController {
	
	@Autowired
	private ScreenService screenService;
	
	@Autowired
	private ScreenRepository screenRepo;
	
	@Autowired
	private GeneralMessageRepository gmRepo;
	
	@Autowired
	private GeneralMessageService gmService;
	
	@Autowired
	private MovieMessageRepository moviemsgRepo;
	
	@Autowired
	private MovieMessageService moviemsgService;
	
	@Autowired
	private IntroductionMessageService introService;
	
	@Autowired
	private MovieMessageRepository introRepo;
	
	
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/private")
	public String privateArea() {
		return "private";
	}
	
	@PostMapping("/Screen")
	public void addAccount(@RequestBody Screen screen) {
		
		screenService.addScreen(screen);
	}
	
	@GetMapping("/Screen")
	public List<Screen> getAllScreens() {
		return screenService.getAllScreens();
	}
	
	@GetMapping(value="/generalmessages")
    public List<GeneralMessage> getGeneralMessages(){
        return gmService.getAllGeneralMessages();
    }
	
	@PostMapping("/generalmessages")
	public void addMessage(@RequestBody GeneralMessage gm) {
		if (gm.getCreationDate() == null) 
			gm.setCreationDate(new Date());
		gmService.insert(gm);
	}
	
	@GetMapping(value="/newmovies")
    public List<MovieMessage> getMovieMessages(){
        return moviemsgService.getAllMovieMessages();
    }
	
	@PostMapping("/newmovies")
	public void addMovieMessage(@RequestBody MovieMessage movie) {
		if (movie.getCreationDate() == null) 
			movie.setCreationDate(new Date());
		moviemsgService.insert(movie);
	}
	
	@GetMapping(value="/introduction")
    public List<IntroductionMessage> getIntroductionMessages(){
        return introService.getAllIntroductionMessages();
    }
	
	@PostMapping("/introduction")
	public void addIntroductionMessage(@RequestBody IntroductionMessage intro) {
		if (intro.getCreationDate() == null) 
			intro.setCreationDate(new Date());
		introService.insert(intro);
	}
	
	

}
