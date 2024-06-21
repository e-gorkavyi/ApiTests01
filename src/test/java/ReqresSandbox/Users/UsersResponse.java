package ReqresSandbox.Users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsersResponse{
	@JsonProperty("per_page")
	private Integer perPage;
	private Integer total;
	private List<User> data;
	private Integer page;
	@JsonProperty("total_pages")
	private Integer totalPages;
	private Support support;

	public UsersResponse() {
		super();
	}

	public UsersResponse(Integer perPage, Integer total, List<User> data, Integer page, Integer totalPages, Support support) {
		this.perPage = perPage;
		this.total = total;
		this.data = data;
		this.page = page;
		this.totalPages = totalPages;
		this.support = support;
	}

	public void setPerPage(Integer perPage){
		this.perPage = perPage;
	}

	public Integer getPerPage(){
		return perPage;
	}

	public void setTotal(Integer total){
		this.total = total;
	}

	public Integer getTotal(){
		return total;
	}

	public void setData(List<User> data){
		this.data = data;
	}

	public List<User> getData(){
		return data;
	}

	public void setPage(Integer page){
		this.page = page;
	}

	public Integer getPage(){
		return page;
	}

	public void setTotalPages(Integer totalPages){
		this.totalPages = totalPages;
	}

	public Integer getTotalPages(){
		return totalPages;
	}

	public void setSupport(Support support){
		this.support = support;
	}

	public Support getSupport(){
		return support;
	}
}