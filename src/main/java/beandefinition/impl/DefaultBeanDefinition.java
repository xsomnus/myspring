package beandefinition.impl;

import beandefinition.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

/**
 * bean定义实现
 *
 * @author ly
 * @create 2018-12-02 11:30
 **/
public class DefaultBeanDefinition implements BeanDefinition{

    private Class<?> clazz;

    private String beanFactoryName;

    private String createBeanMethodName;

    private String staticCreateBeanMethodName;

    private String beanInitMethodName;

    private String beanDestoryMethodName;

    private boolean isSingleton;

    private Constructor constructor;

    private Method method;

    private List<?> constructorArg;

    public void setConstructorArg(List<?> constructorArg) {
        this.constructorArg = constructorArg;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public void setBeanFactoryName(String beanFactoryName) {
        this.beanFactoryName = beanFactoryName;
    }

    public void setCreateBeanMethodName(String createBeanMethodName) {
        this.createBeanMethodName = createBeanMethodName;
    }

    public void setStaticCreateBeanMethodName(String staticCreateBeanMethodName) {
        this.staticCreateBeanMethodName = staticCreateBeanMethodName;
    }

    public void setBeanInitMethodName(String beanInitMethodName) {
        this.beanInitMethodName = beanInitMethodName;
    }

    public void setBeanDestoryMethodName(String beanDestoryMethodName) {
        this.beanDestoryMethodName = beanDestoryMethodName;
    }

    public void setSingleton(boolean singleton) {
        isSingleton = singleton;
    }

    @Override
    public Class<?> getBeanClass() {
        return this.clazz;
    }

    @Override
    public String getBeanFactory() {
        return this.beanFactoryName;
    }

    @Override
    public String getCreateBeanMethod() {
        return this.createBeanMethodName;
    }

    @Override
    public String getStaticCreateBeanMethod() {
        return this.staticCreateBeanMethodName;
    }

    @Override
    public String getBeanInitMethodName() {
        return this.beanInitMethodName;
    }

    @Override
    public String getBeanDestoryMethodName() {
        return this.beanDestoryMethodName;
    }

    @Override
    public String getScope() {
        return this.isSingleton?BeanDefinition.SINGLETION :BeanDefinition.PROTOTYPE;
    }

    @Override
    public boolean isSingleton() {
        return this.isSingleton;
    }

    @Override
    public boolean isPrototype() {
        return !this.isSingleton;
    }

    @Override
    public List<?> getConstructorArg() {
        return this.constructorArg;
    }

    @Override
    public Constructor<?> getConstructor() {
        return this.constructor;
    }

    @Override
    public void setConstructor(Constructor<?> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Method getFactoryMethod() {
        return this.method;
    }

    @Override
    public void setFactoryMethod(Method factoryMethod) {
        this.method = method;
    }
}