import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class User {
	//カメラができなかったので大体の動きだけになってしまった
	public void camera() {
		//画像読み込み、カメラの代わり
		String mark = "C:\\Users\\伊藤　翔哉\\Pictures\\洗濯マーク.png"; //””の中はファイルの場所

		User instA;
		instA = new User();
		instA.readMark(mark);

	}

	public void readMark(String mark) {

		//カメラから読み込まれたデータ
		try {
			BufferedImage markPicture = ImageIO.read(new File(mark));
			//読み込んだ画像をマーク管理の検索に送る,すいません変数は後で合わせてください
			Mark instA;
			instA = new Mark();
			Object s = instA.mark(markPicture);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	//マーク申請のメソッド
	public void applicationMark(String mark) {

		//画像データを読み込み
		try {
			BufferedImage markPicture = ImageIO.read(new File(mark));
			//読み込んだ画像をマーク管理の申請に送る
			Mark instA;
			instA = new Mark();
			instA.mark(markPicture);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
