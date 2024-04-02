package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class jwtRequest {
    private String email;
    private String password;


}
