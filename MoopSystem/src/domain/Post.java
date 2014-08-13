package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */

public class Post implements java.io.Serializable {

	// Fields

	private Integer id;
	private Discussion discussion;
	private UserInfo userInfo;
	private Integer replyCount;
	private String topic;
	private String postContent;
	private String postExpression;
	private Date postTime;
	private Integer clickCount;
	private Set replies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** minimal constructor */
	public Post(Discussion discussion, UserInfo userInfo, Integer replyCount,
			String topic, String postContent, String postExpression,
			Date postTime, Integer clickCount) {
		this.discussion = discussion;
		this.userInfo = userInfo;
		this.replyCount = replyCount;
		this.topic = topic;
		this.postContent = postContent;
		this.postExpression = postExpression;
		this.postTime = postTime;
		this.clickCount = clickCount;
	}

	/** full constructor */
	public Post(Discussion discussion, UserInfo userInfo, Integer replyCount,
			String topic, String postContent, String postExpression,
			Date postTime, Integer clickCount, Set replies) {
		this.discussion = discussion;
		this.userInfo = userInfo;
		this.replyCount = replyCount;
		this.topic = topic;
		this.postContent = postContent;
		this.postExpression = postExpression;
		this.postTime = postTime;
		this.clickCount = clickCount;
		this.replies = replies;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Discussion getDiscussion() {
		return this.discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Integer getReplyCount() {
		return this.replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostExpression() {
		return this.postExpression;
	}

	public void setPostExpression(String postExpression) {
		this.postExpression = postExpression;
	}

	public Date getPostTime() {
		return this.postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

}