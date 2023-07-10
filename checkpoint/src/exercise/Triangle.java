package exercise;

public class Triangle {
    public Integer sideLength1;
    public Integer sideLength2;
    public Integer sideLength3;

    public Triangle(Integer sideLength1, Integer sideLength2, Integer sideLength3) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    public String TriangleType() {
        if (sideLength1 == sideLength2 && sideLength2 == sideLength3)
            return "Equilateral";
        if(sideLength1 != sideLength2 && sideLength2 != sideLength3){
            return "Isoceles"
        }
        return "scalene";
    }
}


