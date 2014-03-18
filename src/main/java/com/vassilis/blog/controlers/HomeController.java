package com.vassilis.blog.controlers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.vassilis.blog.model.Post;
import com.vassilis.blog.model.Tag;
import com.vassilis.blog.service.PostService;
import com.vassilis.blog.service.TagService;

@Controller
@RequestMapping("/home")
public class HomeController implements ServletContextAware {
	
	private ServletContext servletContext;
	
	@Autowired(required=true)
	private PostService postService; 
	
	@Autowired(required=true)
	private TagService tagService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("home-view-source");
		
//		List<Post> posts = postService.getAllPosts();
//		List<Tag> tags = tagService.getTags();
//		
//		mav.addObject("posts", "java-concurency");
//		mav.addObject("tags", "java, php");
		
		return mav;
	}
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}
}
