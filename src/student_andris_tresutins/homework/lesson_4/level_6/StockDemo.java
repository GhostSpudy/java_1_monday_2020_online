package student_andris_tresutins.homework.lesson_4.level_6;

class StockDemo {

    public static void main(String[] args) {
        Stock stock = new Stock("Tesla",10);
        stock.getPriceInformation();

        stock.updatePrice(18);//max
        stock.updatePrice(9);//min
        stock.updatePrice(12);//current
        stock.getPriceInformation();

    }
}
