package programmers.lv2.quiz87377;

import java.util.ArrayList;

public class MySolution {
	
	public static void main(String[] args) {
		
		int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
		Solution solution = new Solution(); 
		String[] answer = solution.solution(line);
		for (String ans : answer) System.out.println(ans);
		
	}
}


class Solution {

	int maxX;
	int maxY;

	ArrayList<int[]> findGyojum(int[][] line) {
		/* 교점 좌표 
		 * Ax + By + E = 0
		 * Cx + Dy + F = 0
		 * 
		 * X = (BF - ED) / (AD - BC)
		 * Y = (EC - AF) / (AD - BC)
		 */
		ArrayList<int[]> gyojums = new ArrayList<>();
		for (int i=0; i<line.length; i++) {
			int a = line[i][0];
			int b = line[i][1];
			int e = line[i][2];
			for (int j=i; j<line.length; j++) {
				int c = line[j][0];
				int d = line[j][1];
				int f = line[j][2];

				if (a*d == b*c) continue; // ad-bc = 0 이면 평행 or 일치
				if ((b*f-e*d)%(a*d-b*c) != 0) continue; // 교점 x 좌표 정수 아님
				if ((e*c-a*f)%(a*d-b*c) != 0) continue; // 교점 y 좌표 정수 아님

				int x = (b*f-e*d)/(a*d-b*c);
				int y = (e*c-a*f)/(a*d-b*c);
				int[] gyojum = {x, y};
				gyojums.add(gyojum);
			}
		}
		return gyojums;
	}

	ArrayList<int[]> fixGyojums(ArrayList<int[]> gyojums) {
		int minx = gyojums.get(0)[0];
		int maxx = gyojums.get(0)[0];
		int miny = gyojums.get(0)[1];
		int maxy = gyojums.get(0)[1];

		for(int[] gyojum : gyojums) {
			if (gyojum[0] < minx) minx = gyojum[0];
			if (gyojum[0] > maxx) maxx = gyojum[0];
			if (gyojum[1] < miny) miny = gyojum[1];
			if (gyojum[1] < maxy) maxy = gyojum[1];
		}

		maxX = maxx - minx;
		maxY = maxy - miny;

		for(int[] gyojum : gyojums) {
			gyojum[0] -= minx;
			gyojum[1] -= miny;
		}

		return gyojums;
	}

	String drawStar(String before, int index) {
		StringBuilder sb = new StringBuilder(before);
		char star = '*';
		sb.setCharAt(index, star);
		String newString = sb.toString();
		return newString;
	}

    public String[] solution(int[][] line) {
    	ArrayList<int[]> gyojums = findGyojum(line);
		gyojums = fixGyojums(gyojums);
        // String[] answer = {};
		String[] answer = new String[maxY+1]; // 0~10 이면 size 11인데 max는 10
		String strDot = "";
		for (int i=0; i<maxX+1; i++) strDot += ".";
		for (int i=0; i<answer.length; i++) answer[i] = strDot; // * 찍기전 모두 .으로 크기 조절

		for (int[] gyojum : gyojums) {
			int index = maxY - gyojum[1] -1;
			String newStar = drawStar(answer[index], gyojum[0]);
			answer[index] = newStar;
		}

		for (String a : answer) {
			System.out.println(a);
		}
        return answer;
    }
}