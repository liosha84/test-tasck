package my.container;

import my.container.client.NewYearOrganizer;
import my.container.context.ApplicationContext;
import my.container.factories.BeanFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public ApplicationContext run(){
        ApplicationContext applicationContext = new ApplicationContext();
        BeanFactory beanFactory = new BeanFactory(applicationContext);
        applicationContext.setBeanFactory(beanFactory);

        return applicationContext;
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Main application = new Main();
        ApplicationContext context = application.run();

        NewYearOrganizer newYearOrganizer = context.getBean(NewYearOrganizer.class);
        newYearOrganizer.prepareToCelebration();



//        String filePath = System.getProperty("java.class.path");
//
//
//        ModuleLoader loader = new ModuleLoader(filePath, ClassLoader.getSystemClassLoader());
//
//        File dir = new File(filePath);
//        String[] fileNames = dir.list();
//
//
//        SampleClassLoader sampleLoader = new SampleClassLoader();
//
//        for (String fileName: fileNames) {
//            try {
//
//               Class c = sampleLoader.findClass(filePath +File.separatorChar + fileName);
//
//
//                Class clazz = loader.getClass(filePath +File.separatorChar + fileName);
//                Module execute = null;
//                try {
//                    execute = (Module) clazz.getDeclaredConstructor().newInstance();
//                } catch (InvocationTargetException e) {
//                    throw new RuntimeException(e);
//                } catch (NoSuchMethodException e) {
//                    throw new RuntimeException(e);
//                }
//
////                execute.load();
////                execute.run();
////                execute.unload();
//
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }


    }

}