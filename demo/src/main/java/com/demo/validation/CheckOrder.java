package com.demo.validation;

import javax.validation.GroupSequence;

/**
 * 校验分组序列
 * @author huanhuan.jin
 *
 */
@GroupSequence({Group1.class, Group2.class,Group3.class})
public interface CheckOrder {

}
