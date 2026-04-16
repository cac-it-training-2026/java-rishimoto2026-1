package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int totalPrice = 0;

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < amounts.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);
			totalPrice += prices[i] * amounts[i];
		}
		if (totalPrice >= 5000) {
			int discountPrice = (int) (totalPrice * 0.9);
			int PriceWithTax = (int) (discountPrice * 1.1);
			System.out.println(
					"割引前合計：" + totalPrice + "円\n割引適用（10%OFF）：" + discountPrice + "円\n税込合計：" + PriceWithTax + "円");
		} else {
			int PriceWithTax = (int) (totalPrice * 1.1);
			System.out.println(
					"税抜合計：" + totalPrice + "円\n税込合計：" + PriceWithTax + "円");
		}
	}

}
