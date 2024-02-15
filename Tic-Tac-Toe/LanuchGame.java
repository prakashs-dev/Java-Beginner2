package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
	static char[][] borad;

	public TicTacToe() {
		borad = new char[3][3];
		initBorad();
	}

	static void initBorad() {
		for (int i = 0; i < borad.length; i++) {
			for (int j = 0; j < borad[i].length; j++) {
				borad[i][j] = ' ';
			}
		}
	}

	static void displayBorad() {
		System.out.println("-------------");
		for (int i = 0; i < borad.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < borad[i].length; j++) {
				System.out.print(borad[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	static void placeMark(int row, int col, char mark) {
		if ((row >= 0 && row <= 2) && (col >= 0 && col <= 2)) {
			borad[row][col] = mark;
		} else {
			System.out.println("Invaild Position");
		}
	}

	static boolean checkWinCol() {
		for (int j = 0; j <= 2; j++) {
			if (borad[0][j] != ' ' && borad[0][j] == borad[1][j] && borad[1][j] == borad[2][j]) {
				return true;
			}
		}
		return false;
	}

	static boolean checkWinRow() {
		for (int i = 0; i <= 2; i++) {
			if (borad[i][0] != ' ' && borad[i][0] == borad[i][1] && borad[i][1] == borad[i][2]) {
				return true;
			}
		}
		return false;
	}

	static boolean checkDiagonalWin() {
		if (borad[0][0] != ' ' && (borad[0][0] == borad[1][1] && borad[1][1] == borad[2][2])
				|| borad[0][2] != ' ' && (borad[0][2] == borad[1][1] && borad[1][1] == borad[2][0])) {
			return true;
		} else {
			return false;
		}
	}

	static boolean checkDrawGame() {
		for (int i = 0; i < borad.length; i++) {
			for (int j = 0; j < borad[i].length; j++) {
				if (borad[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}

abstract class Player {
	String name;
	char mark;

	abstract void makeMove();

	boolean isValidMove(int row, int col) {
		if ((row >= 0 && row <= 2) && (col >= 0 && col <= 2)) {
			if (TicTacToe.borad[row][col] == ' ') {
				return true;
			}
		}
		return false;
	}
}

class HumanPlayer extends Player {

	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row, col;
		do {
			System.out.println("Enter the row and col : ");
			row = sc.nextInt();
			col = sc.nextInt();
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}

class AIPlayer extends Player {

	public AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row, col;
		do {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}

public class LanuchGame {

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Alice", 'X');
		AIPlayer p2 = new AIPlayer("AI", 'O');

		Player curnPlayer;
		curnPlayer = p1;

		while (true) {
			System.out.println(curnPlayer.name + " it's your turn ");
			curnPlayer.makeMove();
			TicTacToe.displayBorad();
			if (TicTacToe.checkWinRow() || TicTacToe.checkWinCol() || TicTacToe.checkDiagonalWin()) {
				System.err.println(curnPlayer.name + " has won the Game");
				break;
			} else if (TicTacToe.checkDrawGame()) {
				System.err.println("Game is Draw");
				break;
			} else {
				if (curnPlayer == p1) {
					curnPlayer = p2;
				} else {
					curnPlayer = p1;
				}
			}
		}
	}
}
