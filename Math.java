// class name math(rectangle,triangle,square,circle) jar 2 to state (length and breadth), 2 to behaviour (circumference,area)
public class Math{
    int rectanglebreadth,rectanglelength;
    int squareside;
    int circleradius;
    final double pi=3.14;
	int a,b,c;
    float base,h;
    int getrectanglecircumference(int rectanglebreadth, int rectanglelength){
        int rectanglecircumference=2*(rectanglebreadth+rectanglelength);
        return rectanglecircumference;
    }
    double getrectanglearea(int rectanglebreadth,int rectanglelength){
        double rectanglearea= rectanglebreadth*rectanglelength;
        return rectanglearea;
    }
    int getsquarecircumference(int squareside){
        int squarecircumference=4*squareside;
        return squarecircumference;
    }
    double getsquarearea(int squareside){
        int squarearea=squareside*squareside;
        return squarearea;
    }
    double getcirclecircumference(int circleradius){
        double circlecircumference=2*pi*circleradius;
        return circlecircumference;
    }
    double getcirclearea(int circleradius){
        double circlearea=pi*circleradius*circleradius;
        return circlearea;
    }
	int gettrianglecircumference(int a,int b,int c){
		int s=a+b+c;
		return s;
	}
	double gettrianglearea(int base, int h){
		double trianglearea=(base*h)/2;
		return trianglearea;
	}
	
    public static void main(String[] args) {
        Math m1=new Math();
        int m2=m1.getrectanglecircumference(10,20);
        System.out.println(m2);
        double m3=m1.getrectanglearea(10,20);
        System.out.println(m3);
        int m4=m1.getsquarecircumference(5);
        System.out.println(m4);
        double m5=m1.getsquarearea(5);
        System.out.println(m5);
        double m6=m1.getcirclecircumference(6);
        System.out.println(m6);
        double m7= m1.getcirclearea(6);
        System.out.println(m7);
		int m8=m1.gettrianglecircumference(4,3,2);
		System.out.println(m8);
		double m9=m1.gettrianglearea(4,13);
		System.out.println(m9);
    }
    
}