package by.maksim.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "User's username cannot be null")
    @NotEmpty(message = "User's username cannot be empty")
    @NotBlank(message = "User's username cannot be empty or null")
    @Column(name = "username")
    private String username;

    @NotNull(message = "User's password cannot be null")
    @NotEmpty(message = "User's password cannot be empty")
    @NotBlank(message = "User's password cannot be empty or null")
    @Column(name = "password")
    private String password;

    @NotNull(message = "User's name cannot be null")
    @NotEmpty(message = "User's name cannot be empty")
    @NotBlank(message = "User's name cannot be empty or null")
    @Column(name = "name")
    private String name;
    private boolean active;
}
