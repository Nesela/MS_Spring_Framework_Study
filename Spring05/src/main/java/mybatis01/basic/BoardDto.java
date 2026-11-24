package mybatis01.basic;

import java.time.LocalDate;

/*
id INT AUTO_INCREMENT PRIMARY KEY,
                       writer VARCHAR(100) NOT NULL,
                       title VARCHAR(200) NOT NULL,
                       content TEXT,
                       createAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 */
public record BoardDto(int id, String writer, String title, String content, LocalDate createAt) {

    public BoardDto(String writer, String title, String content) {
        this(0, writer, title, content, null);
    }

    public BoardDto(int id, String writer, String title, String content, LocalDate createAt) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createAt = createAt;
    }
}
