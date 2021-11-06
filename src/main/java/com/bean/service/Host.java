package com.bean.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Host {
    String ip;
    String userName;
    char[] password;
    char[] rootPassword;
}
