    package ladd.marshall.diceroler

    import android.os.Bundle
    import android.widget.Button
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity
    import com.example.diceroller.R
    import kotlin.random.Random


    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_roll)
        val textView: TextView = findViewById(R.id.text_view_number)

        button.setOnClickListener {
            textView.text = rollDice()
        }
    }

        fun rollDice(): String {
            return when (Random.nextInt(3) + 1) {
                1 -> "one"
                2 -> "two"
                else -> "three"
        }
    }
}
