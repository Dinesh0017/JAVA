public class Circle extends Shape{

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public double calculateArea() throws RuntimeException {
            if (radius <= 0) {
                throw new RuntimeException("Invalid radius");
            }
            return Math.PI * radius * radius;
        }
    }

