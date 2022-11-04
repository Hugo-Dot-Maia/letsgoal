package br.com.letscode.letsgoal.Controller;

import org.slf4j.Logger;

public class BaseController <T> {
    final Logger logger;
    final T service;

    public BaseController(Logger logger, T service) {
        this.logger = logger;
        this.service = service;
    }
}
