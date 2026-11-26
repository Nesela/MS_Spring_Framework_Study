package mybatis04.spring.dto;

import java.time.LocalDateTime;

public class BoardDto {
    private int id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createAt;

    public BoardDto() {

    }

    public BoardDto(String writer, String title, String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    public BoardDto(int id, String writer, String title, String content, LocalDateTime createAt) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
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

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s", id, writer, title, content, createAt);
    }
}
