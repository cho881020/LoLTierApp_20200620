package kr.co.namu.loltierapp_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        계산하기 버튼이 눌리면
        calculateBtn.setOnClickListener {

//            입력한 점수가 몇점인지? 숫자로 변경.
            val mmrScore = mmrScoreEdt.text.toString().toInt()


//        MMR - 1250 미만 : 브론즈
//        1250 ~ 1500 : 실버
//        1500 ~ 1800 : 골드
//        1800 ~ 2200 : 플레티넘
//        그 이상 : 다이아

            if (mmrScore < 1250) {
                tierTxt.text = "당신은 브론즈 입니다. 당신은 '아 저게 사네' 라는 말을 많이 하겠군요."
            }
            else if (mmrScore < 1500) {
                tierTxt.text = "당신은 실버 입니다. '제가 캐리함'이란 말을 많이 하겠군요."
            }
            else if (mmrScore < 1800) {
                tierTxt.text = "당신은 골드 입니다. '아니' 란 말을 많이합니다."
            }
            else if (mmrScore < 2200) {
                tierTxt.text = "당신은 플레 입니다. 특징이 없군요."
            }
            else {
                tierTxt.text = "당신은 다이아 입니다. '미드 오픈' 이란 말을 많이 하겠군요."
            }


        }


    }
}