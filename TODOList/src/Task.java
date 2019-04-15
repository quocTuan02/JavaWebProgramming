/*
1. Xây dựng lớp Task (int id, String title, String content, boolean done)
 */
public class Task {
    private int id;
    private String title;//tiêu đề
    private String content;//Nội dung
    private boolean done;//hoàn thành

    public Task(int id, String title, String content, boolean done) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.done = done;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
//173795375

/*
0348991195
ngô thị nhung
 */