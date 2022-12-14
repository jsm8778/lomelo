package com.lomelo.document.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "account")
public class Account {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String location;

}
