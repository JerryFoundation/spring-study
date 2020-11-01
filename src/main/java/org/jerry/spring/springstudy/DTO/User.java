package org.jerry.spring.springstudy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhuqianchao
 * @date 1/11/2020 14:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userName;

    private Double scores;
}
