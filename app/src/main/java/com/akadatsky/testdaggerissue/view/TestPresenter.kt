package com.akadatsky.testdaggerissue.view

import javax.inject.Inject

class TestPresenter @Inject constructor() : TestContract.Presenter {

    @Inject
    lateinit var view: TestContract.View

    override fun init() {
        view.showMessage("Hello from TestPresenter!!!")
    }

}