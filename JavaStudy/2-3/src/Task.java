package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task{

    protected Calculator(){
    
    }
    protected Calculator(int a,int b){

    }
    protected Calcuiator(int a,int b,int c){

    }
}

    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
        int a = 11;
        int b = 30;
        int c = 100;

        public int plus(){
        
    	System.out.println("plusメソッドの引数が1つの場合:" + int a);
        System.out.println("plusメソッドの引数が2つの場合:" + int b);
        System.out.println("plusメソッドの引数が3つの場合:" + int c);
    }

}