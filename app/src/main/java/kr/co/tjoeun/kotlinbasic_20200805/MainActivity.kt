package kr.co.tjoeun.kotlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
            Toast.makeText(this, "Click Me 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

        // 두번째 버튼 클릭
        secondBtn.setOnClickListener {
            Log.d("버튼눌림", "두번째 버튼 눌림!!")
            Toast.makeText(this, "두번째 버튼 눌림!", Toast.LENGTH_SHORT).show()
        }

        // 복사하기 버튼이 눌리면 할 일
        copyBtn.setOnClickListener {
            //editText에 입력된 내용을 받아와서(임시저장) 문구 반영
            val inputMessage = msgEdit.text.toString()

            // 입력한 내용이 5글자가 안된다면, Toast 5자 이상 입력하라고 안내.
            // 5자 이상이면, 문구 반영

            if (inputMessage.length < 5) {
                Toast.makeText(this, "5자 이상 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            // 만약 5초과 10미만 이면 Log로 10글자 안된다.
            else if (inputMessage.length < 10) {
                Log.d("입력 글자 수", "5글자 이상이면서 10자 초과는 안됩니다.")
            } else {
                //문구 반영
                copyResultTxt.text = inputMessage

            }
        }
    }
}