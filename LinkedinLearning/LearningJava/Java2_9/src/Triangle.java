public class Triangle {  //Triangle is a class

        static int numOfSides = 3;  // static variable

        double base;       // non static instance variables
        double height;
        double sideLenOne;
        double sideLenTwo;
        double sideLenThree;

        public Triangle(double base, double height,
                        double sideLenOne, double sideLenTwo,
                        double sideLenThree){
            this.base = base;
            this.height = height;
            this.sideLenOne = sideLenOne;
            this.sideLenTwo = sideLenTwo;
            this.sideLenThree = sideLenThree;
        }

        public double findArea(){    //Custom-built instance method
            return (this.base * this.height) / 2;
        }
}
