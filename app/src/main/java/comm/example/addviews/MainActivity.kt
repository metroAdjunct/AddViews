package comm.example.addviews
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import comm.example.addviews.R.id.linearLayout

class MainActivity : AppCompatActivity() {
    val linearLayout: LinearLayout
        get() = findViewById(R.id.linearLayout)
    var flag = false
    var idCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        var f : Friend
        if(flag) f = Friend("Torgersen", "Hjalmar", "720-789-1234")
        else f = Friend("Karlssevni", "Bjorn", "720-789-0987")
        flag = !flag
        val textView = TextView(this)
        textView.text = f.toString()
        /*val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        textView.layoutParams = params */
        textView.textSize = 14F
        textView.setTextColor(Color.BLUE)
        linearLayout.addView(textView)

        addFriend(View(this))
        addFriend(View(this))
        //addFriend(View(this))

*/
    }
    fun addFriend(v: View) {
        // keep adding Hjalmar Torgersen - until we get a
        // real interface to add "real" people
        Log.d("FFF", "=============ENTERED ADDFRIEND =========")
        var f : Friend
        if(flag) f = Friend("Torgersen", "Hjalmar", "720-789-1234")
        else f = Friend("Karlssevni", "Bjorn", "720-789-0987")
        flag = !flag
        val textView = TextView(this)
        textView.text = f.toString()
        textView.setId(idCount++)
        if(flag) textView.setBackgroundColor(Color.rgb(150, 150, 255))
        else textView.setBackgroundColor(Color.rgb(255, 255, 50))
        /*val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        textView.layoutParams = params*/
        textView.textSize = 14F
        textView.setTextColor(Color.BLUE)
        linearLayout.addView(textView)

    }
}
class Friend(val lName:String, val fName: String, val phone: String) {
    override fun toString () : String {
        var s = "<<" + this.fName + " " + this.lName + " " + this.phone + ">>"
        return s

    }
}
