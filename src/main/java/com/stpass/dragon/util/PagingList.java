package com.stpass.dragon.util;

import java.util.ArrayList;

/**
 * 
 * @author chenqs@stpass.com
 * @version v0.1 2015/01/12
 * @param <T>
 */
public class PagingList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	private int pageIndex;
	private int pageSize;
	private int totalRows;
	private int totalPages;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
