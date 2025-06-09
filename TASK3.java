class ElseIfExample {
    public static void main(String[] args) {
        System.out.println("Weather forecast:");

        int rainy = 10;
        int normal = 6;
        int cloudy = 3;

        if (rainy >= normal) {
            System.out.println("Today is a rainy day: " + rainy);
        
            if (rainy >= cloudy) {
                System.out.println("Cloudy index: " + cloudy);
            } else if (cloudy >= normal) {
                System.out.println("Normal index: " + normal);
            }
        }
    }
}
