package jp.techacademy.sugawara.kotlinlog

import android.util.Log

open class Human:Animal,Thinkable {

    //プロパティ
    var hobby:String

    //引数コンストラクタ
    //クラスからインスタンスが生成される際に呼び出される初期化メソッド
    constructor(name:String, age:Int, hobby:String):super(name, age){
        this.hobby = hobby
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    //Thinkableインターフェスのメソッドをオーバーライド
    override fun think(){
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }


}