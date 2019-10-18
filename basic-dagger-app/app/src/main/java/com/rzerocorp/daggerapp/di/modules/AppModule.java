package com.rzerocorp.daggerapp.di.modules;

import android.app.Application;
import android.content.Context;

import com.rzerocorp.daggerapp.ui.credentials.CredentialsViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    CredentialsViewModel provideCredentialsViewModel() {
        return new CredentialsViewModel();
    }
}
