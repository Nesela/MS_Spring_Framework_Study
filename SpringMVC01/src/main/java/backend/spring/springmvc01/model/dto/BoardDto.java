package backend.spring.springmvc01.model.dto;

import java.time.LocalDateTime;
import java.util.List;

public record BoardDto(int id, String writer, String title, String content, LocalDateTime createAt) {

    public BoardDto(String writer, String title, String content) {
        this(0, writer, title, content, null);
    }
    public BoardDto(int id, String writer, String title, String content, LocalDateTime createAt) {
        this.id=id;
        this.writer=writer;
        this.title=title;
        this.content=content;
        this.createAt=createAt;
    }
}
