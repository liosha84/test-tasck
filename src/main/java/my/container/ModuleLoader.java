package my.container;

import java.io.*;

public class ModuleLoader  extends ClassLoader {

    private String pathtobin;

    public ModuleLoader(String pathtobin, ClassLoader parent) {
        super(parent);
        this.pathtobin = pathtobin;
    }

    public Class getClass(String name) throws ClassNotFoundException {
        String file = name;//.replace('.', File.separatorChar) + ".java";//".class";
        byte[] b = null;
        try {
            // This loads the byte code data from the file
            b = loadClassFileData(file);
            // defineClass is inherited from the ClassLoader class
            // that converts byte array into a Class. defineClass is Final
            // so we cannot override it
            Class c = defineClass(name, b, 0, b.length);
            resolveClass(c);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }



    private byte[] loadClassFileData(String name) throws IOException {
        InputStream stream = getSystemClassLoader().getParent().getResourceAsStream(
                name);


        DataInputStream in = new DataInputStream(stream);
        int size = in.available();
        byte buff[] = new byte[size];

        in.readFully(buff);
        in.close();
        return buff;
    }
}
