package com.hrbc.business.domain.common;

import com.alibaba.fastjson.JSONObject;

public class PageQueryParamDTO {

	/**
	 * 页码
	 */
	private int page;

	/**
	 * 每页数量
	 */
	private int size;
	/**
	 * 排序条件 如 id desc 或者 id desc  ,time asc
	 */
	private String orderby;

	/**
	 * 查询条件
	 */
	private JSONObject query;

	public PageQueryParamDTO() {
	}

	public PageQueryParamDTO(int page, int size, JSONObject query) {
		this.page = page;
		this.size = size;
		this.query = query;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public JSONObject getQuery() {
		return query;
	}

	public void setQuery(JSONObject query) {
		this.query = query;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
}
