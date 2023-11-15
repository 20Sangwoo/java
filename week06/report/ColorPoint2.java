package reports6;
	class ColorPoints extends Point{
	   private String color;
	   public ColorPoints() {
	      super(0, 0);
	      this.color = "BLACK";
	   }
	   public ColorPoints(int x, int y) {
	      super(x, y);
	      this.color = "BLACK";
	   }
	   public void setXY(int x, int y) {
	      move(x, y);
	   }
	   public void setColor(String color) {
	      this.color = color;
	   }
	   public String toString() {
	      String tmp = color+"색의 ("+getX()+","+getY()+") 점";
	      return tmp;
	   }
	}
public class ColorPoint2 {
	public static void main(String[] args) {
		   ColorPoints zp = new ColorPoints();
		   System.out.println(zp.toString() + "입니다.");
		   ColorPoints cp = new ColorPoints(10, 10);
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");
		}
}
