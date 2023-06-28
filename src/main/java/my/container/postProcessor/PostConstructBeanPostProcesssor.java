package my.container.postProcessor;

import lombok.SneakyThrows;
import my.container.annotations.PostConstruct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PostConstructBeanPostProcesssor implements BeanPostProcessor{
    @Override

    public void process(Object bean) throws InvocationTargetException, IllegalAccessException {

        for(Method method : bean.getClass().getSuperclass().getDeclaredMethods()){
            if(method.isAnnotationPresent(PostConstruct.class)){

                method.invoke(bean);
            }
        }
    }
}
