package com.lambdaschool.animatedlayoutdemocode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.Window
import androidx.core.content.ContextCompat
import com.lambdaschool.animatedlayoutdemocode.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetail : AppCompatActivity() {

    companion object {
        const val ITEM_KEY = "SHOPPING_ITEM"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Slide().setDuration(1988)
        window.exitTransition = Slide().setDuration(1000)


        setContentView(R.layout.activity_item_detail)

        val item = intent.getSerializableExtra(ITEM_KEY) as ShoppingItem

        item_name.text = item.formattedName
        item_image.setImageDrawable(ContextCompat.getDrawable(this, item.drawableId))
    }
}
