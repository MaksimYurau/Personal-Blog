package by.maksim.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;

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

//    private String googleName;
//
//    private String googleUsername;

    public User(@NotNull(message = "User's username cannot be null") @NotEmpty(message = "User's username cannot be empty") @NotBlank(message = "User's username cannot be empty or null") String username, @NotNull(message = "User's password cannot be null") @NotEmpty(message = "User's password cannot be empty") @NotBlank(message = "User's password cannot be empty or null") String password, @NotNull(message = "User's name cannot be null") @NotEmpty(message = "User's name cannot be empty") @NotBlank(message = "User's name cannot be empty or null") String name, boolean active) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.active = active;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
