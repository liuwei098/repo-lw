package com.yc.blog.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.boke.bean.Category;
import com.yc.boke.dao.CategoryMapper;

@Service
public class CategoryBiz {

	@Resource
	private CategoryMapper cm;
	
	public List<Category> queryAll(){
		return cm.selectByExample(null);
	}
}
