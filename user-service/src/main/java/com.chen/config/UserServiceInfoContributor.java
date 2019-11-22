package com.chen.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * UserServiceInfoContributor
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
@Component
public class UserServiceInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("details",
                Collections.singletonMap("description", "This is User service."));
    }
}
