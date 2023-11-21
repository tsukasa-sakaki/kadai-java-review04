package animal;

public class Review04 {

    public static void main(String[] args) {
        //Humanクラスのインスタンスを3つ作成
        Human tanaka = new Human("田中　太郎", 25, "電車");
        Human suzuki = new Human("鈴木　次郎", 30, "野球");
        Human Sato   = new Human("佐藤　花子", 20, "映画");

        //say/thinkメソッドの実行
        tanaka.say();
        tanaka.think();
        suzuki.say();
        suzuki.think();
        Sato.say();
        Sato.think();
    }

}
