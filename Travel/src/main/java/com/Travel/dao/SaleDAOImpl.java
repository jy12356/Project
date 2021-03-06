package com.Travel.dao;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.Travel.domain.CategoryBean;
import com.Travel.domain.ProductBean;

@Repository
public class SaleDAOImpl implements SaleDAO {
	//mybatis 생성자 통해서 객체생성 
		@Inject
		private SqlSession sqlSession;
		private static final String namespace="com.Travel.mapper.SaleMapper";
		@Override
		public List<CategoryBean> getCategoryList(String ctg_type) {
			return sqlSession.selectList(namespace+".getCategoryList",ctg_type);
		}
		@Override
		public List<ProductBean> getProductList() {
			return sqlSession.selectList(namespace+".getProductList");
		}

}
