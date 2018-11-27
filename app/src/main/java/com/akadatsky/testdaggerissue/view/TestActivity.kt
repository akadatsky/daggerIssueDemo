package com.akadatsky.testdaggerissue.view

import android.os.Bundle
import com.akadatsky.testdaggerissue.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*
import javax.inject.Inject

class TestActivity : DaggerAppCompatActivity(), TestContract.View {

    @Inject
    lateinit var presenter: TestContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        presenter.init()
    }

    override fun showMessage(message: String) {
        textView.text = message
    }

}
