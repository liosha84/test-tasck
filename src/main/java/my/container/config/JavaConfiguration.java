package my.container.config;

import my.container.services.PaymentSystem;
import my.container.services.Recommendator;
import my.container.services.impl.CashPaymentSystem;
import my.container.services.impl.SmartRecommendator;

import java.util.Map;

public class JavaConfiguration implements Configuration{
    @Override
    public String getPageToScan() {
        return "my.container";
    }

    @Override
    public Map<Class, Class> getInterfaceToImplementations() {
        return Map.of(PaymentSystem.class, CashPaymentSystem.class, Recommendator.class, SmartRecommendator.class);
    }
}
