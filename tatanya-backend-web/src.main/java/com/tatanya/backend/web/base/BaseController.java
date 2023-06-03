package com.tatanya.backend.web.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class BaseController {

  @Autowired
  private ApplicationContext applicationContext;

  public <T> T getContext(Class<T> bean) {
    return applicationContext.getBean(bean);
  }

}
