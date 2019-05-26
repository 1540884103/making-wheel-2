package com.chen.simple.spring.framework.web.method;

import com.chen.simple.spring.framework.http.HttpStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author 陈添明
 * @date 2019/5/26
 */
@Data
@Accessors(chain = true)
public class ModelAndViewContainer {

    private Object view;

    /** Model Map */
    private Map<String, Object> model;

    private boolean requestHandled = false;

    private HttpStatus status;
}
