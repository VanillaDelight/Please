package Ec_Box;

public class Theater {

	private Seat[][] seats;

	private int rowCount, colCount;
	// row 행 col 열

	public Theater() {
	}
	// 5, 9
	public Theater(int rowCount, int colCount) {
		if (rowCount > 26) {
			rowCount = 26; // 알파벳은 26개밖에 없음.
		}

		seats = new Seat[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				seats[i][j] = new Seat();
			}
		}

		this.rowCount = rowCount;
		this.colCount = colCount;
		
	}
	
//    (t.reserve("김신의", 'A', 5, 2) ? "성공" : "실패"));
//    (t.reserve("이윤수", 'C', 1, 3) ? "성공" : "실패"));
//    (t.reserve("강영훈", 'D', 4, 7) ? "성공" : "실패"));
//    (t.reserve("문종모", 'C', 7, 3) ? "성공" : "실패"));

	public boolean reserve(String name, char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar) + 1;
		
		if (row > rowCount || col > colCount || col + numSeat - 1 > colCount) {
			return false;
		} else {
			for (int i = 0; i < numSeat; i++) {
				seats[row - 1][col + i - 1].reserve(name);
			}
			return true;
		}
	}

	public int cancel(String name) {
		int cancel_num = 0;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (seats[i][j].getName() != null && seats[i][j].getName().equals(name)) {
					seats[i][j].cancel();
					cancel_num++;
				}
			}
		}
		return cancel_num;
	}

	public int cancel(char rowChar, int col, int numSeat) {
		int row = getRowIndex(rowChar);
		int cancel_num = 0;
		col--;
		if (col + numSeat > colCount) {
			numSeat = colCount - col;
		}
		for (int i = 0; i < numSeat; i++) {
			if (seats[row][col + i].getName() != null) {
				seats[row][col + i].cancel();
				cancel_num++;
			}
		}
		return cancel_num;
	}

	public int getNumberOfReservedSeat() {
		int reserved_num = 0;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (seats[i][j].getName() != null) {
					reserved_num++;
				}
			}
		}
		return reserved_num;
	}

	public void printSeatMatrix() {
		System.out.print("  ");
		for (int i = 1; i <= colCount; i++) {
			System.out.print("  " + i);
		}
		System.out.println();

		for (int i = 0; i < rowCount; i++) {
			System.out.print((char) ('A' + i) + ": ");
			for (int j = 0; j < colCount; j++) {
				Seat s = seats[i][j];
				if (s.isOccupied()) {
					System.out.print("[O]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}

	private int getRowIndex(char uppercaseChar) {
		return uppercaseChar - 'A';
	}
}