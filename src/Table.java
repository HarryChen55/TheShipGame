import java.util.Scanner;

class Table {

	private int TableSize; //棋盘大小
	
	@SuppressWarnings("resource")
	public void setTableSize() { //设置棋盘大小
		Scanner input = new Scanner(System.in);
		System.out.println("请选择棋盘大小...");
		System.out.println("1:9x9(6艘敌舰)   2:7x7(5艘敌舰)   3:5x5(3艘敌舰)");
		int x = input.nextInt();
		while (x!=1 && x!=2 && x!=3) {
			System.out.println("--------------------------------------");
			System.out.println("输入无效, 请重新输入...");
			System.out.println("1:9x9(6艘敌舰)   2:7x7(5艘敌舰)   3:5x5(3艘敌舰)");
			x = input.nextInt();
		}
		System.out.println("--------------------------------------");
		if (x == 1) {
			TableSize = 9;
			System.out.println("棋盘大小为:9x9(6艘敌舰)");
		} else if (x == 2) {
			TableSize = 7;
			System.out.println("棋盘大小为:7x7(5艘敌舰)");
		} else {
			TableSize = 5;
			System.out.println("棋盘大小为:5x5(3艘敌舰)");
			}
	}
	
	public int getTableSize() { //返回棋盘大小
		return TableSize;
	}
}