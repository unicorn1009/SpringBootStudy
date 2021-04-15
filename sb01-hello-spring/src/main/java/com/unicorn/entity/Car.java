package com.unicorn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * </p>
 * Created on 2021/04/12 16:33
 *
 * @author Unicorn
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
public class Car {
    private String name;
    private Integer price;
}
