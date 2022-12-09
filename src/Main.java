public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_853;
        int miles = service.calculate(cost);
        System.out.println("Количество миль - " + miles);
    }
}