package codingDojang;

import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AustralianVoting {

	public static void main(String[] args) throws FileNotFoundException {
		String path = AustralianVoting.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "/AustralianVoting.txt"));

		int n = Integer.valueOf(sc.nextLine());
		String[] v = new String[n];
		int[][] nn = new int[5][n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextLine();
		}

		int k = 0;
		while (sc.hasNextLine()) {
			for (int i = 0; i < n; i++) {
				nn[k][i] = sc.nextInt();
			}
			k++;
		}

		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < 5; j++) {
				list.add(nn[j][i]);
			}
			Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			Optional<Map.Entry<Integer, Long>> max = map.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

			if (max.get().getValue() > (k / 2)) {
				System.out.println();
				break;
			}

				System.out.println(map);
			// 탈락후보제거
		}
	}
}
