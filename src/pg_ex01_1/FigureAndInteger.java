package pg_ex01_1;

public class FigureAndInteger {

	public static void main(String[] args) {

		// for関数を用いて1-100の整数を順に出力する
		for (int n = 1 ; n < 101 ; n++){

			// if文による条件分岐
			// ①[4で割り切れる]   	かつ [3で割り切れる]	 	→ '◆'を出力
			// ②[4で割り切れる] 	かつ [3で割り切れない]     	→ '□'を出力
			// ③[4で割り切れない] 	かつ [3で割り切れる]	   	→ '△'を出力
			// ④上記に該当しない					→ 数字を出力
			if ( n % 4 == 0 && n % 3 == 0 ){		//条件分岐①
				System.out.println('◆');
			}else if ( n % 4 == 0 && n % 3 != 0 ){		//条件分岐②
				System.out.println('□');
			}else if ( n % 4 != 0 && n % 3 == 0 ){		//条件分岐③
				System.out.println('△');
			}else{						//条件分岐④
				System.out.println(n);
			}

		}
	}

}
