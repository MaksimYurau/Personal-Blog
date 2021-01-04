package by.maksim.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usr")
@ApiModel(description = "User Model")
public class User implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ApiModelProperty(notes = "ID of the User", name = "id", required = true, value = "1")
    private Long id;

    @NotNull(message = "User's username cannot be null")
    @NotEmpty(message = "User's username cannot be empty")
    @NotBlank(message = "User's username cannot be empty or null")
    @Column(name = "username")
    @ApiModelProperty(notes = "Username of the User", name = "username", required = true, value = "username")
    private String username;

    @NotNull(message = "User's password cannot be null")
    @NotEmpty(message = "User's password cannot be empty")
    @NotBlank(message = "User's password cannot be empty or null")
    @Column(name = "password")
    @ApiModelProperty(notes = "Password of the User", name = "password", required = true, value = "password")
    private String password;

    @NotNull(message = "User's name cannot be null")
    @NotEmpty(message = "User's name cannot be empty")
    @NotBlank(message = "User's name cannot be empty or null")
    @Column(name = "name")
    @ApiModelProperty(notes = "Name of the User", name = "name", required = true, value = "Max")
    private String name;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

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
