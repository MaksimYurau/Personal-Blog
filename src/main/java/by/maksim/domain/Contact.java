package by.maksim.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    private String name;
    private String phone;
    private String email;
    private String address;
    private String subject;
    private String content;
}
