package my.container.config;

import java.util.Map;

public interface Configuration {
    String getPageToScan();

    Map<Class, Class> getInterfaceToImplementations();
}
