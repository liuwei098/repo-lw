package com.yc.blog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.yc.boke.bean.Article;
import com.yc.boke.bean.ArticleExample;
import com.yc.boke.dao.ArticleMapper;

@Service
public class ArticleBiz {
	
	@Autowired
	private ArticleMapper am;

	/**
	 * 查询最新发布的文章
	 * page 页数
	 */
	public List<Article> queryNewArticle(int page){
		ArticleExample example=new ArticleExample();
		example.setOrderByClause("id desc");
		PageHelper.startPage(page,5);
		return am.selectByExampleWithBLOBs(example);
	}

	/**
	 * 根据分类id 分页查询文章
	 * @param id
	 * @param page
	 * @return
	 */
	public List<Article> queryByCategory(int id, int page) {
		ArticleExample example=new ArticleExample();
		example.createCriteria().andCategoryidEqualTo(id);
		example.setOrderByClause("id desc");
		PageHelper.startPage(page,5);
		return am.selectByExampleWithBLOBs(example);
	}

}
