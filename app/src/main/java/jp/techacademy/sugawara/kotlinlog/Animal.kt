package jp.techacademy.sugawara.kotlinlog

/*
未定義の状態で宣言のみ行う抽象クラス
 */

abstract class Animal {
    //プロパティ
    var name: String
    var age: Int
    var hobby:String

    //引数付きコンストラクタ
    constructor(name: String, age:Int, hobby:String){
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    //抽象関数
    abstract fun say()
}