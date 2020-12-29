package by.maksim.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "Post title cannot be null")
    @NotEmpty(message = "Post title cannot be empty")
    @NotBlank(message = "Post title cannot be empty or null")
    private String title;

    @NotNull(message = "Post anons cannot be null")
    @NotEmpty(message = "Post anons cannot be empty")
    @NotBlank(message = "Post anons cannot be empty or null")
    private String anons;

    @NotNull(message = "Post full_text cannot be null")
    @NotEmpty(message = "Post full_text cannot be empty")
    @NotBlank(message = "Post anons cannot be empty or null")
    private String full_text;

    private int views;

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
}
