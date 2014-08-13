package domain;

import java.util.Date;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Post post;
	private UserInfo userInfo;
	private String replyContent;
	private String replyExpression;
	private Date replyTime;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** full constructor */
	public Reply(Post post, UserInfo userInfo, String replyContent,
			String replyExpression, Date replyTime) {
		this.post = post;
		this.userInfo = userInfo;
		this.replyContent = replyContent;
		this.replyExpression = replyExpression;
		this.replyTime = replyTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyExpression() {
		return this.replyExpression;
	}

	public void setReplyExpression(String replyExpression) {
		this.replyExpression = replyExpression;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

}