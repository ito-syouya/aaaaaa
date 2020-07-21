import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class User {

	public static void main(String[] args) {

		String inputname = "画像のファイル名";

		User instA;
		instA = new User();
		instA.user(inputname);

	}

	public void user(String inputname) {

		//本来はカメラで読み込みだけど今回は入力ファイルから画像データを読み込み
		try {
			BufferedImage bImage = ImageIO.read(new File(inputname));
			//読み込んだ画像をマーク管理に送る
			Mark instA;
			instA = new Mark();
			String kekka = instA(bImage);
			if (kekka == null) //帰ってきた結果がnullならマーク申請へ追加
				;

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}