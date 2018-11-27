package com.akadatsky.testdaggerissue.di

import com.akadatsky.testdaggerissue.view.TestActivity
import com.akadatsky.testdaggerissue.view.TestContract
import com.akadatsky.testdaggerissue.view.TestPresenter
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector()
    abstract fun bindTestActivity(): TestActivity

    @Binds
    abstract fun bindTestActivity(activity: TestActivity): TestContract.View

    @Binds
    abstract fun bindTestPresenter(presenter: TestPresenter): TestContract.Presenter

}
