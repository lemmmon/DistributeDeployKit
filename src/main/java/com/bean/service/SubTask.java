package com.bean.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SubTask {
    Integer id;
    Long uuid;
    String cmd;
    String result;
}
