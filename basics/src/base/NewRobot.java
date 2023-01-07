package base;

public class NewRobot {
	public static void main(String[] args) {

		int xH = 5; // warehouse x coordinate
		int yH = 5; // warehouse y coordinate
		int xB = 3; // robot x coordinate
		int yB = 2; // robot y coordinate

		String d = "E"; // direction N E S W
		String path = "MLLMMRMM"; // "MMRMMLMMR"; // sc.next(); // steps or directions to rotate

//		---------------------------------------------------------
		
		char dir = 0; // E

		//int[][] matrix = new int[5][5];
		int count=0;
		for (int i = 0; i < path.length(); i++) {
			if(path.charAt(i)=='M') {
				count++;
			}
			else {
			while(count>0) {
			if (dir == 'N')
				yB++;
			else if (dir == 'E')
				xB++;
			else if (dir == 'S')
				yB--;
			else 
				xB--;
			count--;
			}
			count=0;
			dir= getDirection(path.charAt(i+1),dir);
			
			}
		}
		System.out.println(xB+" "+yB+" "+dir);
		
	}
	
	public static char getDirection(char dir, char Curr) {
		char tem = 0;
	switch (Curr) {
	case 'N':
	if(dir=='L'){
	 tem='W';
	}
	else{
	 tem='E';
	}

	case 'E':
	if(dir=='L'){
	 tem='N';
	}
	else{
	 tem='S';
	}

	case 'S':
	if(dir=='L'){
	tem='E';
	}
	else{
	 tem='W';
	}

	case 'W':
	if(dir=='L'){
	 tem='S';
	}
	else{
	 tem='N';
	}
	}
		
	return tem;
}
}