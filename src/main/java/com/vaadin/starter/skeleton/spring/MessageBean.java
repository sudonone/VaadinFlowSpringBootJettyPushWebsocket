package com.vaadin.starter.skeleton.spring;

import java.io.Serializable;

import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

/**
 * Data provider bean.
 */
@SpringComponent
@UIScope
public class MessageBean implements Serializable {

    /**
     * Gets message data.
     *
     * @return a message
     */
    public String getMessage() {
        return "Not Clicked";
    }
}
