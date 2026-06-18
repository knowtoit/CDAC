package com.demo.service;

import com.demo.dao.ReflectionDao;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionServiceImpl implements ReflectionService {
    private ReflectionDao reflectionDao;

    public ReflectionServiceImpl(ReflectionDao reflectionDao) {
        this.reflectionDao = reflectionDao;
    }

    public ReflectionDao getReflectionDao() {
        return reflectionDao;
    }

    public void setReflectionDao(ReflectionDao reflectionDao) {
        this.reflectionDao = reflectionDao;
    }

    public void displayClassDetailsAndInvokeMethods() throws Exception {
        for (Class<?> clazz : reflectionDao.getClassesForReflection()) {
            System.out.println("\nClass name: " + clazz.getName());
            Object object = clazz.getDeclaredConstructor().newInstance();

            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("Method name: " + method.getName());
                System.out.println("Parameter count: " + method.getParameterCount());

                Object[] values = new Object[method.getParameterCount()];
                int index = 0;
                for (Parameter parameter : method.getParameters()) {
                    System.out.println("Parameter name: " + parameter.getName());
                    System.out.println("Parameter type: " + parameter.getType().getName());
                    values[index] = sampleValue(parameter.getType(), index);
                    index++;
                }

                if (method.getParameterCount() >= 3) {
                    method.invoke(object, values);
                }
                System.out.println();
            }
        }
    }

    private Object sampleValue(Class<?> type, int index) {
        if (type == int.class || type == Integer.class) {
            return index + 1;
        }
        if (type == double.class || type == Double.class) {
            return (double) index + 1;
        }
        if (type == String.class) {
            return "value" + index;
        }
        return null;
    }
}