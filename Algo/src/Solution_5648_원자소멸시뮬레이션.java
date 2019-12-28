import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution_5648_원자소멸시뮬레이션 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int energy = 0;
			List<int[]> atomList = new LinkedList<int[]>();
			for (int i = 0; i < N; i++) {
				int x = (sc.nextInt() + 1000) * 2;
				int y = (sc.nextInt() + 1000) * 2;
				byte d = sc.nextByte();
				byte e = sc.nextByte();
				atomList.add(new int[] {x, y, d, e});
			}
			Comparator<int[]> comp = new Comparator<int[]>(){
				@Override
				public int compare(int[] a, int[] b) {
					if(a[0] == b[0]) {
						return a[1] - b[1];
					}
					return a[0] - b[0];
				}
			};
			for (int i = 0; i <= 4002; i++) {
				if(atomList.size() <= 1) break;
				for (int j = 0; j < atomList.size(); j++) {
					int[] temp = atomList.get(j);
					if(temp[2] == 0) {
						if(temp[1] + 1 > 4000) {
							atomList.remove(j--);
							continue;
						}
						temp[1]++;
					} else if(temp[2] == 1) {
						if(temp[1] - 1 < 0) {
							atomList.remove(j--);
							continue;
						}
						temp[1]--;
					} else if (temp[2] == 2) {
						if(temp[0] - 1 < 0) {
							atomList.remove(j--);
							continue;
						}
						temp[0]--;
					} else {
						if(temp[0] + 1 > 4000) {
							atomList.remove(j--);
							continue;
						}
						temp[0]++;
					}
				}
				Collections.sort(atomList, comp);
				int start = 0;
				int end = 0;
				boolean same = false;
				for (int j = 0; j < atomList.size() - 1; j++) {
					if(!same && atomList.get(j)[0] == atomList.get(j + 1)[0] 
							&&atomList.get(j)[1] == atomList.get(j + 1)[1]) {
						same = true;
						start = j;
						end = j + 1;
					} else if(same && atomList.get(j)[0] == atomList.get(j + 1)[0] 
							&& atomList.get(j)[1] == atomList.get(j + 1)[1]) {
						end = j + 1;
					} else if (same && (atomList.get(j)[0] != atomList.get(j + 1)[0] 
							|| atomList.get(j)[1] != atomList.get(j + 1)[1])) {
						for (int k = start; k <= end; k++) {
							energy += atomList.remove(start)[3];
						}
						j -= end - start;
						same = false;
					}
				}
				for (int k = start;start != end && k <= end; k++) {
					energy += atomList.remove(start)[3];
				}
			}
			System.out.println("#" + tc + " " + energy);
		}
	}
}
