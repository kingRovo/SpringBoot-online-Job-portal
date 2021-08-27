package com.rovo.mypath_alerts.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long BlogId;
    private String blogTitle;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postdate;

    @Lob
    private byte[] post;

    public Blog() {
    }

    public Long getBlogId() {
        return BlogId;
    }

    public void setBlogId(Long blogId) {
        BlogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public byte[] getPost() {
        return post;
    }

    public void setPost(byte[] post) {
        this.post = post;
    }

}
