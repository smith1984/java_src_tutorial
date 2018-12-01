package Cp_3;

public enum Operation {
    PLUS {
        double eval(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double eval(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double eval(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        double eval(double x, double y) {
            return x / y;
        }
    };

    abstract double eval(double x, double y);
    public static void main(String[] args){
        double x = -23.567, y = 0.235;
        for (Operation op: Operation.values())
            System.out.println(op.eval(x, y));
    }
}
