package com.tensquare.qa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_reply")
public class Reply implements Serializable{

	@Id
	private String id;//ID
	private String problemid;//问题ID
	private String content;//内容
	private java.util.Date createtime;//创建日期
	private java.util.Date updatetime;//修改日期
	private String userid;//用户ID
	private String nickname;//昵称

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProblemid() {
		return problemid;
	}

	public void setProblemid(String problemid) {
		this.problemid = problemid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
