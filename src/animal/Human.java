package animal;

public class Human extends Animal implements Thinkable{
    //フィールド　カプセル化
    private String hobby;

    //getter/setter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //引数なしのコンストラクタ
    public Human() {
    }

    //引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);  //スーパークラスのコンストラクタを利用
        this.hobby  = hobby;
    }

    //Thinkableのオーバーライド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
