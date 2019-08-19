package com.yc.blog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.boke.bean.Article;
import com.yc.boke.bean.Comment;
import com.yc.boke.dao.ArticleMapper;
import com.yc.boke.dao.CommentMapper;

@Service
public class ComentBiz {
	@Resource
	private CommentMapper cm;
	@Resource
	private ArticleMapper am;
	
	//添加评论 修改评论数
	@Transactional
	public Comment comment(Comment comm){
		cm.insertSelective(comm);
		Article article=am.selectByPrimaryKey(comm.getArticleid());
		article.setPingluncnt((article.getPingluncnt()==null?0:article.getPingluncnt())+1);
		am.updateByPrimaryKeySelective(article);
		return comm;
	}
}
