package kr.co.tjoeun.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ctrl + / : 해당 줄을 주석, 메모처럼 주석을 적자
        // xml 에 그려둔 Click Me 버튼이 눌렸다는걸 감지
        clickMeBtn.setOnClickListener {

            // 이 중괄호 코드가 clickMe 버튼이 눌리면 실행
            Log.d("버튼클릭", "ClickMeButton Push!")

        }

        // 두번째 버튼 클릭
        secondBtn.setOnClickListener {

            Log.d("버튼눌림", "두번째 버튼 눌림!!")
        }

    }
}