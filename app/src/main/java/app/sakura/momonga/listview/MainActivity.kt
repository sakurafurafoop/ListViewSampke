package app.sakura.momonga.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val chapps: Dog = Dog("Chapps", 6)
    val mastardog: Dog = Dog("Mastardog",5)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogArray = arrayOf(chapps,mastardog)

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,dogArray)

        listView.adapter = adapter




    }
}
