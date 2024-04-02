package com.example.demo.Model;


import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class jwtResponse {

    private String jwtToken;
    private String username;

}
