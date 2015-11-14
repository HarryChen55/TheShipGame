import java.util.Random;

class Location {
	
	private Location[] Location; //Location数组，用于储存XY坐标
	
	private int X1;	private int X2;	private int X3; //坐标
	private int Y1;	private int Y2;	private int Y3;
	
	
	public void setShip(int Size) {
		Location = new Location[1]; //初始化Location数组，用于储存XY坐标
		Location[0] = new Location();
        Random random = new Random(); //生成随机数x, y
        Location[0].X1 = random.nextInt(Size) % (Size - 1 + 1) + 1;
        Location[0].Y1 = random.nextInt(Size) % (Size - 1 + 1) + 1;
		if (Location[0].X1 <= 2 && Location[0].Y1 <= 2) { //情形1
			int direction = random.nextInt(2) % (2) + 1;
			if (direction == 1) { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else if (Location[0].X1 >=Size - 1 && Location[0].Y1 <= 2) { //情形2
			int direction = random.nextInt(2) % (2) + 1;
			if (direction == 1) { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else if (Location[0].X1 <= 2 && Location[0].Y1 >= Size - 1) { //情形3
			int direction = random.nextInt(2) % (2) + 1;
			if (direction == 1) { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else if (Location[0].X1 >= Size - 1 && Location[0].Y1 >= Size - 1) { //情形4
			int direction = random.nextInt(2) % (2) + 1;
			if (direction == 1) { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else if (Location[0].X1 >= 3 && Location[0].X1 <= Size - 2 && Location[0].Y1 <= 2) { //情形5
			int direction = random.nextInt(3) % (3) + 1;
			if (direction == 1) { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else if (direction == 2) { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			}
		} else if (Location[0].X1 >= Size - 1 && Location[0].Y1 <= Size - 2 && Location[0].Y1 >= 3) { //情形6
			int direction = random.nextInt(3) % (3) + 1;
			if (direction == 1) { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else if (direction == 2) { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else if (Location[0].X1 >= 3 && Location[0].X1 <= Size - 2 && Location[0].Y1 >= Size - 1) { //情形7
			int direction = random.nextInt(3) % (3) + 1;
			if (direction == 1) { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else if (direction == 2) { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			}
		} else if (Location[0].X1 <= 2 && Location[0].Y1 <= Size - 2 && Location[0].Y1 >= 3) { //情形8
			int direction = random.nextInt(3) % (3) + 1;
			if (direction == 1) { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else if (direction == 2) { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			}
		} else { //情形9
			int direction = random.nextInt(4) % (4) + 1;
			if (direction == 1) { //横向-右
				Location[0].X2 = Location[0].X1 + 1;
				Location[0].X3 = Location[0].X2 + 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			} else if (direction == 2) { //纵向-上
				Location[0].Y2 = Location[0].Y1 + 1;
				Location[0].Y3 = Location[0].Y2 + 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else if (direction == 3) { //纵向-下
				Location[0].Y2 = Location[0].Y1 - 1;
				Location[0].Y3 = Location[0].Y2 - 1;
				Location[0].X2 = Location[0].X1;
				Location[0].X3 = Location[0].X1;
			} else { //横向-左
				Location[0].X2 = Location[0].X1 - 1;
				Location[0].X3 = Location[0].X2 - 1;
				Location[0].Y2 = Location[0].Y1;
				Location[0].Y3 = Location[0].Y1;
			}
		}
	}
	
	public int getLocationX1() {
		return Location[0].X1;
	}
	
	public int getLocationX2() {
		return Location[0].X2;
	}
	
	public int getLocationX3() {
		return Location[0].X3;
	}
	
	public int getLocationY1() {
		return Location[0].Y1;
	}
	
	public int getLocationY2() {
		return Location[0].Y2;
	}
	
	public int getLocationY3() {
		return Location[0].Y3;
	}
}
