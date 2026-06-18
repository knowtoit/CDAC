package com.demo.service;

import com.demo.dao.AnnotationDao;
import com.demo.model.CustomAnnotation;
import java.lang.reflect.Method;

public class AnnotationServiceImpl implements AnnotationService {
    private AnnotationDao dao;

    public AnnotationServiceImpl(AnnotationDao dao) {
        this.dao = dao;
    }

    public void invokeAnnotatedMethods() throws Exception {
        Object object = dao.getTargetClass().getDeclaredConstructor().newInstance();
        for (Method method : dao.getTargetClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                method.invoke(object);
            } else {
                System.out.println("Not annotated: " + method.getName());
            }
        }
    }
}