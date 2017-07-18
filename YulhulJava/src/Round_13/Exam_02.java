package Round_13;

class AA{
	int x = 100;
}
class BB{
	AA ap = new AA();
	int y = 200;
 }
class CC{
	BB bp = new BB();
	int z = 300;
}

//Æ÷ÇÔ Object
public class Exam_02 {
	public static void main(String[] args) {
		CC cp = new CC();
		System.out.println("z = " + cp.z);
		System.out.println("y = " + cp.bp.y);
		System.out.println("x = " + cp.bp.ap.x);
		
		
	}
}
