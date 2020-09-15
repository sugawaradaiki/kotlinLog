package jp.techacademy.sugawara.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //インスタンス作成
        val human = Human("村下夏樹", 33, "ノルウェイの林")

        //自己紹介します
        human.say()

        //何を考えているかというと。。
        human.think()

//        val dog = Dog("ポチ", 3)  //名前をポチ、年齢が３歳でDogのインスタンスを作る
//
//        dog.move() //ポチが吠えます(ログ出力)
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "です。")
//
//        val  bigdog = BigDog("ヨーゼフ", 15) //名前をヨ－ゼフ、年齢15歳でBigDogインスタンスを作る
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "です。")
    }
}
