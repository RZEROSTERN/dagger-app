package com.rzerocorp.daggerapp.di.modules;

import com.rzerocorp.daggerapp.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = AppModule.class)
    abstract MainActivity bindMainActivity();
}
