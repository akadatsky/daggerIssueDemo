package com.akadatsky.testdaggerissue.view

interface TestContract {

    interface View {
        fun showMessage(message: String)
    }

    interface Presenter {
        fun init()
    }

}