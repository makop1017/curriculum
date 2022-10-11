/**
 * Task1-2 : 課題内容
 *
 * 本課題では、配列の使い方を学んでいきましょう。
 * 問①から問⑥まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * 問⑤,⑥については、コメントを入れてください。
 *
 */
public class Task1_2 {

    public static void main(String[] args) {

        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country={JAPAN,AMERICA,KOREA};

        // ② ①で作成した配列の要素数を出力してください。
        Syatem.our.println("配列countryの要素数..."+country.length);

        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        String[] stArray=new string[3];

         *   1番目（先頭）の要素に 「りんご」 を代入
        strArray[0]=りんご;

         *   2番目の要素に 「もも」 を代入
        strArray[1]=もも;

         *   3番目の要素に 「ぶどう」 を代入
        strArray[2]=ぶどう;

         */

        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        Syatem.out.println("strArray[1]..."+strArray[1])

        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [10,20,30,40,50を要素の値とする配列 intArrayを作成]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [⑤で作成した配列の2番目と5番目の要素を出力]
        System.out.println(intArray[1] + intArray[4]);

    }
}
