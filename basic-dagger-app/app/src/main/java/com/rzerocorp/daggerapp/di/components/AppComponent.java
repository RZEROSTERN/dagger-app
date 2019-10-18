package com.rzerocorp.daggerapp.di.components;

import android.app.Application;

import com.rzerocorp.daggerapp.MainApplication;
import com.rzerocorp.daggerapp.di.modules.ActivityBuilder;
import com.rzerocorp.daggerapp.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent extends AndroidInjector<MainApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(MainApplication application);
}
