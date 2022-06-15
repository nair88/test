package com.library.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class CountDTO implements Serializable {
	private Integer library_id;
	private Long count;

	public Integer getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(Integer library_id) {
		this.library_id = library_id;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public CountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountDTO(Integer library_id, Long count) {
		super();
		this.library_id = library_id;
		this.count = count;
	}

}
