package com.pedantic.cdi.course.scopes;

import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

@ConversationScoped
public class ConversationScope implements Serializable {
    private static final long serialVersionUID = 215478455465524L;
}
