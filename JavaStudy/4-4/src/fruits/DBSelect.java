package fruits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ■ データベースに接続するプログラム
 * データベースに接続し、任意のカラムを表示させる処理。
 *
 * 問①〜問⑥までの回答をお願いします。
 *
 * 実行結果の提出に関しては、
 * いつも通りソースをコミットしていただきますが、
 * 今回は実行結果のスクリーンショットも合わせて提出していただきます。
 * 画像名はDBSelect.pngとして、4-4フォルダの中に入れ、これまでと同様に提出してください。
 *
 */

public class DBSelect {

    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    // 問① データベースのホスト名・データベース名を定数にしなさい。
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/tb_shohin";
    /** ・ユーザー名 */
    // 問② データベースのユーザー名を定数にしなさい。
    private static final String USER = "postgres";
    /** ・パスワード */
    // 問③ データベースのパスワードを定数にしなさい。
    private static final String PASS = "postgres";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(POSTGRES_DRIVER);
            // 問④ 問①〜③の定数を使ってデータベースと接続しなさい。
            connection = DriverManager.getConnection(
            "jdbc:postgresql://localhost/tb_shohin", "postgres", "postgres");
            statement = connection.createStatement();
            // 問⑤ SHOHIN_IDが001と020のものを表示させるためのSQL文を記述しましょう。
            String SQL1 = "INSERT INTO TB_SHOHIN(SHOHIN_ID, SHOHIN_NAME, TANKA)" + " VALUES('001', 'いちご', 500) ";
            String SQL2 = "INSERT INTO TB_SHOHIN(SHOHIN_ID, SHOHIN_NAME, TANKA)" + " VALUES('020', 'パイナップル', 800) ";
            resultSet = statement.executeQuery(SQL1);

            while (resultSet.next()) {
                // 問⑥ それぞれカラム名を入力してください。
                String column1 = resultSet.getString("商品コード");
                String column2 = resultSet.getString("商品名");
                int column3 = resultSet.getInt("値段");

                System.out.print(column1 + ",");
                System.out.print(column2 + ",");
                System.out.println(column3);
            }

        // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}