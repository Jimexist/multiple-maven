package com.madadata.api;

import com.madadata.api.conf.APIConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by jiayu on 3/20/16.
 */
public class Main extends Application<APIConfig> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void run(APIConfig apiConfig, Environment environment) throws Exception {

    }
}
