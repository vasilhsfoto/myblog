package com.vassilis.blog.controlers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.vassilis.blog.entities.Post;
import com.vassilis.blog.entities.Tag;
import com.vassilis.blog.service.PostService;
import com.vassilis.blog.service.TagService;

@Controller
public class HomeController implements ServletContextAware {
	private ServletContext servletContext;

	@Autowired(required=true)
	private PostService postService;
	
	@Autowired(required=true)
	private TagService tagService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("home");

		List<Post> posts = postService.getAllPostsWithTags();
		List<Tag> tags = tagService.getAllTags();
		
		mav.addObject("posts",posts);
		mav.addObject("tags",tags);
		
		return mav;
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("about");
		
		return mav;
	}
	
	@RequestMapping(value="*")
	public ModelAndView fallback() {
		return new ModelAndView("fallback");
	}
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}
	
	public void setTagService(TagService tagService) {
		this.tagService = tagService;
	}
	
}
