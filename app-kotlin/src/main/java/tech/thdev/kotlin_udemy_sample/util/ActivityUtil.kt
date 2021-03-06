package tech.thdev.kotlin_udemy_sample.util

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import tech.thdev.kotlin_udemy_sample.constant.Constant
import tech.thdev.kotlin_udemy_sample.data.RecentPhotoItem
import tech.thdev.kotlin_udemy_sample.view.detail.DetailMoreActivity
import java.util.*

/**
 * Created by tae-hwan on 10/3/16.
 */

fun AppCompatActivity.replaceFragmentToActivity(fragment: Fragment, frameId: Int) {
    val transaction = this.supportFragmentManager.beginTransaction()
    transaction.replace(frameId, fragment)
    transaction.commit()
}

fun Context.createDetailIntent(list: ArrayList<RecentPhotoItem>, position: Int): Intent {
    return Intent(this, DetailMoreActivity::class.java).apply {
        putParcelableArrayListExtra(Constant.KEY_PHOTO_DATA, list)
        putExtra(Constant.KEY_SHOW_POSITION, position)
    }
}

fun Context.createDetailIntent(item: RecentPhotoItem)
        = createDetailIntent(arrayListOf(item), 0)