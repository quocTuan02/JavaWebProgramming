package DB;

import java.util.Date;

public class News {
    private int id;
    private String title;
    private String image;
    private String summary;
    private String content;
    private Date date;
    private int authorId;

    public News() {
    }

    public News(int id, String title, String image, String summary, String content, Date date, int authorId) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.summary = summary;
        this.content = content;
        this.date = date;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
