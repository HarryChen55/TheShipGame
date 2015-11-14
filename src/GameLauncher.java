import java.util.Scanner;

//GitHub Test From My GitHub

public class GameLauncher {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int ShipNum; //Ship的数量
		int PlayerX; int PlayerY; //玩家猜测的坐标
		int GuessCount; //玩家猜测的总次数
		int ShipRemain; //剩余敌舰数量
		
		int i; int a;
				
		System.out.println("游戏开始啦!!!");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		//选择棋盘大小
		Table Table = new Table();
		Table.setTableSize();
		
		//设置Ship坐标
		Ship Ship = new Ship();
		//System.out.println("Method:Ship");
		Ship.setShip(Table.getTableSize());
		
		//取出Ship坐标
		if (Table.getTableSize() == 9) {
			ShipNum = 6;
		} else if (Table.getTableSize() == 7) {
			ShipNum = 5;
		} else {
			ShipNum = 3;
		}
		Ship[] RealShip = new Ship[ShipNum]; //用于储存Ship的坐标
		i = 0;
		while (i<ShipNum) {
			RealShip[i] = new Ship();
			i++;
		}
		i = 0;
		while (i<ShipNum) {
			RealShip[i].X1 = Ship.getLocationX1(i);
			RealShip[i].X2 = Ship.getLocationX2(i);
			RealShip[i].X3 = Ship.getLocationX3(i);
			RealShip[i].Y1 = Ship.getLocationY1(i);
			RealShip[i].Y2 = Ship.getLocationY2(i);
			RealShip[i].Y3 = Ship.getLocationY3(i);
			i++;
		}
		
		//初始化击中记录等游戏数据
		Ship[] HitRecord = new Ship[Table.getTableSize()*Table.getTableSize()]; //用于储存用户攻击过的坐标
		for (i=0; i<(Table.getTableSize()*Table.getTableSize()); i++) {
			HitRecord[i] = new Ship();
			HitRecord[i].X = 395702;
			HitRecord[i].Y = 395702;
		}
		Ship[] ShipHitCount = new Ship[ShipNum]; //用于记录船被击中的次数
		for (i=0; i<ShipNum; i++) {
			ShipHitCount[i] = new Ship();
			ShipHitCount[i].n = 0;
		}
		ShipRemain = ShipNum;
		PlayerX = 0;
		PlayerY = 0;
		GuessCount = 0;
		
		System.out.println("电脑已摆好战舰，可以开始攻击");
		System.out.println("--------------------------------------");
		System.out.println("");
		
		
		
		//debug代码
		//System.out.println("");
		//System.out.println("!!!!!debug!!!!!");
		//System.out.println("ShipNum=" + ShipNum + "   " + "ShipRemain=" + ShipRemain + "   " + "GuessCount=" + GuessCount);
		//System.out.println("(PlayerX,PlayerY)=" + "(" + PlayerX + "," + PlayerY + ")");
		//for (i=0; i<ShipNum; i++) {
		//	System.out.println("第" + (i+1) + "艘船");
		//  System.out.println("X:  " + RealShip[i].X1 + "-" + RealShip[i].X2 + "-" + RealShip[i].X3);
		//	System.out.println("Y:  " + RealShip[i].Y1 + "-" + RealShip[i].Y2 + "-" + RealShip[i].Y3);
		//	System.out.println("ShipHitCount[" + i + "].n=" + ShipHitCount[i].n);
		//}
		//System.out.println("--------------------------------------");
		
		
		
		//游戏互动过程
		while (ShipRemain != 0) {
			//玩家输入x y坐标
			a = 1;
			for (i=0; i<(Table.getTableSize()*Table.getTableSize()); i++) {
				//System.out.println("取得玩家输入时for循环的起始数据: i=" + i + "; a=" + a);
				if (a == 1) {
					System.out.println("请输入X坐标(为1-" + Table.getTableSize() + "的整数)。"); //取得玩家猜测X
					Scanner inputX = new Scanner(System.in);
					PlayerX = inputX.nextInt();
					while (PlayerX<1 || PlayerX>Table.getTableSize()) {
						System.out.println("输入无效, 请重新输入...");
						PlayerX = inputX.nextInt();
					}
					System.out.println("请输入Y坐标(为1-" + Table.getTableSize() + "的整数)。"); //取得玩家猜测Y
					Scanner inputY = new Scanner(System.in);
					PlayerY = inputY.nextInt();
					while (PlayerY<1 || PlayerY>Table.getTableSize()) {
						System.out.println("输入无效, 请重新输入...");
						PlayerY = inputX.nextInt();
					}
				}
				if (PlayerX == HitRecord[i].X && PlayerY == HitRecord[i].Y) {
					System.out.println("你已经攻击过这个坐标(" + PlayerX + "," + PlayerY +")" + "，请重新输入...");
					System.out.println("");
					a = 1;
					i = -1;
				} else {
					a = 0;
				}
				//System.out.println("取得玩家输入时for循环的结束数据: i=" + i + "; a=" + a);
			}
			HitRecord[GuessCount].X = PlayerX; //记录玩家攻击过的坐标
			HitRecord[GuessCount].Y = PlayerY;
			GuessCount = GuessCount + 1;
			System.out.println("你攻击的坐标为:(" + PlayerX + "," + PlayerY + ")");
			//System.out.println("GuessCount=" + GuessCount + "   HitRecord[" + (GuessCount-1) + "].X=" + HitRecord[(GuessCount-1)].X + "    HitRecord[" + (GuessCount-1) + "].Y=" + HitRecord[(GuessCount-1)].Y);
			System.out.println("");
			
			//判断是否击中
			for (i=0; i<ShipNum; i++) {
				if (PlayerX == RealShip[i].X1 && PlayerY == RealShip[i].Y1) {
					ShipHitCount[i].n = ShipHitCount[i].n +1;
					if (ShipHitCount[i].n == 3) {
						ShipRemain = ShipRemain - 1;
						System.out.println("你击沉了1艘敌舰！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点1   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					} else {
						System.out.println("你击中了敌舰，但是没有击沉！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点1   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					}
				} else if (PlayerX == RealShip[i].X2 && PlayerY == RealShip[i].Y2) {
					ShipHitCount[i].n = ShipHitCount[i].n +1;
					if (ShipHitCount[i].n == 3) {
						ShipRemain = ShipRemain - 1;
						System.out.println("你击沉了1艘敌舰！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点2   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					} else {
						System.out.println("你击中了敌舰，但是没有击沉！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点2   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					}
				} else if (PlayerX == RealShip[i].X3 && PlayerY == RealShip[i].Y3) {
					ShipHitCount[i].n = ShipHitCount[i].n +1;
					if (ShipHitCount[i].n == 3) {
						ShipRemain = ShipRemain - 1;
						System.out.println("你击沉了1艘敌舰！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点3   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					} else {
						System.out.println("你击中了敌舰，但是没有击沉！！还有" + ShipRemain + "艘敌舰。");
						//System.out.println("点3   ShipHitCount[" + i + "].n=" + ShipHitCount[i].n + "   ShipRemain=" + ShipRemain);
						System.out.println("--------------------------------------");
						System.out.println("");
						break;
					}
				} else {
					if (i == (ShipNum-1)) {
						System.out.println("你没有击中，还有" + ShipRemain + "艘敌舰，请重新选择坐标...");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
				}
			}
		}
		System.out.println("恭喜！！你已将所有敌舰都送入海底！！");
		double aa = ShipNum*3;
		double bb = GuessCount;
		double rate = Math.round((aa/bb)*100);
		System.out.println("你一共使用了" + GuessCount + "发炮弹，击沉敌舰" + ShipNum + "艘，命中率为" + rate + "%");
	}
}
