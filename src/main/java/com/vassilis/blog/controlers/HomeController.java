package com.vassilis.blog.controlers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.vassilis.blog.entities.Article;
import com.vassilis.blog.entities.Tag;
import com.vassilis.blog.service.ArticleService;
import com.vassilis.blog.service.TagService;

@Controller
public class HomeController implements ServletContextAware {
	private ServletContext servletContext;

	@Autowired(required=true)
	private ArticleService postService;

	@Autowired(required=true)
	private TagService tagService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("home");

		List<Article> articles = postService.getAllArticles();

		List<Tag> tags = tagService.getAllTags();

		mav.addObject("articles", articles);
		mav.addObject("tags", tags);

		return mav;
	}

	@RequestMapping(value="/about", method=RequestMethod.GET)
	ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("about");

		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fallback")
	ModelAndView failback() {
		ModelAndView mav = new ModelAndView("fallback");

		return mav;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}

	public void setTagService(TagService tagService) {
		this.tagService = tagService;
	}
}
