package check;

import constants.Constants;

//課題①
//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
//なお、変数のアクセス修飾子は「private」とする。

//課題②
//【Check.java】にてfirstNameとlastNameを引数で受け取って、
//連結して表示させるメソッド「printName」を作成しなさい。
//作成した関数のアクセス修飾子は「private」とする。

//課題③
//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
	
	
public class Check{
			
	//①
			private String firstName ="髙田";
			private String lastName = "真琴";

			//②
			private void printName() {
				System.out.println("printNameメソッド → "+firstName+lastName);
			}
			
			//③
			public static void main(String[] args) {
				Check check = new Check();
				check.printName();
			
				Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
				pet.introduce();
				
				RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
				robot.introduce();
			}
			
}