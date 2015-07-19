package model.vo;

import java.util.List;

public class Role {

	private Integer code;
	private String name;
	private List<Page> pages;

	public Role(Integer code, String name, List<Page> pages) {
		super();
		this.code = code;
		this.name = name;
		this.pages = pages;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

}
